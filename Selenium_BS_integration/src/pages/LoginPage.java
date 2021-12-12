package pages;

import io.percy.selenium.Percy;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;
    public LoginPage(WebDriver driver1) {
        this.driver = driver1;
        PageFactory.initElements(driver, this);
    }
    Percy percy = new Percy(driver);

    @FindBy(xpath = "//div[@class='LoginHome__accountContainer___1iWvx group']")
    WebElement typeOfPortal;
    @FindBy(xpath = ("//div[text()='Sign in with email']"))
    WebElement loginType;
    @FindBy(name = ("email"))
    WebElement username;
    @FindBy(name = ("password"))
    WebElement password;
    @FindBy(xpath = ("//span[text()='Sign in']"))
    WebElement signIn;

    public void selectThePortalType() throws InterruptedException {
        Thread.sleep(5000);
        percy.snapshot("Login Page");
        typeOfPortal.click();
    }

    public void selectTheLoginType() {
        loginType.click();
    }

    public void clickOnUserId() {
        username.click();
        username.clear();
        username.sendKeys("Enter UserID");
    }

    public void clickOnPassword() {
        password.click();
        password.clear();
        password.sendKeys("EnterPassword");
    }

    public void clickOnSignIn() {
        signIn.click();
    }
}
