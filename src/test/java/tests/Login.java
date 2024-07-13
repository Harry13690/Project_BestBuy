package tests;

import base.BaseClass;
import org.testng.annotations.Test;

public class Login extends BaseClass {

    @Test(priority = 1)
    public void validLogin(){

        signUpPage.accountbtn.click();

        loginPage.tosignin.click();

        loginPage.emailfield.sendKeys("harrypotter12@gmail.com");

        loginPage.passfield.sendKeys("one1+two2=three3");

        loginPage.signinbtn.click();
    }

    @Test(priority = 2)
    public void invalidLogin1(){

        driver.get("https://www.bestbuy.com/");

        signUpPage.accountbtn.click();

        loginPage.tosignin.click();

        loginPage.emailfield.sendKeys("dummy123@gmail.com");

        loginPage.passfield.sendKeys("one1+two2=three3");

        loginPage.signinbtn.click();
    }

    @Test(priority = 3)
    public void invalidLogin2(){

        driver.get("https://www.bestbuy.com/");

        signUpPage.accountbtn.click();

        loginPage.tosignin.click();

        loginPage.emailfield.sendKeys("hariprasathmac@gmail.com");

        loginPage.passfield.sendKeys("dummy@123");

        loginPage.signinbtn.click();
    }

    @Test(priority = 4)
    public void validLogin3(){

        driver.get("https://www.bestbuy.com/");

        signUpPage.accountbtn.click();

        loginPage.tosignin.click();

        loginPage.emailfield.sendKeys("dummy123@gmail.com");

        loginPage.passfield.sendKeys("dummy@123");

        loginPage.signinbtn.click();
    }
}
