package pl.testuj.selenium.pages2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BrokenImagesPage extends AbstractPage {

    //pobranie elementu ze stronu
    //to samo co driver.findElementBy(......)
    @FindBy(className = "example")
    private WebElement imagesContainer;

    public BrokenImagesPage(WebDriver driver) {
        super(driver);
    }

    public boolean isPageDisplayed() {
        return imagesContainer.isDisplayed();
    }
}
