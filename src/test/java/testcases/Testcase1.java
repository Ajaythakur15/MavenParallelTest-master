package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Testcase1 {

	@Test
	public void Reg_Test1() throws InterruptedException {
		//New changes from GitHub
		WebDriverManager.chromedriver().setup();
		//New changes from IntelliJ
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");	
		
		System.out.println("==> Regression Test case 1 has run successfully...");
		
		driver.close();
				
	}
	
	@Test
	public void chromeBrowserTest2() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.gmail.com/");	
		
		
		driver.close();
				
	}
	
	
	
	
}
