package pl.testuj.selenium.disapear;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pl.testuj.selenium.BaseTest;
import pl.testuj.selenium.pages.DisappearingPage;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class DisappearTest extends BaseTest {

    private DisappearingPage disappearingPage;

    @BeforeEach
    public void openPage() {
//        disappearingPage = mainPage.openDisapearingPage();
    }

    @Test
    void shouldGoToTab() {
        assertTrue(disappearingPage.isGalleryPresent());
    }
}
