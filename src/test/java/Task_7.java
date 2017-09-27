import org.apache.http.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.ByteArrayOutputStream;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

public class Task_7 {

    @Test
    public  void start () {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lena\\Documents\\GitHub\\test-repository\\driver_chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://localhost/litecart/public_html/admin/login.php");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();





        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@name='remember_me']")).click();
        driver.findElement(By.xpath("//button[@name='login']")).click();

        driver.findElement(By.xpath("//span[text()='Appearence']")).click();
        driver.findElement(By.xpath("//h1[@style='margin-top: 0px;']"));
        Assert.assertTrue(driver.findElement(By.xpath("//h1[@style='margin-top: 0px;']")).isDisplayed());
        driver.findElement(By.xpath("//span[text()='Logotype']")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("h1")).isDisplayed());
        driver.findElement(By.xpath("(//div[contains(@id,'box-apps')]//span[text()='Catalog'])[1]")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("h1")).isDisplayed());
        driver.findElement(By.cssSelector("div#box-apps-menu-wrapper li#doc-catalog")).click();
        driver.findElement(By.cssSelector("div#box-apps-menu-wrapper li#doc-product_groups")).click();
        driver.findElement(By.cssSelector("div#box-apps-menu-wrapper li#doc-option_groups")).click();
        driver.findElement(By.cssSelector("div#box-apps-menu-wrapper li#doc-manufacturers")).click();
        driver.findElement(By.cssSelector("div#box-apps-menu-wrapper li#doc-suppliers")).click();
        driver.findElement(By.cssSelector("div#box-apps-menu-wrapper li#doc-delivery_statuses")).click();
        driver.findElement(By.cssSelector("div#box-apps-menu-wrapper li#doc-sold_out_statuses")).click();
        driver.findElement(By.cssSelector("div#box-apps-menu-wrapper li#doc-quantity_units")).click();
        driver.findElement(By.cssSelector("div#box-apps-menu-wrapper li#doc-csv")).click();

        driver.findElement(By.xpath("//div[contains(@id,'box-apps')]//span[text()='Countries']")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("td#content h1")).isDisplayed());
        driver.findElement(By.xpath("//div[contains(@id,'box-apps')]//span[text()='Currencies']")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("td#content h1")).isDisplayed());
        driver.findElement(By.xpath("(//div[contains(@id,'box-apps')]//span[text()='Customers'])[1]")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("td#content h1")).isDisplayed());
        driver.findElement(By.cssSelector("div#box-apps-menu-wrapper li#doc-customers")).click();
        driver.findElement(By.cssSelector("div#box-apps-menu-wrapper li#doc-csv")).click();
        driver.findElement(By.cssSelector("div#box-apps-menu-wrapper li#doc-newsletter")).click();
        driver.findElement(By.xpath("//div[contains(@id,'box-apps')]//span[text()='Geo Zones']")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("td#content h1")).isDisplayed());
        driver.findElement(By.xpath("//div[contains(@id,'box-apps')]//span[text()='Languages']")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("td#content h1")).isDisplayed());
        driver.findElement(By.cssSelector("div#box-apps-menu-wrapper li#doc-languages")).click();
        driver.findElement(By.cssSelector("div#box-apps-menu-wrapper li#doc-storage_encoding")).click();
        driver.findElement(By.xpath("//div[contains(@id,'box-apps')]//span[text()='Modules']")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("td#content h1")).isDisplayed());
        driver.findElement(By.cssSelector("div#box-apps-menu-wrapper li#doc-jobs")).click();
        driver.findElement(By.cssSelector("div#box-apps-menu-wrapper li#doc-customer")).click();
        driver.findElement(By.cssSelector("div#box-apps-menu-wrapper li#doc-shipping")).click();
        driver.findElement(By.cssSelector("div#box-apps-menu-wrapper li#doc-payment")).click();
        driver.findElement(By.cssSelector("div#box-apps-menu-wrapper li#doc-order_total")).click();
        driver.findElement(By.cssSelector("div#box-apps-menu-wrapper li#doc-order_success")).click();
        driver.findElement(By.cssSelector("div#box-apps-menu-wrapper li#doc-order_action")).click();
        driver.findElement(By.xpath("//div[contains(@id,'box-apps')]//span[text()='Orders']")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("td#content h1")).isDisplayed());
        driver.findElement(By.cssSelector("div#box-apps-menu-wrapper li#doc-orders")).click();
        driver.findElement(By.cssSelector("div#box-apps-menu-wrapper li#doc-order_statuses")).click();
        driver.findElement(By.xpath("//div[contains(@id,'box-apps')]//span[text()='Pages']")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("td#content h1")).isDisplayed());
        driver.findElement(By.xpath("//div[contains(@id,'box-apps')]//span[text()='Reports']")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("td#content h1")).isDisplayed());
        driver.findElement(By.cssSelector("div#box-apps-menu-wrapper li#doc-monthly_sales")).click();
        driver.findElement(By.cssSelector("div#box-apps-menu-wrapper li#doc-most_sold_products")).click();
        driver.findElement(By.cssSelector("div#box-apps-menu-wrapper li#doc-most_shopping_customers")).click();
        driver.findElement(By.xpath("//div[contains(@id,'box-apps')]//span[text()='Settings']")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("td#content h1")).isDisplayed());
        driver.findElement(By.cssSelector("div#box-apps-menu-wrapper li#doc-store_info")).click();
        driver.findElement(By.cssSelector("div#box-apps-menu-wrapper li#doc-defaults")).click();
        driver.findElement(By.cssSelector("div#box-apps-menu-wrapper li#doc-general")).click();
        driver.findElement(By.cssSelector("div#box-apps-menu-wrapper li#doc-listings")).click();
        driver.findElement(By.cssSelector("div#box-apps-menu-wrapper li#doc-images")).click();
        driver.findElement(By.cssSelector("div#box-apps-menu-wrapper li#doc-checkout")).click();
        driver.findElement(By.cssSelector("div#box-apps-menu-wrapper li#doc-advanced")).click();
        driver.findElement(By.cssSelector("div#box-apps-menu-wrapper li#doc-security")).click();
        driver.findElement(By.xpath("//div[contains(@id,'box-apps')]//span[text()='Slides']")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("td#content h1")).isDisplayed());
        driver.findElement(By.xpath("//div[contains(@id,'box-apps')]//span[text()='Tax']")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("td#content h1")).isDisplayed());
        driver.findElement(By.cssSelector("div#box-apps-menu-wrapper li#doc-tax_classes")).click();
        driver.findElement(By.cssSelector("div#box-apps-menu-wrapper li#doc-tax_rates")).click();
        driver.findElement(By.xpath("//div[contains(@id,'box-apps')]//span[text()='Translations']")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("td#content h1")).isDisplayed());
        driver.findElement(By.cssSelector("div#box-apps-menu-wrapper li#doc-search")).click();
        driver.findElement(By.cssSelector("div#box-apps-menu-wrapper li#doc-scan")).click();
        driver.findElement(By.cssSelector("div#box-apps-menu-wrapper li#doc-csv")).click();
        driver.findElement(By.xpath("//div[contains(@id,'box-apps')]//span[text()='Users']")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("td#content h1")).isDisplayed());
        driver.findElement(By.xpath("//div[contains(@id,'box-apps')]//span[text()='vQmods']")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("td#content h1")).isDisplayed());
        driver.findElement(By.cssSelector("div#box-apps-menu-wrapper li#doc-vqmods")).click();

        driver.quit();























//
        //    driver.quit();

    }


    }








