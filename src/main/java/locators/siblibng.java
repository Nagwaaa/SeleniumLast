package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class siblibng {


    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        String na=driver.findElement(By.xpath("//header/div/button/following-sibling::button")).getText();
        System.out.println(na);
        WebElement ele=driver.findElement(By.xpath("//header/div/button/parent::div"));
        System.out.println(ele.getCssValue("display"));
    }
}
