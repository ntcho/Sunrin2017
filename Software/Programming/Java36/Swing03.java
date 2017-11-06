import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Swing03 extends JFrame {
	
//	GridLayout example
	
	public Swing03() {
		setTitle("GridLayout");
		setSize(200, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new GridLayout(3, 2));
		c.add(new JButton("Btn1"));
		c.add(new JButton("Btn2"));
		c.add(new JButton("Btn3"));
		c.add(new JButton("Btn4"));
		c.add(new JButton("Btn5"));
		c.add(new JButton("Btn6"));
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new Swing03();
	}

}
