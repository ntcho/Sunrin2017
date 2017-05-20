import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Main {

    private static String getHTML(String urlToRead) {
        try {
            println("Requested           '" + urlToRead + "'");
            StringBuilder result = new StringBuilder();
            URL url = new URL(urlToRead);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line;
            while ((line = rd.readLine()) != null) {
                result.append(line);
            }
            rd.close();
            return result.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private static void writeFile(String fileNameRelative, String writeString) {
        try {
            PrintWriter printWriter = new PrintWriter(getCurrentPath() + "/" + fileNameRelative);
            printWriter.println(writeString);
            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String[] readFile(String fileNameRelative) {
        try {
            ArrayList<String> stringArrayList = new ArrayList<>();
            BufferedReader br = new BufferedReader(new FileReader(getCurrentPath() + "/" + fileNameRelative));
            while (true) {
                String line = br.readLine();
                if (line == null) {
                    break;
                } else {
                    stringArrayList.add(line);
                }
            }
            br.close();
            String returnString[] = new String[stringArrayList.size()];
            returnString = stringArrayList.toArray(returnString);
            return returnString;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static String getCurrentPath() {
        Path currentRelativePath = Paths.get("");
        String pathString = currentRelativePath.toAbsolutePath().toString();
        return pathString;
    }

    private static String getMeaningFromRequest(String requestString) {
        int stringStartIndex = requestString.indexOf("<p>[명사]") + 8;
//        println(stringStartIndex);
        int stringFinishIndex = requestString.indexOf("</p>", stringStartIndex);
//        println(stringFinishIndex);
        if (stringStartIndex == stringFinishIndex) {
            // empty string or two meanings
            stringStartIndex = requestString.indexOf("<p>[명사] </p>") + 12;
            stringFinishIndex = requestString.indexOf("</ul>", stringStartIndex);
            requestString = requestString.substring(stringStartIndex, stringFinishIndex);
            requestString = requestString.replaceAll("\\s\\s", "");
        } else {
            requestString = requestString.substring(stringStartIndex, stringFinishIndex);
        }
        requestString = requestString.replaceAll("\\<.*?\\>", "");
        requestString = requestString.replaceAll("&\\w+;", "");
        if (requestString.startsWith(" [같은 말]")) {
            // has a same meaning
            requestString = " " + requestString.substring(requestString.indexOf("(") + 1, requestString.indexOf(")")) + ".";
        }
        return requestString;
    }

    public static void main(String[] args) {
        String baseUrl = "http://krdic.naver.com/search.nhn?query=";
        String finalString = "";
        String words[] = readFile("words.txt");
        for (String word : words) {
            String meaning = getMeaningFromRequest(getHTML(baseUrl + word + "&kind=all"));
            println("Word read from file '" + word + "'");
            println("Returned            '" + meaning + "'");
            finalString += word + " : " + meaning + "\n";
        }
        writeFile("words_meaning.txt", finalString);
    }

    private static void println(Object object) {
        System.out.println(object.toString());
    }
}
