package tests;

import base.BaseClass;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Menu extends BaseClass {

    @Test(priority = 1)
    public void menuDeals(){

        menuPage.menubtn.click();

        menuPage.dealsbtn.click();

        menuPage.topdealsbtn.click();

        Assert.assertEquals(driver.getTitle(), "Top Deals and Featured Offers on Electronics - Best Buy");
    }

    @Test(priority = 3)
    public void menuServices(){

        driver.get("https://www.bestbuy.com/");

        menuPage.menubtn.click();

        menuPage.servicesbtn.click();

        menuPage.visitservicebtn.click();

        Assert.assertEquals(driver.getTitle(), "Best Buy Support & Customer Service");
    }

    @Test(priority = 2)
    public void menuBrands(){

        driver.get("https://www.bestbuy.com/");

        menuPage.menubtn.click();

        menuPage.brandsbtn.click();

        menuPage.microsoftbtn.click();

        Assert.assertEquals(driver.getTitle(), "Microsoft Brand Store - Best Buy");
    }

}
