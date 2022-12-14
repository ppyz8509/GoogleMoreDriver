import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

class GoogleTest {

	@Test
	void test() throws Exception {		
		WebDriver driver = null;
		String browser = "edge";
		
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "D:\\msedgedriver.exe");
			driver = new EdgeDriver(); 
		}
		
		
		driver.get("http://www.google.com");
	    driver.manage().window().setSize(new Dimension(1600, 860));
	    driver.findElement(By.name("q")).click();
	    driver.findElement(By.xpath("//input[@name=\'q\']")).sendKeys("npru");
	    driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.quit();
	}

}
