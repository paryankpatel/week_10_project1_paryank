package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {
    public static void main(String[] args) {
        String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2";
        //Launch the chrome
        WebDriver driver = new ChromeDriver();
        //Open URL into browser
        driver.get(baseUrl);

        //Maximise browser
        driver.manage().window().maximize();

        //Print the title of the page
        System.out.println("Title :" + driver.getTitle());
        //Print the current url
        System.out.println("Current url: " + driver.getCurrentUrl());
        // Print the page source
        System.out.println("Page source :" + driver.getPageSource());
        //Enter the email  to email field
        driver.findElement(By.id("Email")).sendKeys("paryank18us@gmail.com");
        //Enter the password to password field
        driver.findElement(By.id("Password")).sendKeys("Paryank123");
        //Close the browser
        driver.close();

    }
}
