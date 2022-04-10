package test.homepageTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import test.BaseTest;

public class homepageTest extends BaseTest {
    @Test
    public void testLogoIsDisplayed(){

        Assert.assertTrue(homePage.checkLogo(), "Logo is not displayed");
//        Assert.assertTrue(homePage.checkCommercial(), "Commercial is displayed");
        Assert.assertTrue(homePage.checkCommercial2(), "Commercial2 is displayed");

    }
}