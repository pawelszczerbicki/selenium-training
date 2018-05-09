package pl.testuj.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Bootstrap {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        ChromeDriver browser = new ChromeDriver();
        browser.get("http://the-internet.herokuapp.com/hovers");
        Actions action = new Actions(browser);
        action.moveToElement(browser.findElements(By.className("figure")).get(0)).perform();
        browser.findElementByPartialLinkText("View profile").click();
        browser.close();
    }
}
