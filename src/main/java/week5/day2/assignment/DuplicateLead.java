package week5.day2.assignment;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DuplicateLead extends ProjectSpecificMethods{
@Test
	public void runDuplicate() throws InterruptedException {
		
		
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
