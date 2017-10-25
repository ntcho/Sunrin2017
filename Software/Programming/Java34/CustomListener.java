import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class CustomListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent arg0) {
		JButton button = (JButton) arg0.getSource();
		if (button.getText().contains("zum")) {
			button.setText("Set daum as your homepage");
		} else {
			button.setText("Set zum as your homepage");
		}
		System.out.println(button.getText());
	}
	
}
