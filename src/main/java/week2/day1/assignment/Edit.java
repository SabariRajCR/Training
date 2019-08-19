package week2.day1.assignment;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Edit {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://testleaf.herokuapp.com/pages/Edit.html");
		
		WebElement email = driver.findElementById("email");
		email.clear();		
		email.sendKeys("sabarirajavel@gmail.com");
				
		driver.findElementByXPath("//input[@value='Append ']").sendKeys("Success");
		String text = driver.findElementByXPath("(//input[@name='username'])[1]").getAttribute("value");
		System.out.println(text);
		driver.findElementByXPath("(//input[@name='username'])[2]").clear();
		boolean enabled = driver.findElementByXPath("//input[@disabled='true']").isEnabled();
		
		if(enabled){
			
			System.out.println("false");
		}else{
		
		System.out.println("True");
	}

}
}
