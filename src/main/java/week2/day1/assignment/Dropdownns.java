package week2.day1.assignment;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownns {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://testleaf.herokuapp.com/pages/Dropdown.html");
		
		//SelectDropDown using SendKeys:
		driver.findElementByXPath("//option[text()='You can also use sendKeys to select']/parent::select").sendKeys("Selenium");

		//List Dropdowns
		driver.findElementByXPath("//select[@multiple]").sendKeys("Selenium");
		
		//Using Index
		WebElement dropdown = driver.findElementById("dropdown1");
		
		Select drop = new Select(dropdown);
		
		drop.selectByIndex(1);;
				
		//using text
		
		WebElement dropdown2 = driver.findElementByName("dropdown2");
		
		Select drop1 = new Select(dropdown2);
		
		drop1.selectByVisibleText("Selenium");
		
		//Select using value
		
		WebElement dropdown3 = driver.findElementById("dropdown3");
		
		Select drop2 = new Select(dropdown3);
		
		drop2.selectByValue("1");
		
		//number of options 
		
		WebElement dropdown4 = driver.findElementByClassName("dropdown");
		
		Select drop4 = new Select(dropdown4);
		
		
		List<WebElement> options = drop4.getOptions();
		
		int size = options.size();
		
		System.out.println(size);
		
	}

}
