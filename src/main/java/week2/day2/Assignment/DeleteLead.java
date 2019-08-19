package week2.day2.Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		WebElement findLeads = driver.findElementByLinkText("Find Leads");
		findLeads.click();
		
		driver.findElementByXPath("//span[text()='Email']").click();
		driver.findElementByName("emailAddress").sendKeys(".com");
		WebElement search = driver.findElementByXPath("//button[text()='Find Leads']");
		search.click();
		
		Thread.sleep(5000);

		WebElement row = driver.findElementByXPath("((//table[@class='x-grid3-row-table'])[1]//a)[1]");
		String text = row.getText();
		row.click();
		
		driver.findElementByLinkText("Delete").click();
		driver.findElementByLinkText("Find Leads").click();
		//findLeads.click();
		driver.findElementByXPath("//input[@name='id']").sendKeys(text);
		//search.click();
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		String text2 = driver.findElementByXPath("//div[text()='No records to display']").getText();
		
		if(text2.equals("No records to display")){
			
			System.out.println("No records to display");
		}
		
		driver.close();
		
		
		

	}

}
