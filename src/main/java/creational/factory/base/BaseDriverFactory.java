package creational.factory.base;

import creational.factory.enums.BrowserType;
import org.openqa.selenium.WebDriver;

public interface BaseDriverFactory {

    WebDriver getDriverInstance(BrowserType type);
}
