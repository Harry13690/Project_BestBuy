package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenuPage {

    WebDriver driver;

    public MenuPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[text()='Menu']")
    public WebElement menubtn;

    @FindBy(xpath = "(//button[contains(@class,'top-four')])[1]")
    public WebElement dealsbtn;

    @FindBy(xpath = "(//button[contains(@class,'top-four')])[2]")
    public WebElement servicesbtn;

    @FindBy(xpath = "(//button[contains(@class,'top-four')])[3]")
    public WebElement brandsbtn;

    @FindBy(xpath = "(//a[text()='Top Deals'])[1]")
    public WebElement topdealsbtn;

    @FindBy(xpath = "(//a[contains(text(),'Visit')])[1]")
    public WebElement visitservicebtn;

    @FindBy(xpath = "//a[text()='Microsoft']")
    public WebElement microsoftbtn;

    @FindBy(xpath = "//button[text()='Cell Phones']")
    public WebElement cellphonebtn;

    @FindBy(xpath = "//button[text()='Samsung Galaxy']")
    public WebElement samsungbtn;

    @FindBy(xpath = "//a[text()='Samsung Galaxy S24']")
    public WebElement samsungs24btn;

    @FindBy(xpath = "(//a[text()='ASUS'])[1]")
    public WebElement asusbtn;

    @FindBy(id = "gh-search-input")
    public WebElement searchbtn;
}
