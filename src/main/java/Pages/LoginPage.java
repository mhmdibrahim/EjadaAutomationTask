package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase{
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(name = "username")
    WebElement Username ;

    @FindBy(name = "password")
    WebElement Password ;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
    WebElement login ;

    public void fillLoginData(String user , String pass)
    {
        insertIntoElements(Username,user);
        insertIntoElements(Password,pass);
        clickOnElement(login);
        //username.sendKeys(Username);
       // password.sendKeys(Password);//login.click();
    }
}
