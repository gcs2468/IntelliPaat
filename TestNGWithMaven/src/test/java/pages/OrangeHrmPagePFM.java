package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.SeleniumUtils;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class OrangeHrmPagePFM {

    private WebDriver driver;
    private Properties properties;
    private SeleniumUtils seleniumUtils;

    @FindBy(id = "txtUsername")
    private WebElement userId;

    @FindBy(id = "txtPassword")
    private WebElement password;

    @FindBy(id = "btnLogin")
    private WebElement loginButton;

    @FindBy(id = "welcome")
    private WebElement adminLink;

    @FindBy(xpath = "//a[text()='Logout']")
    private WebElement logoutButton;

    public OrangeHrmPagePFM(WebDriver driver, Properties properties, SeleniumUtils seleniumUtils) {
        this.driver = driver;
        this.properties = properties;
        this.seleniumUtils = seleniumUtils;
        PageFactory.initElements(driver, this);
    }

    public void login() {
        userId.clear();
        userId.sendKeys("Admin");
        password.sendKeys("admin123");
        loginButton.click();
        seleniumUtils.waitForPageLoad(driver);
    }

    public String getSignOFF(){
        return adminLink.getText();
    }

    public  void logout() {
        seleniumUtils.implicitlyWait(3, TimeUnit.SECONDS);
        adminLink.click();
        seleniumUtils.implicitlyWait(3, TimeUnit.SECONDS);
        logoutButton.click();
    }

}
