package factory.normal;

import factory.base.BaseDriverFactory;
import factory.base.MyDriver;
import factory.enums.BrowserType;
import org.openqa.selenium.WebDriver;

public class NormalDriverFactory implements BaseDriverFactory {

    @Override
    public WebDriver getDriverInstance(BrowserType type) {
        MyDriver myDriver;
        switch (type) {
            case CHROME -> myDriver = new MyChromeDriver();
            case FIREFOX -> myDriver = new MyFireFoxDriver();
            case IE -> myDriver = new MyIEDriver();
            default -> throw new  IllegalArgumentException("The Provided Browser type is not available");
        }
        return myDriver.initialize();
    }
}