package pl.testuj.selenium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pl.testuj.selenium.pages2.BrokenImagesPage;
import pl.testuj.selenium.pages2.DynamicControlsPage;
import pl.testuj.selenium.pages2.EmailSendPage;
import pl.testuj.selenium.pages2.ResetPasswordPage;
import pl.testuj.selenium.utils.PhotShutter;

import java.util.ArrayList;

public class InternetHerokuPageTest extends BaseTest {

    @Test
    public void shouldGoToBrokenImagesPage() {
        BrokenImagesPage broken = mainPage.openBrokenImagesPage();
        Assertions.assertTrue(broken.isPageDisplayed());
    }

    @Test
    public void shouldResetPassword() {
        ResetPasswordPage forgot = mainPage.openResetPasswordPage();
        EmailSendPage successPage = forgot.resetPassword("test@test.com");
        Assertions.assertTrue(successPage.isSuccess());
    }

    @Test
    public void shouldResetPasswordAlternative() {
        Assertions.assertTrue(mainPage
                .openResetPasswordPage()
                .resetPassword("test@test.com")
                .isSuccess());
    }

    @Test
    public void shouldToggleCheckbox() {
        DynamicControlsPage controls = mainPage.openDynamicControlsLink();
        controls.hideCheckboxAndWait();
        PhotShutter.takePhoto();
        controls.showCheckboxAndWait();
    }

    @Test
    public void shouldToggleCheckboxAlternative() {
        mainPage.openDynamicControlsLink()
                .hideCheckboxAndWait()
                .showCheckboxAndWait();
    }

    @Test
    public void shouldSwitchTabs() throws Exception {
        mainPage.openDynamicControllInNewTab();
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

        //Czekamy 3 sekundy aby zobaczyc akcje na ekranie
        //DO NOT USE IT IN USUAL TEST
        Thread.sleep(2000);

        driver.close();
        driver.switchTo().window(tabs.get(0));
    }
}
