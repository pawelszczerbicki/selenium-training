package pl.testuj.selenium.rules;

import org.junit.jupiter.api.extension.AfterEachCallback;
import org.junit.jupiter.api.extension.BeforeEachCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

import static pl.testuj.selenium.screenshots.PhotoShutter.captureScreenshot;

public class PhotoOnFaiulure implements AfterEachCallback, BeforeEachCallback {


    @Override
    public void afterEach(ExtensionContext extensionContext) throws Exception {
        if (extensionContext.getExecutionException().isPresent())
            captureScreenshot("test");
    }

    @Override
    public void beforeEach(ExtensionContext extensionContext) throws Exception {
        System.out.println("starting test: " + extensionContext.getDisplayName());
    }
}

