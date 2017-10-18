import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageFileTest1 {

	public static void main(String[] args) throws IOException {
		File target = new File("jeff.png");
		BufferedImage image = ImageIO.read(target);
		
		for (int x = 0; x < image.getWidth(); x += 2) {
			for (int y = 0; y < image.getHeight(); y += 2) {
				Color color = new Color(image.getRGB(x, y));
				image.setRGB(x, y, getBlackWhiteColorRGB(color));
			}
		}
		
		File bw = new File("bw-jeff.png");
		ImageIO.write(image, "png", bw);
	}

	public static int getBlackWhiteColorRGB(Color color) {
		// average value of the RGB value makes the average black and white RGB value
		int hex = (color.getRed() + color.getGreen() + color.getBlue()) / 3;
		return new Color(hex, hex, hex).getRGB();
	}
}
