import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class zadanie6 {

    private static WebDriver driver;

   @BeforeClass
   public static void setUp(){
       driver = new ChromeDriver();

   }
    @Test
    public void zadanie6() {
       driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
       driver.findElement(By.className("oxd-input oxd-input--active")).sendKeys("Admin");
    }

}
