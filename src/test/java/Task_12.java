
import com.sun.org.apache.xml.internal.security.signature.reference.ReferenceNodeSetData;
import jdk.nashorn.internal.objects.NativeString;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.security.SecureRandom;
import java.util.List;
import java.util.concurrent.TimeUnit;
import  java.io.File;
import static org.apache.commons.lang3.RandomUtils.nextInt;

 public class Task_12 {

    @Test
    public void start() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lena\\Documents\\GitHub\\test-repository\\driver_chrome\\chromedriver.exe");
        final WebDriver driver = new ChromeDriver();

        driver.get("http://localhost/litecart/public_html/admin/login.php");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@name='remember_me']")).click();
        driver.findElement(By.xpath("//button[@name='login']")).click();


        driver.findElement(By.xpath("//div[@id='box-apps-menu-wrapper']//span[text()='Catalog']")).click();
        driver.findElement(By.xpath("(//td[@id='content']//a[@class='button'])[2]")).click();

         /*Fill out Ceneral tab */

        driver.findElement(By.xpath("(//label/input[@name='status'])[2]")).click();
        driver.findElement(By.xpath("//div[@id='tab-general']//input[@name='name[en]']")).sendKeys("Yellow Duck");

        int num =(int)(Math.random()*1000);
        driver.findElement(By.xpath("//div[@id='tab-general']//input[@name='code']")).sendKeys("12" + num);
        driver.findElement(By.xpath("//div[@class='input-wrapper']//input[@data-name='Rubber Ducks']")).click();

        Select category = new Select(driver.findElement(By.name("default_category_id")));
        category.selectByValue("1");

        driver.findElement(By.xpath("//div [@class='input-wrapper']//input[@ value='1-2' ]")).click();
        driver.findElement(By.xpath("//div[@ id='tab-general']//input [@name='quantity']")).sendKeys("");
        driver.findElement(By.name("quantity")).sendKeys("1");

        Select unit = new Select(driver.findElement(By.name("quantity_unit_id")));
        unit.selectByValue("1");
        Select deliveryStatus = new Select(driver.findElement(By.name("delivery_status_id")));
        deliveryStatus.selectByValue("1");
        Select soldOutStatus = new Select(driver.findElement(By.name("sold_out_status_id")));
        soldOutStatus.selectByValue("2");

         File f = new File("src/pictures/sponsor-a-duck.jpg");
         //String filepath = f.getAbsolutePath();
         driver.findElement(By.cssSelector("input[name='new_images[]']")).sendKeys(f.getAbsolutePath());
         driver.findElement(By.xpath("//input[@name='date_valid_from']")).sendKeys("10-09-2017");
         driver.findElement(By.xpath("//input[@name='date_valid_to']")).sendKeys("10-27-2017");
         driver.findElement(By.xpath("//div[@class='tabs']//a[text()='Information']")).click();

         /*Fill out Information tab */

         Select man= new Select(driver.findElement(By.cssSelector("select[name='manufacturer_id']")));
         man.selectByValue("1");
         Select sup=new Select(driver.findElement(By.cssSelector("select[name='supplier_id']")));
         sup.selectByValue("");

         driver.findElement(By.xpath("//input[@name='keywords']")).sendKeys("duck");
         driver.findElement(By.xpath("//input[@name='short_description[en]']")).sendKeys(" yellow duck");
         driver.findElement(By.xpath("//div[@class='trumbowyg-editor']")).sendKeys(" very cute yellow duck");
         driver.findElement(By.xpath("//input[@name='head_title[en]']")).sendKeys(" Yellow Duck");
         driver.findElement(By.xpath("//input[@name='meta_description[en]']")).sendKeys("Duck");
         driver.findElement(By.xpath("//div[@class='tabs']//a[text()='Prices']")).click();

         /* Fill out Prices tab*/

         driver.findElement(By.xpath("//input[@name='purchase_price']")).sendKeys("1");
         WebElement list = driver.findElement(By.xpath("//select[@name='purchase_price_currency_code']"));
         Select price = new Select(list);
         price.selectByValue("USD");
         driver.findElement(By.xpath("//input[@name='prices[USD]']")).sendKeys("15");
         driver.findElement(By.xpath("//input[@name='prices[EUR]']")).sendKeys("15");
         driver.findElement(By.xpath("//button[@name='save']")).click();

         /*Check if goods are present*/

        List<WebElement> productElements = driver.findElements(By.xpath("//*[@id='content']//td/a[contains(text(),'" + "Yellow Duck" + "')]"));
        Assert.assertTrue(productElements.size() > 0);










    }





        }









