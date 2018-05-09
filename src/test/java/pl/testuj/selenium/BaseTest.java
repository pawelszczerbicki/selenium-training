package pl.testuj.selenium;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.chrome.ChromeDriver;
import pl.testuj.selenium.pages2.MainPage;
import pl.testuj.selenium.rules.PhotoOnFaiulure;

@ExtendWith(PhotoOnFaiulure.class)
public abstract class BaseTest {
    private static final String BASE_URL = "http://the-internet.herokuapp.com";
    private static final String DRIVER_KEY = "webdriver.chrome.driver";
    private static final String DRIVER_PATH = "chromedriver";

    protected MainPage mainPage;
    protected ChromeDriver driver = new ChromeDriver();

    @BeforeEach
    public void initDriver() {
        System.setProperty(DRIVER_KEY, DRIVER_PATH);
        driver.get(BASE_URL);
        mainPage = new MainPage(driver);
    }

    @AfterEach
    public void closeBrowser() {
        driver.close();
    }

}
