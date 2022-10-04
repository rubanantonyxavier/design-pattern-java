package factory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class MyIEDriver implements MyDriver {
    @Override
    public WebDriver initialize() {
        return WebDriverManager.iedriver().create();
    }
}
