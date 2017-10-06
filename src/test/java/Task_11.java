import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

public class Task_11 {


   @Test
    public void start() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lena\\Documents\\GitHub\\test-repository\\driver_chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://localhost/litecart/public_html/en/");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//form[@name='login_form']//a[text()='New customers click here']")).click();
        driver.findElement(By.name("tax_id")).sendKeys("123");
        driver.findElement(By.name("company")).sendKeys("Novo");
        driver.findElement(By.name("firstname")).sendKeys("Ivan");
        driver.findElement(By.name("lastname")).sendKeys("Ivanov");
        driver.findElement(By.name("address1")).sendKeys("123 Main St");
        driver.findElement(By.name("postcode")).sendKeys("33452");
        driver.findElement(By.name("city")).sendKeys("San Francisco");
        driver.findElement(By.xpath("//span[@class='selection']")).click();

        Select country = new Select(driver.findElement(By.cssSelector(".select2-hidden-accessible")));
        country.selectByValue("US");
        driver.findElement(By.xpath("//span[@class='select2-results']//li[text()='United States']")).click();

        Select zone = new Select(driver.findElement(By.xpath("//select[@name='zone_code']")));
        zone.selectByValue("CA");
        // Create random email
        int ran;
        ran = 10 + (int) (Math.random() * ((100 - 10) + 1));
        String randomEmail = "user" + ran + "@test.com";
        driver.findElement(By.name("email")).sendKeys(randomEmail);


        driver.findElement(By.name("phone")).sendKeys("1234537726");
        driver.findElement(By.name("newsletter")).click();
        driver.findElement(By.name("password")).sendKeys("Admin");
        driver.findElement(By.name("confirmed_password")).sendKeys("Admin");
        driver.findElement(By.name("create_account")).click();

        driver.findElement(By.xpath("//div[@class='content']//a[text()='Logout']")).click();

        driver.findElement(By.name("email")).sendKeys(randomEmail);
        driver.findElement(By.name("password")).sendKeys("Admin");
        driver.findElement(By.name("login")).click();

        driver.findElement(By.xpath("//div[@class='content']//a[text()='Logout']")).click();




    }


}
