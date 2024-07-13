package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeLinksPage {

    private WebDriver driver;

    public HomeLinksPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver , this);
    }

    @FindBy(xpath = "//a[contains(text(),'Conditions')]")
    public WebElement terandconlink;

    @FindBy(xpath = "//a[text()='Privacy']")
    public WebElement privacylink;

    @FindBy(xpath = "//a[contains(text(),'Do Not')]")
    public WebElement dontselllink;
}
