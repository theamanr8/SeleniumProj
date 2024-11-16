import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Login extends TestUI{
    public void LoginAsTechnician() {
        WebDriver x = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        x.get("https://" + xPath.subDomain + ".serviceops.ai/login");
        x.manage().window().maximize();
        x.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        //Thread.sleep(2000);
        x.findElement(By.xpath(xPath.username)).sendKeys("aman");
        x.findElement(By.xpath(xPath.password)).sendKeys("admin@123");
        x.findElement(By.xpath(xPath.loginbutton)).click();
    }
}
