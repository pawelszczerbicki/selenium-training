package pl.testuj.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class DisappearingPage extends AbstractPage {

    @FindBy(partialLinkText = "Gallery")
    private WebElement galleryTab;

    public DisappearingPage(WebDriver driver) {
        super(driver);
    }

    public boolean isGalleryPresent(){
        return galleryTab.isDisplayed();
    }

    //another way
    public DisappearingPage assertGalleryPresent(){
        assertTrue(galleryTab.isDisplayed());
        return this;
    }
}
