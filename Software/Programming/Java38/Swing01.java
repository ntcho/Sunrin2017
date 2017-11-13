import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Swing01 extends JFrame {
	
	public Swing01() {
		setSize(200, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		panel.add(new JButton("1"));
		panel.add(new JButton("2"));
		panel.add(new JButton("3"));
		panel.add(new JButton("4"));
		c.add(panel, BorderLayout.NORTH);

		JPanel panel2 = new JPanel();
		panel2.setLayout(new GridLayout(2, 2));
		panel2.add(new JButton("5"));
		panel2.add(new JButton("6"));
		panel2.add(new JButton("7"));
		panel2.add(new JButton("8"));
		c.add(panel2, BorderLayout.CENTER);
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new Swing01();
	}

}
