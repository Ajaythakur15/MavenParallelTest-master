package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase1 {

    WebDriver driver;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void Reg_Test1() {
        driver.get("https://www.google.com/");
        System.out.println("==> Regression Test case 1 has run successfully...");
    }

    @Test
    public void chromeBrowserTest2() {
        driver.get("https://www.gmail.com/");
    }

    @AfterMethod
    public void teardown() {
        if (driver != null) {
            driver.quit();  // Ensures complete browser shutdown
        }
    }
}
