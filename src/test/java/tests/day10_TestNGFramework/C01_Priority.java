package tests.day10_TestNGFramework;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class C01_Priority {


    @Test
    public void amazonTesti(){
        // Amazon ana sayfaya gidip, amazona gittigimizi test edelim
        Driver.getDriver().get("https://www.amazon.com");

        // url amazon iceriyor mu test edelim
        String expectedIcerik = "amazon";
        String actualUrl= Driver.getDriver().getCurrentUrl();

        String actualTitle= Driver.getDriver().getTitle();

        Assert.assertTrue(actualUrl.contains(expectedIcerik));
        Driver.closeDriver();
    }

    @Test
    public void wiseTesti(){
        // wisequarter ana sayfaya gidip, wisequarter'a gittigimizi test edelim

    }


    @Test
    public void youtubeTesti(){
        // youtube ana sayfaya gidip, youtube gittigimizi test edelim

    }
}
