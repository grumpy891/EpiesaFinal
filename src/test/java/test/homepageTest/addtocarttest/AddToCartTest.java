
package test.homepageTest.addtocarttest;

import org.testng.Assert;
import org.testng.annotations.Test;
import test.BaseTest;

import static pages.BasePage.getBaseUrl;
import static pages.BasePage.driver;

public class AddToCartTest extends BaseTest {
    private String baseUrl = getBaseUrl() + "AddToCart.html";

    @Test
    public void testAddToCart() {
 //       driver.get(baseUrl);
        addtocart.clickPieseAutoLink();
        addtocart.clickmarcaAuto();
        addtocart.clickpieseAuto();
        addtocart.clickpieseDAF();
        addtocart.clickpieseFA();
        addtocart.clickpieseDAFdiesel();
        addtocart.clickpieseRotula();
        addtocart.clickpieseCAPDEBARA();
        addtocart.clickadaugaINCOSbutton();
        addtocart.clickcosulmeubutton();
        Assert.assertTrue(addtocart.checkProduct(), "Cosul tau este gol is displayed");
    }


}