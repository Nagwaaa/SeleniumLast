package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class getPassword {


    public String getPass(WebDriver driver) throws InterruptedException {

        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("nagwaa");
        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("noga@mail");
        driver.findElement(By.xpath("//form/input[3]")).sendKeys("12345");
        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
        String userName=driver.findElement(By.className("infoMsg")).getText();
        String[] message=userName.split("'");
        return message[1];
    }
}
