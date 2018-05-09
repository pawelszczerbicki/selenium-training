package pl.testuj.selenium.pages2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ResetPasswordPage extends AbstractPage {

    @FindBy(name = "email")
    private WebElement emailInput;

    public ResetPasswordPage(WebDriver driver) {
        super(driver);
    }

    public EmailSendPage resetPassword(String email) {
         emailInput.sendKeys(email);
         emailInput.submit();
         return new EmailSendPage(driver);
    }

}
