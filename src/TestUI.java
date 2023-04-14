import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

// This is Test 0
public class TestUI extends xPath {
    public static void main(String[] args) throws InterruptedException {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.print("Hello and welcome!");

            System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
            WebDriver x = new ChromeDriver();
            x.manage().window().maximize();
            x.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            x.get("https://sky.serviceops.ai/login");
            //Thread.sleep(2000);
            x.findElement(By.xpath(xPath.username)).sendKeys("lee@motadata.com");
            x.findElement(By.xpath(xPath.password)).sendKeys("admin@123");
            x.findElement(By.xpath(xPath.loginbutton)).click();
           // Thread.sleep(3000);
            x.findElement(By.xpath(xPath.admin)).click();
            x.navigate().refresh();



        }

    }



