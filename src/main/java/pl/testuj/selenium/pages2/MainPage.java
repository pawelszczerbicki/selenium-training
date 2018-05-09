package pl.testuj.selenium.pages2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends AbstractPage {

    @FindBy(partialLinkText = "Broken Images")
    private WebElement brokenImagesLink;

    @FindBy(partialLinkText = "Forgot Password")
    private WebElement forgotPasswordLink;

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public BrokenImagesPage openBrokenImagesPage() {
        brokenImagesLink.click();
        return new BrokenImagesPage(driver);
    }

    public ResetPasswordPage openResetPasswordPage() {
        forgotPasswordLink.click();
        return new ResetPasswordPage(driver);
    }
}
