package factory.capabilities;

import factory.base.MyDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;

public class MyIEDriverWithCapabilites implements MyDriver {
    @Override
    public WebDriver initialize() {
        WebDriverManager.iedriver().create();
        InternetExplorerOptions ieOptions = new InternetExplorerOptions();
        ieOptions.setCapability("Headless_Mode", "true");
        return new InternetExplorerDriver(ieOptions);
    }
}
