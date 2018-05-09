package pl.testuj.selenium.screenshots;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import static java.lang.String.format;

public class PhotoShutter {
    private final static String IMAGE_EXTENSION = "jpg";

    public static void captureScreenshot(String filename) throws AWTException, IOException {
        String dir = System.getProperty("user.dir");
        saveImage(dir, filename, getScreenshot());
    }

    private static BufferedImage getScreenshot() throws AWTException {
        Rectangle rec = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
        return new Robot().createScreenCapture(rec);
    }

    private static void saveImage(String dir, String filename, BufferedImage img) throws IOException {
        File screenshotFile = new File(generateName(dir, filename, IMAGE_EXTENSION));
        screenshotFile.mkdirs();
        ImageIO.write(img, IMAGE_EXTENSION, screenshotFile);
    }

    private static String generateName(String dir, String filename, String extension) {
        return format("%s%s%s%s%s", dir, "/", filename, ".", extension);
    }
}
