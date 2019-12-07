package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static org.openqa.selenium.support.ui.ExpectedConditions.titleContains;

//@UseTestDataFrom(value="src/test/resources/testdata/TestData.csv")
public class NewTourseDemoPage extends UIInteractionSteps {

    /*private String userName;
    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }*/

    @FindBy(xpath = "//input[@name='userName']")
    private WebElement userId;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement pasword;

    @FindBy(xpath = "//input[@name='login']")
    private WebElement loginButton;

    @FindBy(xpath = "//a[text()='SIGN-OFF']")
    private WebElement logoutButton;

    @Step("Login to application using userName{0}, pasword{1}")
    public void enterUserNamePassword(String userName, String password) {
        waitFor(titleContains("Welcome: Mercury Tours"));
        Assert.assertEquals("Welcome: Mercury Tours","Welcome: Mercury Tours");
        userId.sendKeys(userName);
        pasword.sendKeys(password);
    }

    public void clickOnLogin() {
        loginButton.click();
    }

    public boolean VerifySignOffLinkDisplayed() {
        return logoutButton.isDisplayed();
    }

    public void clickOnLogout() {
        logoutButton.click();
    }

    public boolean VerifySignInLinkDisplayed() {
        return loginButton.isDisplayed();
    }

}
