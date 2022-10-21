package creational.factory.capabilities;

import creational.factory.base.BaseDriverFactory;
import creational.factory.base.MyDriver;
import creational.factory.enums.BrowserType;
import org.openqa.selenium.WebDriver;

public class CapabilitiesDriverFactory implements BaseDriverFactory {

    @Override
    public WebDriver getDriverInstance(BrowserType type) {
        MyDriver myDriver;
        switch (type) {
            case CHROME -> myDriver = new MyChromeDriverWithCapabilities();
            case FIREFOX -> myDriver = new MyFireFoxDriverWithCapabilities();
            case IE -> myDriver = new MyIEDriverWithCapabilites();
            default -> throw new IllegalArgumentException("The Provided Browser type is not available");
        }
        return myDriver.initialize();
    }
}
