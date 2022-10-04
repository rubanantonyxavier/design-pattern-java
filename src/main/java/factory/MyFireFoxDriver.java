package factory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class MyFireFoxDriver implements MyDriver {
    @Override
    public WebDriver initialize() {
        return WebDriverManager.firefoxdriver().create();
    }
}
