package week2.day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginPageClassRoomSession {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps");
		
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("TestLeaf");
		driver.findElementById("createLeadForm_firstName").sendKeys("Test");
		driver.findElementById("createLeadForm_lastName").sendKeys("2");
		
		//driver.findElementByName("submitButton").click();
		WebElement Marketing = driver.findElementById("createLeadForm_marketingCampaignId");
		
		Select Mark = new Select(Marketing);
		
		List<WebElement> options = Mark.getOptions();
		
		int size = options.size();
		
		Mark.selectByIndex(size-1);
		
		
		WebElement Industry = driver.findElementById("createLeadForm_industryEnumId");
		
		Select Ind = new Select(Industry);
		
/*		List<WebElement> options2 = Ind.getOptions();
		
		int size2 = options2.size();*/
		
		//Ind.selectByIndex(2);
		
		Ind.selectByValue("IND_HARDWARE");
		
				
	}

}
