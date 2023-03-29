package Test;
import Pages.HomePage;
import Pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.hc.core5.util.Asserts;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginWithValidData  extends TestBase{
        LoginPage login ;
        HomePage home ;
    @Test(priority = 1)
    public void TestLoginWithValidUsernameAndPassword()
    {
        login = new LoginPage(driver);
        login.fillLoginData("Admin","admin123");
        home = new HomePage(driver);

        //Assertion That System Redirect to index Page
        String actualUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
        String expectedUrl= driver.getCurrentUrl();
        Assert.assertEquals(actualUrl,expectedUrl);
        Assert.assertEquals(home.getTitle(),"Dashboard");
    }




//     WebDriver driver ;
//
//    @BeforeClass
//    public void open_browser(){
//        //install driver using hard coded location
//        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
//        //ChromeDriver driver = new ChromeDriver();
//
//        //install driver using import Webdriver Manager
//        //WebDriverManager.chromedriver().setup();
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--remote-allow-origins=*");
//        driver = new ChromeDriver(options);
//        // maximize the Screen
//        driver.manage().window().maximize();
//
//        //Visit Orange Website
//        String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
//        driver.get(url);
//    }
//    @Test
//    public void  LoginWithValidData(){
//        //Waiting for loading the Page
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
//
//        // get Element [Username] by Xpath
//        //WebElement username = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"));
//
//
//        //  get Element [Username] by Name
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
//        WebElement username =  driver.findElement(By.name("username"));
//        username.sendKeys("Admin");
//
//        // get Element [Password] by xpath
//       // WebElement password = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"));
//
//        //  get Element [Password] by Name
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
//        WebElement password =  driver.findElement(By.name("password"));
//        password.sendKeys("admin123");
//
//
//        //Login Action
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
//        String login_xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button";
//        WebElement login = driver.findElement(By.xpath(login_xpath));
//        login.click();
//        //Assertion That System Redirect to index Page
//        String actualUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
//        String expectedUrl= driver.getCurrentUrl();
//        Assert.assertEquals(actualUrl,expectedUrl);
//    }
//    @AfterClass
//    public  void close_browser(){
//        driver.close();
//    }



}
