package pl.testuj.selenium;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import pl.testuj.selenium.pages2.MainPage;

public class BaseTest {
    private static final String BASE_URL = "http://the-internet.herokuapp.com";
    protected MainPage mainPage;
    private ChromeDriver driver = new ChromeDriver();

    @BeforeEach
    public void initDriver() {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver.get(BASE_URL);
        mainPage = new MainPage(driver);
    }

    @AfterEach
    public void closeBrowser() {
        driver.close();
    }

    @Test
    public void openUrl() {
    }
}
