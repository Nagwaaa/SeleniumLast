package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class AdvanceLocators {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        String name="Nagwa";
        driver.findElement(By.cssSelector("#inputUsername")).sendKeys(name);
        driver.findElement(By.cssSelector("input[name*='input']")).sendKeys("rahulshettyacademy");
        driver.findElement(By.xpath("//button[contains(@class,'signInBtn')]")).click();
        Thread.sleep(1000);
        String mes=driver.findElement(By.tagName("p")).getText();
        System.out.println(mes);
        Assert.assertEquals("You are successfully logged in.",mes);
        Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello "+name+",");
        driver.findElement(By.xpath("//button[text()='Log Out']")).click();
        driver.close();



    }
}
