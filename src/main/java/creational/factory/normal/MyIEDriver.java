package creational.factory.normal;

import creational.factory.base.MyDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class MyIEDriver implements MyDriver {
    @Override
    public WebDriver initialize() {
        return WebDriverManager.iedriver().create();
    }
}
