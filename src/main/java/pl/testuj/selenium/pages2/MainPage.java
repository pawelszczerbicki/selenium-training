package pl.testuj.selenium.pages2;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class MainPage extends AbstractPage {

    @FindBy(partialLinkText = "Broken Images")
    private WebElement brokenImagesLink;

    @FindBy(partialLinkText = "Forgot Password")
    private WebElement forgotPasswordLink;

    @FindBy(partialLinkText = "Dynamic Controls")
    private WebElement dynamicControlsLink;

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

    public DynamicControlsPage openDynamicControlsLink() {
        dynamicControlsLink.click();
        return new DynamicControlsPage(driver);
    }

    public void openDynamicControllInNewTab() {
        Actions a = new Actions(driver);
        a.keyDown(Keys.COMMAND);
        a.click(dynamicControlsLink);
        a.keyUp(Keys.COMMAND);
        a.build().perform();
    }
}
