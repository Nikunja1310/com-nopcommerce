package browsertesting;
/**
 * Project-1 - Project Name: com-nopcommerce
 * BaseUrl =
 * https://demo.nopcommerce.com/login?returnUrl=%2
 * F
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowser {
    public static void main(String[] args) {
        String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2\n";
        //Launch the google chrome
        WebDriver driver = new ChromeDriver();
        //open url in browser
        driver.get(baseUrl);
        //Maximise the browser
        driver.manage().window().maximize();
        //we give impilict weight to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //Get title of page
        String title = driver.getTitle();
        //print title
        System.out.println(title);

        //get the current url
        driver.getCurrentUrl();
        //print url
        System.out.println("Current URL : " + driver.getCurrentUrl());
        //Get page source
        System.out.println("Page source : " + driver.getPageSource());
        //find email address to email field element
        WebElement emailField = driver.findElement(By.id("Email"));
        //Tyoe the email address to email field element
        emailField.sendKeys("nikkisen13@gmail.com");
        //find the password field element and type the password
        driver.findElement(By.name("Password"));
        //Type teh password in password field
        driver.findElement(By.name("nik12345"));

        //Close the Browser
        driver.close();


    }
}
