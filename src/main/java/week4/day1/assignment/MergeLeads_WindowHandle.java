package week4.day1.assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MergeLeads_WindowHandle {

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
		WebElement findLeads = driver.findElementByLinkText("Merge Leads");
		findLeads.click();
		driver.findElementByXPath("(//img[@src='/images/fieldlookup.gif'])[1]").click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		List<String> windowlist = new ArrayList<String>(windowHandles);
		int size = windowlist.size();
		System.out.println(size);
		
		driver.switchTo().window(windowlist.get(1));
		
		driver.findElementByName("firstName").sendKeys("a");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(3000);
		
		WebElement first = driver.findElementByXPath("((//table[@class='x-grid3-row-table'])[1]/tbody/tr/td)[1]/div/a");
		String text = first.getText();
		System.out.println(text);
		first.click();
		
		Thread.sleep(3000);
		
		
		driver.switchTo().window(windowlist.get(0));
		
		System.out.println(driver.getTitle());
		
		String attribute = driver.findElementById("ComboBox_partyIdFrom").getAttribute("valuenow");
		
		System.out.println(attribute);
		
		driver.findElementByXPath("(//img[@src='/images/fieldlookup.gif'])[2]").click();
		
		
		Set<String> windowHandles2 = driver.getWindowHandles();
		
		List<String> windowlist2 = new ArrayList<String>(windowHandles2);
		int size2 = windowlist.size();
		System.out.println(size2);
		
		driver.switchTo().window(windowlist2.get(1));
		driver.findElementByName("firstName").sendKeys("c");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(3000);
		
		
		driver.findElementByXPath("((//table[@class='x-grid3-row-table'])[1]/tbody/tr/td)[1]/div/a").click();
		
		Thread.sleep(3000);		
		
		driver.switchTo().window(windowlist2.get(0));
		
		driver.findElementByLinkText("Merge").click();
		
		driver.switchTo().alert().accept();
		
		Thread.sleep(3000);
		
		driver.findElementByLinkText("Find Leads").click();
		
		driver.findElementByName("id").sendKeys(text);
		
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		
		String text2 = driver.findElementByXPath("//div[@class='x-paging-info']").getText();
		
		if(text2.equals("No records to display")){
			
			System.out.println("No records to display");
		}
		
		
		
		
		
		
	}

}
