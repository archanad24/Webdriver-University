package Webdriver_university;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class appear_disappear {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chromedriver.driver", "C:\\Users\\Admin\\Desktop\\Automation\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://webdriveruniversity.com/Accordion/index.html");
		
		driver.manage().window().maximize();
		
		WebElement Automation = driver.findElement(By.id("automation-accordion"));
		Automation.click();
		


	}

}
