import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CRUD_HardwareAsset extends TestUI {

    public  void CreateAsset() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver x = new ChromeDriver();

        x.findElement(By.xpath(createNew)).click();
    }

}
