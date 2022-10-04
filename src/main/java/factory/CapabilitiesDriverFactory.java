package factory;

import org.openqa.selenium.WebDriver;

public class CapabilitiesDriverFactory implements BaseDriverFactory {

    @Override
    public WebDriver getDriverInstance(BrowserType type) {
        MyDriver myDriver = null;
        switch (type) {
            case CHROME -> myDriver = new MyChromeDriverWithCapabilities();
            case FIREFOX -> myDriver = new MyFireFoxDriverWithCapabilities();
            case IE -> myDriver = new MyIEDriverWithCapabilites();
            default -> throw new RuntimeException("The Provided Browser type is not available");
        }
        return myDriver.initialize();
    }
}
