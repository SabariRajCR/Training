package week2.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Erail {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://erail.in");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement from = driver.findElementById("txtStationFrom");
		from.clear();		
		from.sendKeys("Chennai",Keys.TAB);
		
		WebElement to = driver.findElementById("txtStationTo");
		to.clear();
		to.sendKeys("salem",Keys.TAB);
		
		WebElement table1 = driver.findElementByXPath("(//table[contains(@class,'TrainListHeader')])[1]");
		//WebElement table1 = driver.findElementByXPath("//div[@id='divTrainsList']/table[1]");
		
		
		int column = table1.findElements(By.tagName("td")).size();
		System.out.println(column);
		
		WebElement table2 = driver.findElementByXPath("(//table[contains(@class,'TrainListHeader')])[2]");
		List<WebElement> row = table2.findElements(By.tagName("tr"));
		int noOfRows=row.size();
		System.out.println(noOfRows);
		 //table2.findElements(by)
		//System.out.println(table2.findElement(By.tagName("tr"+noOfRows+));
        
		//table2.get(noOfRows);		
			 //WebElement lastrow = table2.findElements(By.tagName("tr")).get(noOfRows-1);
			 WebElement lastrow = row.get(noOfRows-1);
			 String text = lastrow.findElements(By.tagName("td")).get(0).getText();
			 System.out.println(text);
			 
			 //table2.findElements(By.tagName("tr")).get(noOfRows-1).findElements(By.tagName("td")).get(0).getText();
		
		
		
		
		
		
	}

}
