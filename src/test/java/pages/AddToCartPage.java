package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage {

    private WebDriver driver;

    public AddToCartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[contains(text(),'Premium')]")
    public WebElement premiumlapbtn;

    @FindBy(xpath = "//a[contains(text(),'S24+')]")
    public WebElement s24plusbtn;

    @FindBy(xpath = "//button[contains(@style,'margin-bottom: 8px')]")
    public WebElement bigaddtocartbtn;

    @FindBy(xpath = "(//a[@href='/cart'])[2]")
    public WebElement gotocartele;

    @FindBy(xpath = "//button[text()='Add to Cart']")
    public WebElement smalladdtocartbtn;

    @FindBy(xpath = "(//button[text()='Pre-Order'])[1]")
    public WebElement pretoorderbtn;
}