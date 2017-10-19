import javax.swing.JOptionPane;

public class PaneAPI {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "KEK Hello world");
		// makes a simple dialog with a [Confirm] button
		String name = JOptionPane.showInputDialog("Input string value");
		// gets an input from a dialog
		JOptionPane.showMessageDialog(null, name);
		// print the input string to another dialog
		while (true) {
			JOptionPane.showMessageDialog(null, "Don't click confirm, " + name);
			// infinite loop
			// press red stop button on console
		}
	}

}
