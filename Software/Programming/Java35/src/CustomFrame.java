import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CustomFrame extends JFrame implements ActionListener {
	
	public CustomFrame() {
		JButton button = new JButton("Exit");
		Container contentPane = this.getContentPane();

		contentPane.add(new JLabel("Lable"));
		contentPane.add(button);
		// could also use this:
		// add(button);
		// directly to the frame
		
		button.addActionListener(this);
		
		// creates RTL horizontal LinearLayout (Feat. Android)
		setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300, 300);
		// setVisible on the last to apply
		setVisible(true);
	}

	public static void main(String[] args) {
		new CustomFrame();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}

}
