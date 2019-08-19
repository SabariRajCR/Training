package week2.day1.assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://testleaf.herokuapp.com/pages/checkbox.html");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElementByXPath("(//input[@type='checkbox'])[1]").click();
		
		boolean selected = driver.findElementByXPath("//label[text()='Confirm Selenium is checked']/following-sibling::input").isSelected();

		System.out.println("Check box is selected"+selected);
		
		driver.findElementByXPath("//label[text()='DeSelect only checked']/following-sibling::input[2]").click();
		
		WebElement inputs = driver.findElementByXPath("//label[text()='Select all below checkboxes ']/parent::div");
		List<WebElement> checkbox = inputs.findElements(By.tagName("input"));
		int size = checkbox.size();
		
		
		String xpath1 = "//label[text()='Select all below checkboxes ']/following-sibling::input[";
		String Xpath2 = "]";
		
		
		
		for(int i=1;i<=size;i++) {
			
			String x = xpath1+i+Xpath2;
			
			driver.findElementByXPath(x).click();
		}
		
		
	
	}

}
