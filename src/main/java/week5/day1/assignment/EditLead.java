package week5.day1.assignment;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import week5.day1.assignment.ProjectSpecificMethods;

public class EditLead extends ProjectSpecificMethods {
	@Test
	public void runEdit() throws InterruptedException {
		
		
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Find Leads").click();
		
		driver.findElementByXPath("//span[text()='Email']").click();
		driver.findElementByName("emailAddress").sendKeys(".com");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		
		Thread.sleep(10000);
		
		driver.findElementByXPath("((//table[@class='x-grid3-row-table'])[1]//a)[1]").click();;
		
		String title = driver.getTitle();
		//System.out.println(title);
		if(title.contains("View Lead")){
			
			System.out.println("True");
			
			
		}
		
		driver.findElementByLinkText("Edit").click();
		
		WebElement company = driver.findElementById("updateLeadForm_companyName");
		company.clear();
		company.sendKeys("Test Leaf");
		
		driver.findElementByXPath("//input[@value='Update']").click();
		
		String text = driver.findElementByXPath("//span[@id='viewLead_companyName_sp']").getText();
		
		if(text.contains("Test Leaf")){
			
			System.out.println("Match");
		}
		else{
			
			System.out.println("MisMatch");
			
		}
		
		
		
	}
	
}
