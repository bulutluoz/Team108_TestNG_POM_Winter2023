package tests.day10_TestNGFramework;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;

public class C02_dependsOnMethods {

    // 3 test method'u olusturun
    // 1. amazona gidip amazona gittigimizi test edin
    // 2. Nutella aratip, sonucun Nutella icerdigini test edin
    // 3. ilk urune click yapip, urun isminin Nutella icerdigini test edin

    @Test
    public void amazonTesti(){

        Driver.getDriver().get("https://www.amazon.com");

        String expectedIcerik="amazon";
        String actualurl=Driver.getDriver().getCurrentUrl();

        Assert.assertTrue(actualurl.contains(expectedIcerik));
    }

    @Test
    public void nutellaTesti(){

        AmazonPage amazonPage = new AmazonPage();
        amazonPage.aramaKutusu.sendKeys("Nutella" + Keys.ENTER);

        String expectedIcerik = "Nutella";
        String actualSonucYazisi = amazonPage.aramaSonucElementi.getText();

        Assert.assertTrue(actualSonucYazisi.contains(expectedIcerik));

    }

    @Test
    public void ilkUrunTesti(){


    }

}
