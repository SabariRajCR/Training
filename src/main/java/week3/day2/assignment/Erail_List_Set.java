package week3.day2.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Erail_List_Set {

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
		to.sendKeys("Bangalore",Keys.TAB);
		
		/*WebElement table1 = driver.findElementByXPath("(//table[contains(@class,'TrainListHeader')])[1]");
		//WebElement table1 = driver.findElementByXPath("//div[@id='divTrainsList']/table[1]");
		
		
		int column = table1.findElements(By.tagName("td")).size();
		System.out.println(column);*/
		
		WebElement table2 = driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']");
		List<WebElement> row = table2.findElements(By.tagName("tr"));
		int noOfRows=row.size();
		System.out.println(noOfRows);
		
		//To get list of Train Names in ArrayList
		
		String xpath1 = "//table[@class='DataTable TrainList TrainListHeader']/tbody/tr[";
		String xpath2 ="]/td[2]/a";
		ArrayList<String> trainnames = new ArrayList<String>();
		for(int i=1;i<=noOfRows;i++) {
			
			WebElement column = driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']/tbody/tr["+i+"]");
			List<WebElement> td = column.findElements(By.tagName("td"));
			int size = td.size();
			/*if(i==12) {
				continue;
			}*/
			if(size!=0) {
			String list = xpath1+i+xpath2;
			
			String trainlist = driver.findElementByXPath(list).getText();
			//System.out.println(trainlist);
			trainnames.add(trainlist);
			
			
		}
		}
		
		
		System.out.println(trainnames.size());
		//sorting the arraylist
		Collections.sort(trainnames);
		//sorting the list in website to compare both website and our sorted list
		//driver.findElementByXPath("//b[text()='Train Name']").click();
		driver.findElementByLinkText("Train Name").click();
		
		ArrayList<String> trainnames2 = new ArrayList<String>();
		
		for(int i=1;i<noOfRows;i++) {
			
			String list = xpath1+i+xpath2;
			
			String trainlist = driver.findElementByXPath(list).getText();
			System.out.println(trainlist);
			trainnames2.add(trainlist);
			
			
		}
		
		System.out.println(trainnames2.size());
		//comparing both sorted using collection and website sorted
		boolean equals = trainnames.equals(trainnames2);
		System.out.println(equals);
		
		
		//To find the list of train numbers and push it in to set to find the duplicates
		String xpath3 = "//table[@class='DataTable TrainList TrainListHeader']/tbody/tr[";
		String xpath4 ="]/td[1]/a";
		
		//driver.findElement(By.linkText("Train")).click();
		
		ArrayList<String> trainNumbers = new ArrayList<String>();
		
		for(int i=1;i<noOfRows;i++) {
			
			String trNum = xpath3+i+xpath4;
			
			String trainlist = driver.findElementByXPath(trNum).getText();
			trainNumbers.add(trainlist);
			
			
		}
		System.out.println(trainNumbers);
		
		System.out.println("****************************");
		
		Set<String> trainNum = new TreeSet<String>(trainNumbers);
		
		System.out.println(trainNum);
		
		/*boolean equals2 = trainNumbers.equals(trainNum);
		System.out.println(equals2);
		*/
		if(trainNumbers.size()==trainNum.size()) {
			
			System.out.println("No Duplicates");
		}
		else {
			System.out.println("Has Duplicates");
		}
		
		

	}

	}
