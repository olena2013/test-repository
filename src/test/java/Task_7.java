import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Task_7 {
    @Test
    public void start() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lena\\Documents\\GitHub\\test-repository\\driver_chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://localhost/litecart/public_html/admin/login.php");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@name='remember_me']")).click();
        driver.findElement(By.xpath("//button[@name='login']")).click();


        List<WebElement> titles = driver.findElements(By.cssSelector("#app-"));
        for (int i = 0; i < titles.size(); i++) {
            List<WebElement> elements = driver.findElements(By.cssSelector("#app-"));
            elements.get(i).click();
            driver.findElement(By.cssSelector("td#content h1"));

            List<WebElement> subTitles = driver.findElements(By.cssSelector("#app-.selected ul a"));
            for (int a = 0; a < subTitles.size(); a++) {
                List<WebElement> subElementsOnPage = driver.findElements(By.cssSelector("#app-.selected ul a"));
                subElementsOnPage.get(a).click();
                driver.findElement(By.cssSelector("td#content h1"));
            }
        }



    }



}


































