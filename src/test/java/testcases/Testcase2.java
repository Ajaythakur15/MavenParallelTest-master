package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase2 {

	@Test
	public void firefoxBrowserTest1() throws InterruptedException {
		
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.google.com/");	
		
		driver.close();
				
	}
	
	@Test
	public void firefoxBrowserTest2() throws InterruptedException {
		
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.gmail.com/");	
	
		driver.close();
				
	}
}
