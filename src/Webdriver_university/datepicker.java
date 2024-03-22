package Webdriver_university;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class datepicker {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chromedriver.driver", "C:\\Users\\Admin\\Desktop\\Automation\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://webdriveruniversity.com/Datepicker/index.html");
		
		driver.manage().window().maximize();
		
		WebElement clickme=driver.findElement(By.xpath("//*[@id=\"datepicker\"]/span/i"));
		clickme.click();
		
		WebElement date=driver.findElement(By.xpath("/html/body/div[2]/div[1]/table/tbody/tr[2]/td[5]"));
		date.click();
		
		
		

	}

}
