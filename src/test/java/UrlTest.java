import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class UrlTest {
    WebDriver driver;

    @Test
    public void openUrl( ) {
        System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/drivers/geckodriver");
//        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver");
//        driver = new ChromeDriver();
        driver = new FirefoxDriver();
        driver.navigate().to("https://www.google.com/");
    }



    @AfterMethod
    public void closeDriver( ) {
     driver.close();
    }


}
