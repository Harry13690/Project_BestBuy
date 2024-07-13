package tests;

import base.BaseClass;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddToCart extends BaseClass {

    @Test
    public void addingPhone(){

        driver.get("https://www.bestbuy.com/");

        menuPage.menubtn.click();

        menuPage.cellphonebtn.click();

        menuPage.samsungbtn.click();

        a.click(menuPage.samsungs24btn).perform();

        addToCartPage.s24plusbtn.click();

        a.click(addToCartPage.bigaddtocartbtn).perform();

        Assert.assertEquals(addToCartPage.gotocartele.getText(), "Go to Cart");
    }

    @Test
    public void addingLaptop(){

        menuPage.menubtn.click();

        menuPage.brandsbtn.click();

        a.click(menuPage.asusbtn).perform();

        a.click(addToCartPage.premiumlapbtn).perform();

        a.click(addToCartPage.smalladdtocartbtn).perform();

        Assert.assertEquals(addToCartPage.gotocartele.getText(), "Go to Cart");
    }

    @Test
    public void addToCart(){

        driver.get("https://www.bestbuy.com/");

        menuPage.searchbtn.sendKeys("Cricket Bat");

        menuPage.searchbtn.sendKeys(Keys.ENTER);

        addToCartPage.pretoorderbtn.click();

        Assert.assertEquals(addToCartPage.gotocartele.getText(), "Go to Cart");
    }
}
