package tests;

import base.PropertyConstants;
import base.TestBase;
import org.testng.annotations.Test;
import pages.OrangeHrmPagePFM;
import static org.assertj.core.api.Assertions.*;


public class OrangeHrmTest extends TestBase {


    @Test(priority=1)
    public void m1() throws InterruptedException {


        OrangeHrmPagePFM orangeHrmPagePFM = new OrangeHrmPagePFM(driver, properties, seleniumUtils);

        //seleniumUtils.getUrl("https://opensource-demo.orangehrmlive.com/");
        seleniumUtils.getUrl(properties.getProperty(PropertyConstants.URL));
        seleniumUtils.waitForPageLoad(driver);

        orangeHrmPagePFM.login();

        Thread.sleep(5000);
        assertThat(orangeHrmPagePFM.getSignOFF().equals("Welcome"));

        orangeHrmPagePFM.logout();
    }

    @Test(priority=2)
    public void m2() throws InterruptedException {
        OrangeHrmPagePFM orangeHrmPagePFM = new OrangeHrmPagePFM(driver, properties, seleniumUtils);

        seleniumUtils.getUrl(properties.getProperty(PropertyConstants.URL));
        seleniumUtils.waitForPageLoad(driver);

        orangeHrmPagePFM.login();

        Thread.sleep(5000);
        assertThat(orangeHrmPagePFM.getSignOFF().equals("Welcome Admin"));

        orangeHrmPagePFM.logout();

    }

}
