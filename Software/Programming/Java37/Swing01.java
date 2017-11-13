import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Swing01 extends JFrame {
	
	public Swing01() {
		setSize(300, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		add(panel);
		
		panel.setBackground(Color.GREEN);
		
		JLabel lable = new JLabel("Jeff");
		panel.add(lable);
		
		// setBackground(Color.CYAN);
		// this doesn't work - use getContentPane()
		// most of the getContentPane() was removed after Java 1.5,
		// but this is an exception of that
		// getContentPane().setBackground(Color.CYAN);
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new Swing01();
	}
}
