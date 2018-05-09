package pl.testuj.selenium.screenshots;

import org.openqa.selenium.chrome.ChromeDriver;

public class PhotoExample {

    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        ChromeDriver browser = new ChromeDriver();
        browser.get("https://google.com");
        PhotoShutter.captureScreenshot("test");
        browser.close();
    }
}
