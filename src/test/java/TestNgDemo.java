import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class TestNgDemo {

    WebDriver driver;

    @BeforeMethod
    @Parameters("Url")
    public void setup(@Optional("https://www.facebook.com/")String URL)
    {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get(URL);

    }
    //Smoke +sanity Test

    @Test(priority = 1,groups = {"Smoke","Sanity"})
    @Parameters({"email","pwd"})
    public  void  methodC(String Email,String Pwd)
    {

      driver.findElement(By.id("email")).sendKeys(Email);
      driver.findElement(By.id("pass")).sendKeys(Pwd);


    }


    //Regression+Smoke
    @Test(priority = 2,groups = {"Smoke","Regression"})
    public void  method2()
    {

        driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("1234");



    }

    @AfterMethod
    public void teardown()
    {
        driver.quit();

    }

}
