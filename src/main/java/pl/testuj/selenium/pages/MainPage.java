package pl.testuj.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends AbstractPage {

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public DisappearingPage openDisapearingPage() {
        driver.findElement(By.partialLinkText("Disappearing Elements")).click();
        return new DisappearingPage(driver);
    }
}
