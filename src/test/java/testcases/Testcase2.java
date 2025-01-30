package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase2 {

    WebDriver driver;

    @BeforeClass
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void Fun_Test1() {
        driver.get("https://www.google.com/");
        System.out.println("==> Chrome Test 1 executed.");
    }

    @Test
    public void chromeBrowserTest2() {
        driver.get("https://www.gmail.com/");
        System.out.println("==> Chrome Test 2 executed.");
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
