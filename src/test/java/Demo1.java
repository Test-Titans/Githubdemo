import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.lang3.builder.ToStringExclude;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo1 {
    @Parameters({"url","email","password"})
    @Test(enabled = true)
    public static void Method1(@Optional("https://www.facebook.com/>") String URL, String mail, String pass)//URL and url need not be same but url inside testng.xml and parameters should be same
    {
        WebDriverManager.chromedriver().setup();
        System.out.println("Branden added new changes");
        System.out.println("Added new changes");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL);
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys(mail);
        WebElement password=driver.findElement(By.id("pass"));
        password.sendKeys(pass);
        email.clear();
        WebElement login = driver.findElement(By.name("login"));
        login.click();

    }
}
