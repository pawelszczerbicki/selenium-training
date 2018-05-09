package pl.testuj.selenium.screenshots;

import org.openqa.selenium.chrome.ChromeDriver;

public class VideoExample {

    public static void main(String[] args) throws Exception {
        Recorder recorder = new Recorder();
        recorder.start();
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        ChromeDriver browser = new ChromeDriver();
        browser.get("https://google.com");
        browser.close();
        recorder.stop();
    }
}
