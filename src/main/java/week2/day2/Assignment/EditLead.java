package week2.day2.Assignment;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class EditLead {
	
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
		
		driver.close();
		
	}
	
}
