package pl.testuj.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.By.id;
import static org.openqa.selenium.By.xpath;

public abstract class AbstractPage {

    protected WebDriver driver;

    protected WebDriverWait wait;

    public AbstractPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        PageFactory.initElements(driver, this);

    }
    public void clearSession() {
        driver.manage().deleteAllCookies();
    }

    public WebElement waitUntilPresenceOfElementLocated(By by) {
        return wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public WebElement waitForElementToBeClickable(By by) {
        return wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    public WebElement waitForElementToBeClickable(WebElement webElement) {
        return wait.until(ExpectedConditions.elementToBeClickable(webElement));
    }

    public WebElement waitForElementToBeClickableById(String elementId) {
        return waitForElementToBeClickable(id(elementId));
    }

    public WebElement waitForElementToBeClickableByXpath(String xpath) {
        return waitForElementToBeClickable(xpath(xpath));
    }

    public WebElement waitForVisibility(String elementId) {
        return waitForVisibility(id(elementId));
    }

    public WebElement waitForVisibility(By by) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }
    public void waitAndClick(String id) {
        waitAndClick(id(id));
    }

    public void waitAndClick(By by) {
        waitForElementToBeClickable(by).click();
    }

    public void assertVisibility(String elementId) {
        waitForVisibility(elementId);
    }

    public void assertVisibility(By by) {
        waitForVisibility(by);
    }

    public void fillInput(String elementId, String value) {
        clearAndFill(waitForElementToBeClickableById(elementId), value);
    }
    public void clearAndFill(WebElement e, String text) {
        e.clear();
        e.sendKeys(text);
    }
}
