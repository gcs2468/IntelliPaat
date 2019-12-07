package tests;

import base.TestBase;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import pages.NewToursDemoPagePOM;

public class NewToursDemoTest extends TestBase {

    @Test(priority = 1)
    public void newTourseDemoLoginTest() {
        Reporter.log("", true);
        Reporter.log("*** Start of Priority 1 ***", true);
        Reporter.log("", true);

        NewToursDemoPagePOM newToursDemoPagePOM = new NewToursDemoPagePOM(driver, properties, seleniumUtils);

        String url = "http://newtours.demoaut.com/";//properties.getProperty(PropertyConstants.URL);
        seleniumUtils.getUrl(url);
        seleniumUtils.waitForPageLoad(driver);

        newToursDemoPagePOM.loginToNewTours();

        seleniumUtils.waitForPageLoad(driver);

        String signOFF = newToursDemoPagePOM.getSignOFF();
        Reporter.log("SignOff text from appln is :: "+signOFF, true);
        Assert.assertEquals(signOFF,"SIGN-OFF");
        
        newToursDemoPagePOM.logououtNewTours();

        Reporter.log("", true);
        Reporter.log("*** End of Priority 1 ***", true);
        Reporter.log("", true);

    }

    @Test(priority = 2)
    public void newTourseDemoLoginTestTwo() {
        Reporter.log("", true);
        Reporter.log("*** Start of Priority 2 ***", true);
        Reporter.log("", true);

        NewToursDemoPagePOM newToursDemoPagePOM = new NewToursDemoPagePOM(driver, properties, seleniumUtils);

        String url = "http://newtours.demoaut.com/";//properties.getProperty(PropertyConstants.URL);
        seleniumUtils.getUrl(url);
        seleniumUtils.waitForPageLoad(driver);

        newToursDemoPagePOM.loginToNewTours();

        seleniumUtils.waitForPageLoad(driver);

        String signOFF = newToursDemoPagePOM.getSignOFF();
        Reporter.log("SignOff text from appln is :: "+signOFF);
        Assert.assertEquals(signOFF,"SIGN-OF");

        newToursDemoPagePOM.logououtNewTours();

        Reporter.log("", true);
        Reporter.log("*** End of Priority 2 ***", true);
        Reporter.log("", true);

    }

}
