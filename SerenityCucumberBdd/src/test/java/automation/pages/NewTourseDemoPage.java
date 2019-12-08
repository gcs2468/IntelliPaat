package automation.pages;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static org.openqa.selenium.support.ui.ExpectedConditions.titleContains;

public class NewTourseDemoPage extends UIInteractionSteps {

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

    public String getSignOffText() {
        return logoutButton.getText();

    }

    public void clickOnLogout() {
        logoutButton.click();

    }

    public boolean VerifySignInLinkDisplayed() {
        return loginButton.isDisplayed();

    }

}
