package week2.day2.Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

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
		String name = driver.findElementByXPath("((//table[@class='x-grid3-row-table'])[1]//a)[3]").getText();
		WebElement row = driver.findElementByXPath("((//table[@class='x-grid3-row-table'])[1]//a)[1]");
		row.click();
		
		driver.findElementByLinkText("Duplicate Lead").click();
		
		if(driver.getTitle().contains("Duplicate Lead")){
			
			System.out.println("Duplicate lead - PageName");
		}
		//Thread.sleep(5000);
		driver.findElementByName("submitButton").click();
		//driver.findElementByXPath("//input[@value='Create Lead']").click();
		
		String duplicateName = driver.findElementById("viewLead_firstName_sp").getText();
		
		if(name.equals(duplicateName)){
			
			System.out.println("same");
		}
		else{
			
			System.out.println("not duplicate");
		}
				

	}

}
