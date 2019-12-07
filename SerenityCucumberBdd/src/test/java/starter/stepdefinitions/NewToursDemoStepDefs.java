package starter.stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import starter.pages.NewTourseDemoPage;

public class NewToursDemoStepDefs {

    @Steps
    NewTourseDemoPage newTourseDemoPage;

    private static final Logger logger = LoggerFactory.getLogger(NewToursDemoStepDefs.class);

    @Given("^I am at home page of the application$")
    public void iAmAtHomePageOfTheApplication() {
        newTourseDemoPage.open();
    }

    @When("^I click on Login button$")
    public void i_click_on_Login_button() {
        newTourseDemoPage.clickOnLogin();

    }

    @Then("^I should see SignOff link$")
    public void i_should_see_Login_page() throws Exception {
        Assert.assertTrue(newTourseDemoPage.VerifySignOffLinkDisplayed());

    }

    @And("^I enter (.*) and (.*) as credentials$")
    public void iEnterUsernameIntoAndPassword(String arg1, String arg2) {
        newTourseDemoPage.enterUserNamePassword(arg1, arg2);
    }


    @And("^I click on Logout button$")
    public void iClickOnLogoutButton() {
        newTourseDemoPage.clickOnLogout();

    }

    @Then("^I should see SignOn link$")
    public void iShouldSeeSignOnLink() {
        newTourseDemoPage.VerifySignInLinkDisplayed();
    }

    @And("^I enter valid credentials$")
    public void iEnterValidCredentials(String arg1, String arg2) {
        newTourseDemoPage.enterUserNamePassword(arg1, arg2);
    }
}