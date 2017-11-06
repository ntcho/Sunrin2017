import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Swing04 extends JFrame {
	
//	Null layout example
	
	public Swing04() {
		setTitle("null");
		setSize(200, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);
		
		JButton btn1 = new JButton("One");
		btn1.setBounds(10, 10, 100, 50);
		
		JButton btn2 = new JButton("Two");
		btn2.setBounds(100, 100, 100, 50);
		
		c.add(btn1);
		c.add(btn2);
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new Swing04();
	}

}
