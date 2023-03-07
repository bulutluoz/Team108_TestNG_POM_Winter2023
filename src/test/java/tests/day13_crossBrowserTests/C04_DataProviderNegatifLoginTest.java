package tests.day13_crossBrowserTests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.QdPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class C04_DataProviderNegatifLoginTest {


    /*
        Verilen 5 farkli username ve password'u kullanarak
        qualitydemy uygulamasina girilemedigini test edin
     */

    @DataProvider
    public static Object[][] kullanicilar() {

        String[][] kullaniciList={{"Zafer","12345"},
                                    {"Mehmet","34567"},
                                    {"Sevilay","67890"},
                                    {"Enver","56789"},
                                    {"Ahmet Emre","54321"}};
        return kullaniciList;
    }


    @Test(dataProvider = "kullanicilar")
    public void negatifLogin1(String username, String password){
        QdPage qdPage= new QdPage();
        ReusableMethods.bekle(3);
        qdPage= new QdPage();
        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));
        qdPage.ilkLoginLinki.click();
        qdPage.emailKutusu.sendKeys(username);
        qdPage.passwordKutusu.sendKeys(password);
        ReusableMethods.bekle(2);
        qdPage.loginButonu.click();

        Assert.assertTrue(qdPage.emailKutusu.isEnabled());
        Driver.closeDriver();

    }
}
