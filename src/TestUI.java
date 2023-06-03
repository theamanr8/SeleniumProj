import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.time.Duration;
import java.util.Objects;

// This is Test 0
public class TestUI extends xPath {
    public static void main(String[] args){
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver x = new ChromeDriver();
        x.manage().window().maximize();

        x.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        x.get("https://" + xPath.subDomain + ".serviceops.ai/login");
        //Thread.sleep(2000);
        x.findElement(By.xpath(xPath.username)).sendKeys("jk");
        x.findElement(By.xpath(xPath.password)).sendKeys("admin@123");
        x.findElement(By.xpath(xPath.loginbutton)).click();
        // Thread.sleep(3000);
        x.findElement(By.xpath(xPath.admin)).click();
        x.navigate().refresh();
        String a = x.getTitle();
        System.out.println(a);
        if (Objects.equals(a, "TECHNICIAN PORTAL")) {
            System.out.println("Test Passed ✅");
        } else {
            System.out.println("Test Fails");
        }


    }

}



