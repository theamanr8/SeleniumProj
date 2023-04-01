import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestUI {
    public static void main(String[] args) throws InterruptedException {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

            System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
            WebDriver x = new ChromeDriver();
            x.manage().window().maximize();
            x.get("https://sky.serviceops.ai/login");
            Thread.sleep(2000);
            x.findElement(By.xpath("//input[@id='username']")).sendKeys("lee@motadata.com");
            x.findElement(By.xpath("//input[@id='password']")).sendKeys("admin@123");
            x.findElement(By.xpath("//button[@id='login-btn']")).click();


        }

    }



