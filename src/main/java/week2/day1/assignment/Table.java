package week2.day1.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();		
		driver.get("http://testleaf.herokuapp.com/pages/table.html");
		
		List<WebElement> column = driver.findElementsByXPath("//table//th");
	
		System.out.println(column.size());
		
		List<WebElement> rows = driver.findElementsByXPath("//table//td/parent::tr");
		System.out.println(rows.size());
		
		String progress = driver.findElementByXPath("//table//tr/td/font[contains(text(),'Learn to')]/following::font").getText();
        
		System.out.println(progress);
		
		List<WebElement> progressPercentage = driver.findElementsByXPath("//table//tr/td[2]/font");
		
		List<Integer> a = new ArrayList<Integer>();
		
		for (WebElement pro : progressPercentage) {
			
			String b=pro.getText();
			 b= b.replace("%", "");
			 a.add(Integer.parseInt(b));
		}
		
		Collections.sort(a);
		
		System.out.println(a);
		
		//Dynamic Xpath
		
		driver.findElementByXPath("//table//td/font[contains(text(),'"+a.get(0)+"')]/following::input").click();
		
		
		
		
		
	
		
		
		
		
		
		
	}

}
