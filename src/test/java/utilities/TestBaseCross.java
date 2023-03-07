package utilities;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.time.Duration;

public class TestBaseCross {
    protected WebDriver driver;

    @Parameters("browser")
    @BeforeMethod
    public void setUp(@Optional String browser){

        driver= DriverCross.getDriver(browser);

    }

    @AfterMethod
    public void tearDown(){

        DriverCross.closeDriver();
    }
}


