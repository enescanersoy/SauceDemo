package util;

import io.cucumber.java.After;
import io.cucumber.java.Before;


import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import java.util.Properties;

public class Hooks {
    WebDriver driver;
    Properties properties;

    @Before
    public void before()
    {
        String browser = Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("browser");
        this.properties = ConfigReader.initialize_Properties();
        this.driver = DriverFactory.initialize_Driver(browser);
    }

    @After
    public void after()
    {
        this.driver.quit();
    }
}