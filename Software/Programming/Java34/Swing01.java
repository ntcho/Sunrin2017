import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Swing01 {
	public static void main(String[] args) {
		JFrame frame = new JFrame();

		frame.setVisible(true);
		frame.setSize(new Dimension(1280, 720));
		// this kills the process on exit
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Hello");

		JLabel label = new JLabel("Hello world");
		frame.add(label);

		JButton button = new JButton("Set zum as your homepage");
		button.addMouseListener(new CustomListener());
		frame.add(button);

		frame.setLayout(new FlowLayout());
	}
}
