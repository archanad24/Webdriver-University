package Webdriver_university;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class To_do_list {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chromedriver.driver", "C:\\Users\\Admin\\Desktop\\Automation\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://webdriveruniversity.com/To-Do-List/index.html");
		
		driver.manage().window().maximize();
		
		WebElement Add_new_todo=driver.findElement(By.xpath("//*[@id=\"container\"]/input"));
		Add_new_todo.sendKeys("clean room");
		Add_new_todo.sendKeys(Keys.ENTER);
		
		

	}

}
