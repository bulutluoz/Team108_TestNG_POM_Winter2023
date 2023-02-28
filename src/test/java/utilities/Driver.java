package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Driver {

    /* Daha fazla kontrol imkani ve extends kullanmadan driver'a ulasmak icin
       webDriver objesini Driver class'indaki static bir method ile olusturacagiz

      Ancak getDriver() her kullanildiginda yeni bir driver olusturuyor
      bunu engellemek ve kodumuzun duzgun calismasini saglamak icin
      ilk kullanimda  driver= new ChromeDriver(); kodu calissin
      sonraki kullanimlarda calismasin diye bir yontem gelistirmeliyiz

     */

    public static WebDriver driver;

    public static WebDriver getDriver(){

        WebDriverManager.chromedriver().setup();

        if (driver==null) {
            driver = new ChromeDriver();
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        return driver;

    }

    public static void closeDriver(){

        if (driver != null){
            driver.close();
            driver=null;
        }

    }

    public static void quitDriver(){

        if (driver != null){
            driver.quit();
            driver=null;
        }

    }
}
