package Webdriver_university;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_portal {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.driver.chromedriver", "C:\\Users\\Admin\\Desktop\\Automation\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://webdriveruniversity.com/Login-Portal/index.html");
		
		driver.manage().window().maximize();
		
		WebElement Username=driver.findElement(By.id("text"));
		Username.sendKeys("archana");
		
		WebElement Password=driver.findElement(By.id("password"));
		Password.sendKeys("12345");
		
		WebElement Login=driver.findElement(By.id("login-button"));
		Login.click();
		

	}

}
