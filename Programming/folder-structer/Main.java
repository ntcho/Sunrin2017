import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

/*
 Pre-Digital-Content-Contest code
 */

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String parentFolder;

        // select drive
        while (true) {
            print("Please select drive to use: ");
            parentFolder = scanner.nextLine();
            if (parentFolder.length() > 1) {
                printError("drive letter should be 1 character");
            } else {
                if (new File(parentFolder += ":\\").exists()) {
                    // check drive exist
                    break;
                } else {
                    printError("drive " + parentFolder + " was not found");
                }
            }
        }

        // select folder
        while (true) {
            File currentFiles[] = new File(parentFolder).listFiles();
            printFolder(currentFiles);
            print("Enter folder name to continue, or leave empty to break: ");
            String value = scanner.nextLine();
            if (value == null || value.length() == 0) {
                value = null;
            } else {
                // search match
                File match = searchInFileList(currentFiles, value);
                if (match != null) {
                    parentFolder = match.getAbsolutePath();
                }
            }

            if (value == null) {
                // set this as parent folder
                println("Parent folder location set to [" + parentFolder + "]");
                break;
            }
        }

        File folder = new File(parentFolder);

        println("Selected folder location: " + folder.getAbsolutePath());
        println("Contents of selected folder: ");
        printFolder(folder.listFiles());

        File exampleFolder;

        while (true) {
            print("Please select example folder to select subfolder: ");
            exampleFolder = searchInFileList(folder.listFiles(), scanner.nextLine());
            if (exampleFolder != null) {
                break;
            }
        }

        println("Contents of example folder: ");
        printFolder(exampleFolder.listFiles());

        ArrayList<String> removeFolderName = new ArrayList<>();

        // select remove folder
        while (true) {
            print("Please select subfolder to remove and move, or leave empty to break (input clear() to clear the list): ");
            String removeFolder = scanner.nextLine();
            if (removeFolder == null || removeFolder.length() == 0) {
                break;
            } else if (removeFolder.equals("clear()")) {
                removeFolderName.clear();
                printLog("remove list cleared");
            } else {
                if (searchInFileList(
                        exampleFolder.listFiles(),
                        removeFolder.replaceAll("/", "\\")) != null) {
                    removeFolderName.add(removeFolder);
                    printLog("[" + removeFolder + "] added to remove list");
                }
            }
        }

        // confirm move
        while (true) {
            printFolder(folder.listFiles());
            print("All these folders will be converted. Continue? [Y/N]: ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("y")) {
                // continue
                break;
            } else if (input.equalsIgnoreCase("n")) {
                while (true) {
                    print("All progress will be lost. Quit? [Y/N]: ");
                    input = scanner.nextLine();
                    if (input.equalsIgnoreCase("y")) {
                        // continue
                        // quit
                        printLog("terminating the program.");
                        return;
                    } else if (input.equalsIgnoreCase("n")) {
                        break;
                    }
                }
            }
        }

        // move in progress
        println("Starting move...");

        int folderCount = 0;
        int errorCount = 0;

        for (File selectedFolder : folder.listFiles()) {
            for (int i = 0; i < removeFolderName.size(); i++) {
                File removeFolder = new File(selectedFolder.getAbsolutePath() + "\\" + removeFolderName.get(i));
                if (removeFolder.exists()) {
                    printLog("moving   folder [" + removeFolder.getAbsolutePath() + "] to [" + selectedFolder.getAbsolutePath() + "]");
                    errorCount += moveFolderContent(removeFolder, selectedFolder);
                    printLog("removing folder [" + removeFolder.getAbsolutePath() + "]");
                    errorCount += deleteFolder(removeFolder);
                    folderCount++;
                }
            }
        }

        printLog("finished structing " + folderCount + " folders with " + errorCount + " error(s)");
        scanner.close();
    }

    static void print(Object object) {
        System.out.print(object.toString());
    }

    static void println(Object object) {
        System.out.println(object.toString());
    }

    static void printLog(String message) {
        println("Log  : " + message);
    }
    
    static void printError(String message) {
        println("Error: " + message);
    }

    static void printFolder(File files[]) {
        for (File file : files) {
            if (file.isDirectory()) {
                // only output folders
                println("- " + file.getName());
            }
        }
    }
    
    private static File searchInFileList(File list[], String name) {
        String folderName = name.replaceAll("\\u0020", "%20").replaceAll("/", "\\");
        if (folderName.equalsIgnoreCase("..")) {
            // move parent
            return list[0].getParentFile().getParentFile();
        } else if (folderName.endsWith("*")) {
            int count = 0;
            int index = -1;

            for (int i = 0; i < list.length; i++) {
                File folder = list[i];
                if (folder.isDirectory()) {
                    if (folder.getName().startsWith(folderName.replace("*", ""))) {
                        // match found with regex
                        index = i;
                        count++;
                    }
                }
            }

            if (count == 0) {
                // not found
                printError("no folder found with regex [" + folderName + "]");
                return null;
            } else if (count >= 2) {
                // multiple value found
                printError(count + " folders found with regex [" + folderName + "]");
                return null;
            } else {
                return list[index];
            }
        } else {
            for (File folder : list) {
                if (folder.isDirectory()) {
                    if (folder.getName().equals(folderName)) {
                        return folder;
                    }
                }
            }
            printError("no folder found with name [" + folderName + "]");
            return null;
        }
    }

    private static int moveFolderContent(File source, File target) {
        // all variables are folders
        if (source.isDirectory() && target.isDirectory()) {
            int error = 0;
            for (File file : source.listFiles()) {
                try {
                    // move file
                    if (file.getName().startsWith(".")) {
                        // removing file starting with .
//                        if (file.delete()) {
//                            printLog("deleted file [" + file.getName() + "]");
//                        } else {
//                            printError("failed to delete file [" + file.getName() + "]");
//                            error++;
//                        }
                    } else {
                        Files.move(file.toPath(), Paths.get(target.toPath() + "\\" + file.getName()), REPLACE_EXISTING);
                        printLog("file [" + file.getName() + "] moved to [" + target.getAbsolutePath() + "]");
                    }
                } catch (IOException e) {
                    printError("failed to move file [" + file.getName() + "] to [" + target.getAbsolutePath() + "]");
                    e.printStackTrace();
                    error++;
                }
            }
            return error;
        } else {
            printError("parameters are not folder");
            return 1;
        }
    }

    private static int deleteFolder(File folder) {
        if (folder.delete()) {
            printLog("deleted  folder [" + folder.getAbsolutePath() + "]");
            return 0;
        } else {
            printError("failed to delete folder [" + folder.getAbsolutePath() + "]");
            return 1;
        }
    }
}
