package pl.testuj.selenium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pl.testuj.selenium.pages2.BrokenImagesPage;
import pl.testuj.selenium.pages2.EmailSendPage;
import pl.testuj.selenium.pages2.ResetPasswordPage;
import pl.testuj.selenium.pages2.MainPage;

public class InternetHerokuPageTest {

    private WebDriver driver = new ChromeDriver();

    @BeforeEach
    public void init() {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver.get("http://the-internet.herokuapp.com");
    }

    @Test
    public void shouldGoToBrokenImagesPage() {
        MainPage main = new MainPage(driver);
        BrokenImagesPage broken = main.openBrokenImagesPage();
        Assertions.assertTrue(broken.isPageDisplayed());
    }

    @Test
    public void shouldResetPassword() {
        MainPage main = new MainPage(driver);
        ResetPasswordPage forgot = main.openResetPasswordPage();
        EmailSendPage successPage = forgot.resetPassword("test@test.com");
        Assertions.assertTrue(successPage.isSuccess());
    }

    @Test
    public void shouldResetPasswordAlternative() {
        Assertions.assertTrue(new MainPage(driver)
                .openResetPasswordPage()
                .resetPassword("test@test.com")
                .isSuccess());
    }
}
