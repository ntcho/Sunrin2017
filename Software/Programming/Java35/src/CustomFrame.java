import javax.swing.JFrame;

public class CustomFrame extends JFrame {
	
	public CustomFrame() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new CustomFrame();
	}

}
