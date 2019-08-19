package week4.day1.assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://testleaf.herokuapp.com");
		driver.findElementByLinkText("Alert").click();
		driver.findElementByXPath("//button[text()='Prompt Box']").click();
		
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("sabari");
		alert.accept();
		
		String text = driver.findElementById("result1").getText();
		
		boolean contains = text.contains("sabari");
		System.out.println(contains);
		
		driver.findElementByXPath("//button[text()='Line Breaks?']").click();
		
		String text2 = alert.getText();
		System.out.println(text2);
		
		alert.accept();
		
		driver.findElementByXPath("//img[@alt='logo Testleaf']").click();
		
		driver.findElementByLinkText("Frame").click();
		
		driver.switchTo().frame(0);
		
		driver.findElementById("Click").click();
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(2);
		
		driver.switchTo().frame("frame2");
		
		driver.findElementById("Click1").click();
		
		driver.switchTo().defaultContent();
		
		List<WebElement> list = driver.findElementsByTagName("iframe");
		System.out.println(list.size());
		
		
		
		
		
		
		

	}

}
