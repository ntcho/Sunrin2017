import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Swing02 extends JFrame {
	
//	BorderLayout example
	
	public Swing02() {
		setTitle("BorderLayout");
		setSize(200, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		c.add(new JButton("NORTH"), BorderLayout.NORTH);
		c.add(new JButton("SOUTH"), BorderLayout.SOUTH);
		c.add(new JButton("CENTER"), BorderLayout.CENTER);
		c.add(new JButton("WEST"), BorderLayout.WEST);
		c.add(new JButton("EAST"), BorderLayout.EAST);
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new Swing02();
	}

}
