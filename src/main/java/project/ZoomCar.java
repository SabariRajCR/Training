package project;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZoomCar {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.zoomcar.com/chennai");
		driver.findElementByLinkText("Start your wonderful journey").click();
		
		
		//driver.findElementByXPath("//div[@class='close']").click();
		
		driver.findElementByXPath("//div[contains(text(),'Nelson Manickam Road')]").click();
		
		driver.findElementByXPath("//button[text()='Next']").click();
		
		Date date = new Date();
		
		DateFormat a = new SimpleDateFormat("dd");
		
		String today = a.format(date);
		
		int tommorow = Integer.parseInt(today)+1;
		int tommorow2 = Integer.parseInt(today)+2;
		
		//System.out.println(tommorow);
		
		driver.findElementByXPath("//div[contains(text(),'"+tommorow+"')]").click();
		driver.findElementByXPath("//button[text()='Next']").click();
		Thread.sleep(5000);
		driver.findElementByXPath("//div[@class='days']/div[contains(text(),'"+tommorow2+"')]").click();
		driver.findElementByXPath("//button[text()='Done']").click();
		
	/*	if
		(driver.findElementByXPath("//div[@class='days']//div[contains(text(),'"+tommorow+"')]").isSelected()) {
			
			driver.findElementByXPath("//button[text()='Done']").click();
		}else {
			
			driver.findElementByXPath("//div[@class='days']//div[contains(text(),'"+tommorow+"')]").click();
			driver.findElementByXPath("//button[text()='Done']").click();
			
			
		}*/
		
		
		WebElement list = driver.findElementByXPath("//div[@class='car-list-layout']");
		List<WebElement> carlist = list.findElements(By.xpath("//div[@class='car-listing']"));
		
		System.out.println(carlist.size());
		
		driver.findElementByXPath("//div[contains(text(),' Price: High to Low ')]").click();
		
		
		WebElement bookcar = driver.findElementByXPath("(//div[@class='car-listing'])[1]//h3");
		System.out.println(bookcar.getText());
		
		driver.findElementByXPath("//div[@class='car-listing'][1]//button").click();
		
		System.out.println("Success");
		
		driver.close();
		
		
		
		
		

	}

}
