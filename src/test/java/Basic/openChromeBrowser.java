package Basic;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openChromeBrowser {
    public static void main(String[] args) {
        //install driver using hard coded location
//        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
//        ChromeDriver driver = new ChromeDriver();

        //install driver using import Webdriver Manager
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
    }
}
