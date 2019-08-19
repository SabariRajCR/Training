package week5.day2.TestNgExcel;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class CreateLead extends ProjectSpecificMethods {
	@BeforeTest
	public void testSetUp() {
		excelFileName = "createLeadData";
	}
	
	@Test(dataProvider = "fetchData")
	public void runCreateLead(String fN, String cName, String lN) {
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName")
		.sendKeys(cName);
		driver.findElementById("createLeadForm_firstName")
		.sendKeys(fN);
		driver.findElementById("createLeadForm_lastName")
		.sendKeys(lN);
		driver.findElementByName("submitButton").click();
	}
}
