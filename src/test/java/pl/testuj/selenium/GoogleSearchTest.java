package pl.testuj.selenium;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class GoogleSearchTest {

    private ChromeDriver driver = new ChromeDriver();

    @BeforeEach
    public void initDriver() {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver.get("http://google.com");
    }

    @AfterEach
    public void close() {

        List<WebElement> links = driver.findElementsByTagName("a");
        
        for(WebElement element: links){
            System.out.println(element.getText() + " - " +  element.getAttribute("href"));
        }

        driver.close();
    }

    @Test
    public void shouldSearch() {
        WebElement searchInput = driver.findElementByName("q");
        searchInput.sendKeys("test");
        searchInput.submit();

        Assertions.assertTrue(driver.findElementById("res").isDisplayed());

    }
}
