package tests.day13_crossBrowserTests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.DriverCross;
import utilities.TestBaseCross;

public class C02_AmazonTestCross extends TestBaseCross {
    @Test
    public void amazonTesti(){

        driver.get("https://www.amazon.com");

        String expectedIcerik="amazon";
        String actualurl=driver.getCurrentUrl();

        Assert.assertTrue(actualurl.contains(expectedIcerik));

        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("Nutella" + Keys.ENTER);

        expectedIcerik = "Nutella";
        WebElement aramaSonucElementi = driver.findElement(By.xpath("//h1[@class='a-size-base s-desktop-toolbar a-text-normal']"));
        String actualSonucYazisi = aramaSonucElementi.getText();

        Assert.assertTrue(actualSonucYazisi.contains(expectedIcerik));

    }



}
