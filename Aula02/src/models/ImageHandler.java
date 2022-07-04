package models;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageHandler {

    public static void handlerImage() {

        try {
            BufferedImage buferredImg = ImageIO.read(new File("./src/resources/Savyx.png"));
            BufferedImage targetImg = new BufferedImage(buferredImg.getWidth(), buferredImg.getHeight(), BufferedImage.TYPE_INT_ARGB);
            int rgb = targetImg.getRGB(0, 0);
            System.out.println(rgb);

            File outputFile = new File("./out/target.jpg");
            ImageIO.write(targetImg, "jpg", outputFile);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
