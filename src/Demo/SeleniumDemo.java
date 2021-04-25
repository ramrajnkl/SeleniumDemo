package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;


public class SeleniumDemo {

	public static void main(String[] args) {
		
		//Initalize Chrome webdriver
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\RMJ\\eclipse-workspace\\SeleniumDemoProj\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			

		//Launch Webpage
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//Enter the Keyword in Search Box
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Java");

		// Click the Search button
		driver.findElement(By.id("nav-search-submit-button")).click();
			
		Assert.assertTrue(true);
		
		//Close the Webdriver
		driver.close();

	}

}
