import com.google.common.base.Function;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.Point;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.*;
import xpath.xpath;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.text.Document;
import java.awt.*;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;


public class Demo extends xpath {
    static WebDriver driver = null;

    public static void main(String[] args) throws InterruptedException, AWTException, IOException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.opencart.com/admin/");
        driver.findElement(By.id("input-username")).sendKeys("demo");
        driver.findElement(By.id("input-password")).sendKeys("demo");
        driver.findElement(By.xpath("//button")).click();
        Thread.sleep(3000);
        driver.findElement(By.className("btn-close")).click();
        driver.findElement(By.xpath("//a[text()=' Sales']")).click();
        driver.findElement(By.xpath("//a[text()='Orders']")).click();
        // WebElement FirstName = driver.findElement(By.id("datepicker"));
        System.out.println(driver.findElement(By.xpath("//tbody//tr[6]/td[4]")).getText());
        Robot rob=new Robot();
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        Rectangle rect=new Rectangle(d);
        BufferedImage buff= rob.createScreenCapture(rect);
        String dest=System.getProperty("user.dir")+"//Screenshots//robo.png";
        ImageIO.write(buff,"png",new File(dest));

    }
}

