package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ZeroPage {
    public ZeroPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "signin_button")
    public WebElement signInButonu;

    @FindBy(id = "user_login")
    public WebElement usernameKutusu;

    @FindBy(id = "user_password")
    public WebElement passwordKutusu;

    @FindBy(xpath = "//input[@value='Sign in']")
    public WebElement signInSubmitButonu;

    @FindBy(xpath = "//strong[text()='Online Banking']")
    public WebElement onlineBanking;

    @FindBy(id = "pay_bills_link")
    public WebElement payBillLinki;

    @FindBy(xpath = "//a[text()='Purchase Foreign Currency']")
    public WebElement purchaseFCButonu;

    @FindBy(id = "pc_currency")
    public WebElement currencyDropdown;
}
