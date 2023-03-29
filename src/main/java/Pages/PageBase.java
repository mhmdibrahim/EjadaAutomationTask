package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class PageBase {
    protected WebDriver driver ;
    public PageBase(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void insertIntoElements(WebElement element ,String value){
        element.sendKeys(value);
    }
    public void clickOnElement(WebElement element){
        element.click();
    }
}
