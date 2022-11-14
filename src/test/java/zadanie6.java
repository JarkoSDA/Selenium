import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class zadanie6 {

    private WebDriver driver;

   @Before
   public void setUp(){
       driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

   }
    @Test
    public void zadanie6() {
       driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
       driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin");
       driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("admin123");
       driver.findElement(By.tagName("button")).click();
       Assert.assertEquals("Dashboard", driver.findElement(By.tagName("h6")).getText());
       //driver.close();

    }

    @Test
    public void zadanie6_1() {
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin");
        driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("admin123");
        driver.findElement(By.tagName("button")).click();
        Assert.assertEquals("Dashboard", driver.findElement(By.tagName("h6")).getText());
        //driver.close();

    }

    @After
    public void tearDown(){
        driver.close();
    }
}

