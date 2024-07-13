package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage {

    private WebDriver driver;

    public CheckOutPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[text()='Checkout']")
    public WebElement checkoutbtn;

    @FindBy(xpath = "//button[contains(text(),'Guest')]")
    public WebElement asguestbtn;
}
