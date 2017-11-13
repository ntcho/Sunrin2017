import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Swing02 extends JFrame {
	
	public Swing02() {
		setSize(300, 300);
		setTitle("Jeff");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		add(panel);
		panel.setBackground(Color.YELLOW);
		
		panel.add(new JButton("Output"));
		panel.add(new JButton("Exit"));
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new Swing02();
	}

}
