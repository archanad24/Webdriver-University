package Webdriver_university;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class file_upload {

	public static void main(String[] args) {
		

		
		System.setProperty("webdriver.chromedriver.driver", "C:\\Users\\Admin\\Desktop\\Automation\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://webdriveruniversity.com/File-Upload/index.html");
		
		driver.manage().window().maximize();
		
		WebElement fileupload=driver.findElement(By.id("myFile"));
		fileupload.sendKeys("C:\\Users\\Admin\\Downloads\\sunrise.arch.jpeg");
		
		WebElement submitbtn = driver.findElement(By.id("submit-button"));
		submitbtn.click();
	}

}
