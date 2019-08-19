package week5.day1.assignment;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import week5.day1.assignment.ProjectSpecificMethods;

public class DeleteLead extends ProjectSpecificMethods {
    @Test
	public void runDeleteLead() throws InterruptedException {
		
		
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//span[text()='Phone']").click();
		WebElement no = driver.findElementByName("phoneCountryCode");
		no.sendKeys(Keys.TAB,"",Keys.TAB,"9");
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
		
		
		
	}

}
	