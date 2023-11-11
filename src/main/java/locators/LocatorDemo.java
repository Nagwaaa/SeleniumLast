package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LocatorDemo {

    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        driver =new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.id("inputUsername")).sendKeys("Nagwa");
        driver.findElement(By.name("inputPassword")).sendKeys("nagwa");
        driver.findElement(By.className("signInBtn")).click();
        String mess=driver.findElement(By.cssSelector(".error")).getText();
        System.out.println(mess);
        driver.findElement(By.linkText("Forgot your password?")).click();
        Thread.sleep(1000);
        getPassword p=new getPassword();
        String na=p.getPass(driver);
        driver.findElement(By.cssSelector(".go-to-login-btn")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Nagwa");
        driver.findElement(By.cssSelector("input[name*='input']")).sendKeys(na);
        driver.findElement(By.xpath("//button[contains(@class,'signInBtn')]")).click();

    }

}
