import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class CustomListener implements MouseListener {
	@Override
	public void mouseClicked(MouseEvent e) {

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		JButton button = (JButton) e.getSource();
		if (button.getText().equals("Jeff")) {
			// unverified code
			button.setText("Jeeff");
		} else {
			button.setText("Jeff");
		}
	}

	@Override
	public void mouseExited(MouseEvent e) {

	}

	@Override
	public void mousePressed(MouseEvent e) {

	}
}
