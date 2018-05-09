package pl.testuj.selenium.frames;

import org.openqa.selenium.chrome.ChromeDriver;

public class FramesExample {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        ChromeDriver browser = new ChromeDriver();
        browser.get("http://the-internet.herokuapp.com/iframe");
        browser.switchTo().frame("mce_0_ifr");
        browser.findElementByTagName("body").sendKeys("<h1>Heading</h1>Yi Zeng");
        browser.switchTo().defaultContent();
    }
}
