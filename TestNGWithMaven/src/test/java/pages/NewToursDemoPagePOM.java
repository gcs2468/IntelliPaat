package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import util.SeleniumUtils;

import java.util.Properties;

public class NewToursDemoPagePOM {

    private WebDriver driver;
    private Properties properties;
    private SeleniumUtils seleniumUtils;

    private By userId = By.xpath("//input[@name='userName']");

    private By password= By.xpath("//input[@name='password']");

    private By loginButton = By.xpath("//input[@name='login']");

    private By logoutButton = By.xpath("//a[text()='SIGN-OFF']");

    public NewToursDemoPagePOM(WebDriver driver, Properties properties, SeleniumUtils seleniumUtils) {
        this.driver = driver;
        this.properties = properties;
        this.seleniumUtils = seleniumUtils;
    }

    public void loginToNewTours() {
        driver.findElement(userId).clear();
        driver.findElement(userId).sendKeys("demo");
        driver.findElement(password).sendKeys("demo");
        driver.findElement(loginButton).click();
        seleniumUtils.waitForPageLoad(driver);
    }

    public String getSignOFF(){
        return driver.findElement(logoutButton).getText();
    }

    public  void logououtNewTours() {
        driver.findElement(logoutButton).click();
    }

}
