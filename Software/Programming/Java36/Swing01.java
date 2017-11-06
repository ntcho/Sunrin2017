import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Swing01 extends JFrame {
	
//	FlowLayout example
	
	public Swing01() {
		setTitle("FlowLayout");
		setSize(200, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(new JButton("Btn1"));
		c.add(new JButton("Btn2"));
		c.add(new JButton("Btn3"));
		c.add(new JButton("Btn4"));
		c.add(new JButton("Btn5"));
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new Swing01();
	}

}
