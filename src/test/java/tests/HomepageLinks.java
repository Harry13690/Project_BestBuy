package tests;

import base.BaseClass;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomepageLinks extends BaseClass {

    @Test(priority = 2)
    public void toVerifyTermsAndConditions(){

        homeLinksPage.terandconlink.click();

        Assert.assertEquals(driver.getTitle(), "BestBuy.com Terms and Conditions");
    }

    @Test(priority = 3)
    public void toVerifyPrivacy(){

        driver.get("https://www.bestbuy.com/");

        homeLinksPage.privacylink.click();

        Assert.assertEquals(driver.getTitle(), "Privacy Policy Hub - Best Buy");
    }

    @Test(priority = 4)
    public void toVerifyDontSell(){

        driver.get("https://www.bestbuy.com/");

        homeLinksPage.dontselllink.click();

        Assert.assertEquals(driver.getTitle(), "Start Request - Best Buy");
    }
}

