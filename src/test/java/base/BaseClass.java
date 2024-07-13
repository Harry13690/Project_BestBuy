package base;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import pages.*;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class BaseClass {

    protected static WebDriver driver;
    public Actions a;
    public SignUpPage signUpPage;
    public LoginPage loginPage;
    public MenuPage menuPage;
    public HomeLinksPage homeLinksPage;
    public AddToCartPage addToCartPage;
    public CheckOutPage checkOutPage;

    @Parameters("browser")
    @BeforeClass
    public void setUp(String browser){

        if(browser.equalsIgnoreCase("chrome")){
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--disable-notifications");
            driver = new ChromeDriver(options);
        } else if (browser.equalsIgnoreCase("firefox")) {
            FirefoxOptions options = new FirefoxOptions();
            options.addArguments("--disable-notifications");
            driver = new FirefoxDriver(options);
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.bestbuy.com/");
        a = new Actions(driver);
        signUpPage = new SignUpPage(driver);
        loginPage = new LoginPage(driver);
        menuPage = new MenuPage(driver);
        homeLinksPage = new HomeLinksPage(driver);
        addToCartPage = new AddToCartPage(driver);
        checkOutPage = new CheckOutPage(driver);
        signUpPage.countrybtn.click();
    }

    @AfterClass
    public void tearDown(){

        driver.quit();
    }

    public static String takeScreenshot(String testCaseName){
        TakesScreenshot takesScreenshot =(TakesScreenshot) driver;
        File srcFile = takesScreenshot.getScreenshotAs(OutputType.FILE);

        File destinationFile = new File("report/screenshots/"+ testCaseName + ".png");
        try {
            FileUtils.copyFile(srcFile,destinationFile);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String path = "<img src = " + destinationFile.getAbsolutePath() + "width = 200px height = 200px/>";
        Reporter.log(path);
        return destinationFile.getAbsolutePath();
    }
}
