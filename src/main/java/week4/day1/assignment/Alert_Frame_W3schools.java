package week4.day1.assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Frame_W3schools {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		
		driver.switchTo().frame(0);
		driver.findElementByXPath("//button[text()='Try it']").click();
		
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("sabari");
		alert.accept();
		String text = driver.findElementByTagName("p").getText();
		
		if(text.contains("sabari")) {
			
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		
		driver.switchTo().defaultContent();
		
		

	}

}
