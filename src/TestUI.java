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




        Login login = new Login();
        login.LoginAsTechnician();


        CRUD_HardwareAsset create = new CRUD_HardwareAsset();
        create.CreateAsset();
        // comment of end of execution


    }

}



