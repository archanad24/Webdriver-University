package Webdriver_university;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class contact_us {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chromedriver.driver", "C:\\Users\\Admin\\Desktop\\Automation\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://webdriveruniversity.com/Contact-Us/contactus.html");
	
	driver.manage().window().maximize();
	
	WebElement Firstname=driver.findElement(By.xpath("//*[@id=\"contact_form\"]/input[1]"));
	Firstname.sendKeys("Archana");
	
	WebElement Lastname=driver.findElement(By.xpath("//*[@id=\"contact_form\"]/input[2]"));
	Lastname.sendKeys("Raju");
	
	WebElement Emailaddress=driver.findElement(By.xpath("//*[@id=\"contact_form\"]/input[3]"));
	Emailaddress.sendKeys("archana20tr@gmail.com");
	
	WebElement Comments=driver.findElement((By.xpath("//*[@id=\"contact_form\"]/textarea")));
	Comments.sendKeys("Helpful");
	
	WebElement Submit=driver.findElement(By.xpath("//*[@id=\"form_buttons\"]/input[2]"));
	Submit.click();
	
	
	
	
	
	
	}

}
