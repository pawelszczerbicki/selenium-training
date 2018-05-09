package pl.testuj.selenium.tabs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;

public class TabsExample {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com");
        WebElement link = driver.findElement(By.partialLinkText("Broken Images"));

        new Actions(driver)
                .keyDown(Keys.COMMAND)
                .click(link)
                .keyUp(Keys.COMMAND)
                .build()
                .perform();
        
        ArrayList<String> tabs2 = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        Thread.sleep(3000);
        driver.close();
        driver.switchTo().window(tabs2.get(0));
    }
}
