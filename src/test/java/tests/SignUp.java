package tests;

import base.BaseClass;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SignUp extends BaseClass {

    @Test
    public void createAccount() {

        a.click(signUpPage.createaccbtn).click().perform();

        signUpPage.firstnamefield.sendKeys("hihi5");

        signUpPage.lastnamefield.sendKeys("byebye5");

        signUpPage.emailfield.sendKeys("email@gmail12345.com");

        signUpPage.passfield.sendKeys("A123456789z@");

        signUpPage.confirmpassfield.sendKeys("A123456789z@");

        signUpPage.phnofield.sendKeys("5367743437");

        signUpPage.createanaccbtn.click();
    }
}
