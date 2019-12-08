package tests;

import base.PropertyConstants;
import base.TestBase;
import pages.OrangeHrmPagePFM;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;;


public class OrangeHrmTest extends TestBase {


    @Test(priority=1)
    public void m1() throws InterruptedException {
        SoftAssert sa = new SoftAssert();

        OrangeHrmPagePFM orangeHrmPagePFM = new OrangeHrmPagePFM(driver, properties, seleniumUtils);

        //seleniumUtils.getUrl("https://opensource-demo.orangehrmlive.com/");
        seleniumUtils.getUrl(properties.getProperty(PropertyConstants.URL));
        seleniumUtils.waitForPageLoad(driver);

        orangeHrmPagePFM.login();

        Thread.sleep(5000);
        String admin = orangeHrmPagePFM.getSignOFF();
        sa.assertEquals(admin,"Welcome");

        orangeHrmPagePFM.logout();
    }

    @Test(priority=2)
    public void m2() throws InterruptedException {
        SoftAssert sa = new SoftAssert();
        OrangeHrmPagePFM orangeHrmPagePFM = new OrangeHrmPagePFM(driver, properties, seleniumUtils);

        seleniumUtils.getUrl(properties.getProperty(PropertyConstants.URL));
        seleniumUtils.waitForPageLoad(driver);

        orangeHrmPagePFM.login();

        Thread.sleep(5000);
        String admin = orangeHrmPagePFM.getSignOFF();
        //assertThat(orangeHrmPagePFM.getSignOFF().equals("Welcome Admin"));
        sa.assertEquals(admin,"Welcome Admin");

        orangeHrmPagePFM.logout();

    }

}
