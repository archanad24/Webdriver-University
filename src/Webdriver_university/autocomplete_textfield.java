package Webdriver_university;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autocomplete_textfield {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chromedriver.driver", "C:\\Users\\Admin\\Desktop\\Automation\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://webdriveruniversity.com/Autocomplete-TextField/autocomplete-textfield.html");
		
		driver.manage().window().maximize();
		
		WebElement Clickme=driver.findElement(By.id("myInput"));
		Clickme.click();
		Clickme.sendKeys("garlic");
		Clickme.sendKeys(Keys.ENTER);
		Clickme.submit();

	}

}
