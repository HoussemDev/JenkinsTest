import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class UrlTest {
    WebDriver driver = null;


    @Test
    public void openUrl( ) {
//        System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/drivers/geckodriver");
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver");
//        driver = new ChromeDriver();
//        driver = new FirefoxDriver();
        ChromeOptions op = new ChromeOptions();
        op.addArguments("--headless");
        op.addArguments("--window-size=1920,1080");
        driver = new ChromeDriver(op);
       driver.navigate().to("https://www.google.com/");

    }


//
//    @AfterMethod
//    public void closeDriver( ) {
//     driver.quit();
//    }


}
