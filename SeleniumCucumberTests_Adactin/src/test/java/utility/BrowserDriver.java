package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;


public class BrowserDriver {
    public static WebDriver driver;
    public static EdgeOptions options;

    public BrowserDriver(){
        options = new EdgeOptions();
        options.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+ "/src/test/resources/drivers/msedgedriver");
        this.driver = new EdgeDriver();
        driver.get("https://adactinhotelapp.com/index.php");
    };
    public void close(){
        this.driver.close();
    }
}
