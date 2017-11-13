import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Swing03 extends JFrame {
	
	public Swing03() {
		setSize(300, 300);
		setTitle("Jeff");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		add(panel);
		panel.setBackground(Color.BLACK);
		
		JButton random = new JButton("Random");
		random.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				panel.setBackground(getRandom());
			}
		});
		
		panel.add(random);
		
		setVisible(true);
	}
	
	private Color getRandom() {
		int r = (int) (Math.random() * 256);
		int g = (int) (Math.random() * 256);
		int b = (int) (Math.random() * 256);
		return new Color(r, g, b);
	}

	public static void main(String[] args) {
		new Swing03();
	}

}
