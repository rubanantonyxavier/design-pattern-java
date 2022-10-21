package creational.factory;

import creational.factory.base.BaseDriverFactory;
import creational.factory.capabilities.CapabilitiesDriverFactory;
import creational.factory.enums.BrowserType;
import creational.factory.normal.NormalDriverFactory;
import org.openqa.selenium.WebDriver;

public class FactoryMainClass {

    public static void main(String[] args) {
        BaseDriverFactory driverFactory = new NormalDriverFactory();
        WebDriver driver = driverFactory.getDriverInstance(BrowserType.CHROME);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();

        driverFactory = new CapabilitiesDriverFactory();
        driver = driverFactory.getDriverInstance(BrowserType.FIREFOX);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
    }
}

/*
Factory Design Pattern:

Description
Factory pattern Task:

SubTask-1

Using creational.factory pattern, write code to initialize it to your custom chrome, firefox or IE browser implementations.

Note: do not just say new ChromeDriver. Have a class something like myChromeDriver and just do initialize the actual chrome driver in this class. Similarly for other browser classes.


SubTask-2
Now make it Fit to the GOF Factory Method pattern. As per the GOF Factory Method Pattern, the subclasses should decide which class to instantiate. So have another set of implementations for chrome, firefox, IE browsers.
This customization is different from previous by having some custom capabilities set in these classes.

For example:  Have another class from chrome driver and this time call it "MyChromeDriverWithCapabilities".  Similar for other browsers

Declare creational.factory classes, one which return normal chromedriver(MyChromeDriver) and other which return driver with pre-set capabilities("MyChromeDriverWithCapabilities")

------------------------------------------------------------
Acceptance criteria:
1. Solve the problem using pattern
2. Optimize the code
3. No Sonar Violations
 */
