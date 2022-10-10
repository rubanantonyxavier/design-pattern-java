package factory.base;

import factory.enums.BrowserType;
import org.openqa.selenium.WebDriver;

public interface BaseDriverFactory {

    WebDriver getDriverInstance(BrowserType type);
}
