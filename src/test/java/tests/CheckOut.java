package tests;

import base.BaseClass;
import org.testng.annotations.Test;

public class CheckOut extends BaseClass {

    @Test
    public void addingPayment(){

        menuPage.menubtn.click();

        menuPage.brandsbtn.click();

        a.click(menuPage.asusbtn).perform();

        a.click(addToCartPage.premiumlapbtn).perform();

        a.click(addToCartPage.smalladdtocartbtn).perform();

        addToCartPage.gotocartele.click();
    }
}
