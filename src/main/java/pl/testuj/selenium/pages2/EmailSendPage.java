package pl.testuj.selenium.pages2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmailSendPage extends AbstractPage {

    @FindBy(id = "content")
    private WebElement successMsg;

    public EmailSendPage(WebDriver driver) {
        super(driver);
    }

    public boolean isSuccess() {
        return successMsg.isDisplayed();
    }
}
