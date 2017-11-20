package in4.anonyInner;

import java.awt.event.*;
import javax.swing.*;
public class Exam extends JFrame {
	public Exam() {
		setSize(200, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton button = new JButton("누르세요");
		add(button);
		button.addActionListener(  new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(button.getText().equals("누르세요"))
					button.setText("Click now");
				else button.setText("누르세요");
			}
		}  );
		setVisible(true);
	}
	public static void main(String[] args) {
		new Exam();
	}
}
