package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {

    private WebDriver driver;

    public SignUpPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//h4[text()='United States'])[1]")
    public WebElement countrybtn;

    @FindBy(xpath = "//span[text()='Account']")
    public WebElement accountbtn;

    @FindBy(xpath = "//a[text()='Create Account']")
    public WebElement createaccbtn;

    @FindBy(id = "firstName")
    public WebElement firstnamefield;

    @FindBy(id = "lastName")
    public WebElement lastnamefield;

    @FindBy(id = "email")
    public WebElement emailfield;

    @FindBy(id = "fld-p1")
    public WebElement passfield;

    @FindBy(id = "reenterPassword")
    public WebElement confirmpassfield;

    @FindBy(id = "phone")
    public WebElement phnofield;

    @FindBy(xpath = "//button[text()='Create an Account']")
    public WebElement createanaccbtn;
}
