package week4.day1.assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	/*	ChromeOptions options = new ChromeOptions();		
		options.addArguments("-disable-notifications");		
		ChromeDriver driver = new ChromeDriver(options);
		*/
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://leaftaps.com/opentaps");
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//span[text()='Phone']").click();
		WebElement no = driver.findElementByName("phoneCountryCode");
		no.sendKeys(Keys.TAB,"8",Keys.TAB,"9");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		
		WebElement result = driver.findElementByXPath("((//table[@class='x-grid3-row-table'])[1]/tbody/tr/td/div/a)[1]");
		String text = result.getText();
		result.click();
		
		driver.findElementByLinkText("Delete").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByName("id").sendKeys(text);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		
		String text2 = driver.findElementByXPath("//div[@class='x-paging-info']").getText();
		
		if(text2.equals("No records to display")){
			
			System.out.println("Successfully deleted");
		}
		else{
			
			System.out.println("Not deleted properly");
		}
		
		driver.close();
		
	}

}
	