package utility;


import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.Scenario;


public class Hooks {
    public static BrowserDriver driver;



    @Before
    public void setUp(){
        driver = new BrowserDriver();
    }


    @After(order = 2)
    public void takeScreenshot(Scenario scenario) {
        if (scenario.isFailed()) {
            // Take screenshot if scenario fails
            byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "screenshot");
        }
    }

    @After
    public void tearDown(){
        driver.close();
    }









}
