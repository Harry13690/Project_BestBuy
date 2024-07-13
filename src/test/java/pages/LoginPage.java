package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[text()='Sign In']")
    public WebElement tosignin;

    @FindBy(xpath = "//input[@type='email']")
    public WebElement emailfield;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement passfield;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signinbtn;
}
