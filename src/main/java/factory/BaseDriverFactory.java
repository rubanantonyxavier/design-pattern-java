package factory;

import org.openqa.selenium.WebDriver;

public interface BaseDriverFactory {

    WebDriver getDriverInstance(BrowserType type);
}
