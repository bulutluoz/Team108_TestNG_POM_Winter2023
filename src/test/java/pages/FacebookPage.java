package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FacebookPage {

    public FacebookPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//button[@title='Nur erforderliche Cookies erlauben']")
    public WebElement cookiesKabulButonu;

    @FindBy(xpath = "//input[@placeholder='E-Mail-Adresse oder Telefonnummer']")
    public WebElement emailKutusu;

    @FindBy(xpath = "//input[@placeholder='Passwort']")
    public WebElement passwordKutusu;

    @FindBy(xpath = "//button[@name='login']")
    public WebElement loginButonu;

    @FindBy(xpath = "//div[@class='_9ay7']")
    public WebElement girisYapilamadiYaziElementi;
}
