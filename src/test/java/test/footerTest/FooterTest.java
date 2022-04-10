package test.footerTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import test.BaseTest;

import static pages.BasePage.*;

public class FooterTest extends BaseTest {


    @Test
    public void testFooter(){
        Assert.assertTrue(footer.checkCredit(), "Image is displayed");
        footer.clickdetalii();
        driver.navigate().back();
        Assert.assertTrue(footer.checkcontactandprogram(),"Image is displayed");
        sleep(1000);
        footer.clickmagazinCJ();
        sleep(1000);
        driver.navigate().back();
        sleep(1000);
        footer.clickmarciauto();
        sleep(1000);
        driver.navigate().back();
        sleep(1000);
        footer.clickgarantiesiretur();
        sleep(1000);
        driver.navigate().back();
        sleep(1000);
        footer.clicktermenisiconditii();
        sleep(1000);
        driver.navigate().back();
        sleep(1000);
        footer.clicklivrare();
        sleep(1000);
        driver.navigate().back();
        sleep(1000);
        footer.clickcontact();
        sleep(1000);
        driver.navigate().back();
        sleep(1000);
        footer.clickconfidentialitate();
        sleep(1000);
        driver.navigate().back();
        sleep(1000);
        footer.clickANPC();
        driver.navigate().back();




    }
}