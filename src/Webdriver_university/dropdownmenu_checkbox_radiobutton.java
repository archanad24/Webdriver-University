package Webdriver_university;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownmenu_checkbox_radiobutton {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.driver.chromedriver", "C:\\Users\\Admin\\Desktop\\Automation\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		
		driver.manage().window().maximize();
		
		//DROPDOWNMENU
		
		//Select dropJava=new Select(driver.findElement(By.xpath("//*[@id=\"dropdowm-menu-1\"]")));
		//dropJava.selectByVisibleText("SQL");
		
	//	Select dropEclipse=new Select(driver.findElement(By.xpath("//*[@id=\"dropdowm-menu-2\"]")));
	//	dropEclipse.selectByVisibleText("JUnit");
		
		//Select dropHTML=new Select(driver.findElement(By.xpath("//*[@id=\"dropdowm-menu-3\"]")));
		//dropHTML.selectByVisibleText("CSS");
		
		//CHECKBOX
		
		WebElement Checkbox=driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/label[3]"));
		Checkbox.click();
//	WebElement Checkbox1= driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/label[1]/input"));
//	Checkbox1.click();
		//WebElement Checkbox2=driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/label[2]"));
		//Checkbox2.click();
		//WebElement Checkbox3=driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/label[3]"));
		//Checkbox3.click();
		//WebElement Checkbox4=driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/label[4]"));
		//Checkbox4.click();
		
		//RADIOBUTTON
		
		//WebElement Radiobutton1=driver.findElement(By.xpath("//*[@id=\"radio-buttons\"]/input[1]"));
		//Radiobutton1.click();
		//WebElement Radiobutton2=driver.findElement(By.xpath("//*[@id=\"radio-buttons\"]/input[2]"));
		//Radiobutton2.click();
		//WebElement Radiobutton3=driver.findElement(By.xpath("//*[@id=\"radio-buttons\"]/input[3]"));
		//Radiobutton3.click();
		//WebElement Radiobutton4=driver.findElement(By.xpath("//*[@id=\"radio-buttons\"]/input[4]"));
		//Radiobutton4.click();
		//WebElement Radiobutton5=driver.findElement(By.xpath("//*[@id=\"radio-buttons\"]/input[5]"));
		//Radiobutton5.click();
		
		
		//SELECTED&DISABLED
		
		//WebElement Lettuce=driver.findElement(By.xpath("//*[@id=\"radio-buttons-selected-disabled\"]/input[1]"));
		//Lettuce.click();
		//WebElement Pumpkin=driver.findElement(By.xpath("//*[@id=\"radio-buttons-selected-disabled\"]/input[2]"));
		//Pumpkin.click();
		
		
		

		
		
		

		

	}

}
