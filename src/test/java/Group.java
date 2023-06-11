
import LsitenerDemo.liste;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(liste.class)
public class Group {

    WebDriver driver;
@Test(dataProvider = "Checking data Credential")
    public void Login(String ema,String pass)
    {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://tutorialsninja.com/demo/index.php?route=common/home");
        driver.findElement(By.xpath("//a[@title='My Account']")).click();
        driver.findElement(By.xpath("//a[text()='Login']")).click();
        driver.findElement(By.id("input-email")).sendKeys(ema);
        driver.findElement(By.id("input-password")).sendKeys(pass);
        driver.findElement(By.xpath("//input[@type='submi']")).click();
        driver.quit();

    }
    @DataProvider(name="Checking data Credential")
   public Object [][] Data()
   {
       Object [][] data={{"Sunnyk503@gmail.com","1234"},{"amotooricap9@gmail.com","1234"},{"abc@gmail.com","5678"}};
       return data;

   }
}

