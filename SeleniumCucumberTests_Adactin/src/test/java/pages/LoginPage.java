package pages;

import org.openqa.selenium.By;
import utility.BrowserDriver;

public class LoginPage extends BrowserDriver {

    public static String username_xpath = "//*[@id=\"username\"]";
    public static String password_xpath = "//*[@id=\"password\"]";

    public static String login_button_xpath = "//*[@id=\"login\"]";



    public static void sendkeys_username()
    {
        driver.findElement(By.xpath(username_xpath)).sendKeys("smisomshaba1");

    }

    public static void sendkeys_password()
    {
        driver.findElement(By.xpath(password_xpath)).sendKeys("EWCNBU");

    }

    public static void click_login_btn()
    {
        driver.findElement(By.xpath(login_button_xpath)).click();
    }



}
