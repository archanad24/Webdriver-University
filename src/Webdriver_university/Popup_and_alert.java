package Webdriver_university;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup_and_alert {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.driver.chromedriver", "C:\\Users\\Admin\\Desktop\\Automation\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://webdriveruniversity.com/Popup-Alerts/index.html");
		
		driver.manage().window().maximize();
		
		//WebElement Click=driver.findElement(By.xpath("//*[@id=\"button1\"]/p"));
		//Click.click();
		//driver.switchTo().alert().dismiss();
		
	//	WebElement Click2=driver.findElement(By.xpath("//*[@id=\"button2\"]/p"));
	//	Click2.click();
	//	driver.switchTo().alert().dismiss();
		
	//	WebElement Click3=driver.findElement(By.xpath("//*[@id=\"button4\"]/p"));
	//	Click3.click();
	//	driver.switchTo().alert().accept();
		
		
	//	WebElement Click4=driver.findElement(By.xpath("//*[@id=\"button4\"]/p"));
	//	Click4.click();
	//	driver.switchTo().alert().dismiss();
		
		WebElement Click5=driver.findElement(By.xpath("//*[@id=\"button3\"]/p/a"));
		Click5.click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebElement Click6=driver.findElement(By.xpath("//*[@id=\"button1\"]/p"));
		Click6.click();
		driver.switchTo().alert().dismiss();
	

	}

}
