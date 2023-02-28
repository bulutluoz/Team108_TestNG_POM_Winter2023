package tests.day10_TestNGFramework;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;

public class C02_dependsOnMethods {
    /*
        Priority oncelik belirler ama testleri birbirine baglamaz

        eger bir test method'unun calismasi baska bir test method'una bagli ise
        bu durumda dependsOnMethods kullanmak daha guzel olur

        dependsOnMethod ile baska bir method'a bagli olan method'u bagimsiz calistirmak istersek
        once bagli oldugui method'u calistirir, sonra kendisi calisir
        Ancak bu 2 method icin gecerlidir, 3 method calistirmaz

        dependsOnMethods bir siralama yontemi DEGILDIR
        sira bagli olan bir method'a geldiginde,
        oncelikle bagli oldugu method'un calismasini ve PASSED olmasini bekler

        Eger bagli olunan method FAILED olursa
        bagli olan method calistirilmaz, IGNORE edilir

     */

    // 3 test method'u olusturun
    // 1. amazona gidip amazona gittigimizi test edin
    // 2. Nutella aratip, sonucun Nutella icerdigini test edin
    // 3. ilk urune click yapip, urun isminin Nutella icerdigini test edin
    AmazonPage amazonPage = new AmazonPage();

    @Test
    public void amazonTesti(){

        Driver.getDriver().get("https://www.amazon.com");

        String expectedIcerik="amazon";
        String actualurl=Driver.getDriver().getCurrentUrl();

        Assert.assertTrue(actualurl.contains(expectedIcerik));
    }

    @Test(dependsOnMethods = "amazonTesti")
    public void nutellaTesti(){


        amazonPage.aramaKutusu.sendKeys("Nutella" + Keys.ENTER);

        String expectedIcerik = "Nutella";
        String actualSonucYazisi = amazonPage.aramaSonucElementi.getText();

        Assert.assertTrue(actualSonucYazisi.contains(expectedIcerik));

    }

    @Test(dependsOnMethods = "nutellaTesti")
    public void ilkUrunTesti(){
       amazonPage.ilkUrun.click();

       String expectedIcerik="Nutella";
       String actualUrunIsmi= amazonPage.ilkUrunIsimElementi.getText();

       Assert.assertTrue(actualUrunIsmi.contains(expectedIcerik));

       Driver.closeDriver();
    }

}
