package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://flipkart.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByXPath("//button[text()='✕']").click();
		//Thread.s
		WebElement Home = driver.findElementByXPath("//span[text()='Home & Furniture']");
		WebElement paintings = driver.findElementByXPath("//a[text()='Paintings']");
		
		//Actions class will not throw any exception if the action is not performed also
		
		Actions builder = new Actions(driver);
		
		//Whatever the method u use inside the actions class it should be ended with perform() method
		builder.moveToElement(Home).pause(5000).click(paintings).perform();
		//click(paintings).build().perform();
		//builder.moveToElement(driver.findElementByXPath("//span[text()='Baby & Kids']")).perform();
			
				

		
		
	}

}