package creational.factory.capabilities;

import creational.factory.base.MyDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MyChromeDriverWithCapabilities implements MyDriver {
    @Override
    public WebDriver initialize() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setHeadless(true);
        return new ChromeDriver(chromeOptions);
    }
}
