import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Swing05 extends JFrame {
	
//	Null layout example
	
	public Swing05() {
		setTitle("Keypad");
		setSize(300, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new GridLayout(4, 3));

		for (int i = 1; i < 10; i++) {
			c.add(new JButton(String.valueOf(i)));
		}
		
		c.add(new JButton("*"));
		c.add(new JButton("0"));
		c.add(new JButton("#"));
		
		setResizable(false);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Swing05();
	}

}
