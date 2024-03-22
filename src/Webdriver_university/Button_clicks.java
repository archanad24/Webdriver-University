package Webdriver_university;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Button_clicks {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chromedriver.driver", "C:\\Users\\Admin\\Desktop\\Automation\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://webdriveruniversity.com/Click-Buttons/index.html");
		
		driver.manage().window().maximize();
		
		//WebElement clickme1=driver.findElement(By.xpath("//*[@id=\"button1\"]/p"));
		//clickme1.click();
		
	//	WebElement clickme2=driver.findElement(By.xpath("//*[@id=\"button2\"]"));
		//clickme2.click();
	
		WebElement clickme3=driver.findElement(By.xpath("//*[@id=\"button3\"]"));
		clickme3.click();
		

		
	}

}
