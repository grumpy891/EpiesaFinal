package test;


import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import pages.BasePage;
import pages.footer.Footer1;
import pages.homepage.HomePage;
import pages.homepage.addtocart.AddToCart;



public class BaseTest {
    public HomePage homePage = HomePage.getInstance();
    public AddToCart addtocart = AddToCart.getInstance();
public Footer1 footer = Footer1.getInstance();



    @BeforeSuite
    public void init(){ BasePage.setUp();}

    @AfterSuite
    public void tearDown(){BasePage.tearDown();}

}