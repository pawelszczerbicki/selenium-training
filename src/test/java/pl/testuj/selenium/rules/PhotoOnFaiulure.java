package pl.testuj.selenium.rules;

import org.junit.jupiter.api.extension.AfterEachCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import pl.testuj.selenium.utils.PhotShutter;

public class PhotoOnFaiulure implements AfterEachCallback {

    @Override
    public void afterEach(ExtensionContext extensionContext) throws Exception {
        if(extensionContext.getExecutionException().isPresent())
            PhotShutter.takePhoto();
    }
}

