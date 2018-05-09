package pl.testuj.selenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumHelloWorld {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://google.com");
        
        WebElement search = driver.findElementByClassName("testClass");
        search.sendKeys("dwqsfdsdfsd");
        search.submit();
        driver.close();

    }
}
