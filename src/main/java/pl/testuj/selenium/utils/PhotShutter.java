package pl.testuj.selenium.utils;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.time.LocalDateTime;

public class PhotShutter {

    public static void takePhoto() {
        Rectangle rec = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
        try {
            BufferedImage img = new Robot().createScreenCapture(rec);
            saveImage(img);
        } catch (Exception e) {
            System.out.println("Zdjecie sie nie udalo");
        }
    }

    private static void saveImage(BufferedImage img) throws Exception {
        String projectFolder = System.getProperty("user.dir");
        String name = LocalDateTime.now().toString().replace(":", "_");
        ImageIO.write(img, "jpg", new File(projectFolder + "/" + name + ".jpg"));
    }

    public static void main(String[] args) {
        takePhoto();
    }
}
