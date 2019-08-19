package week5.day2.assignment;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class CreateLead extends ProjectSpecificMethods {
	@DataProvider(name = "data")
	public Object[][] requiredData() {
		
		Object[][] data = new Object[2][3];
		data[0][0] ="capgemini";
		data[0][1] ="sabari";
		data[0][2] ="raj";
		data[1][0] ="capgemini";
		data[1][1] ="sabari2";
		data[1][2] ="raj2";
		
		return data;

	}
	@Test(dataProvider = "data")
	public void runCreateLead(String cn,String fn,String ln) {
		
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys(cn);
		driver.findElementById("createLeadForm_firstName").sendKeys(fn);
		driver.findElementById("createLeadForm_lastName").sendKeys(ln);
		driver.findElementByName("submitButton").click();
		
	}
}
