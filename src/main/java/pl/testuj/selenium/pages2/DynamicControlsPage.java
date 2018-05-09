package pl.testuj.selenium.pages2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DynamicControlsPage extends AbstractPage {

    @FindBy(id = "btn")
    private WebElement toggleButton;

    public DynamicControlsPage(WebDriver driver) {
        super(driver);
    }

    public DynamicControlsPage hideCheckboxAndWait() {
        toggleButton.click();
        waitForInvisibility(By.tagName("input"));
        return this;
    }

    public DynamicControlsPage showCheckboxAndWait() {
        toggleButton.click();
        waitForVisibility(By.tagName("input"));
        return this;
    }
}
