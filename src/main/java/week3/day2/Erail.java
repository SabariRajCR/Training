package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Erail {
	public static void main(String[] args) throws InterruptedException {
		// Basic code to Open the Browser, maximise and set the timeout
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// Enter the origin
		WebElement origin = driver.findElementById("txtStationFrom");
		origin.clear();
		origin.sendKeys("MAS", Keys.TAB);
		// Enter the Destination
		WebElement destiny = driver.findElementById("txtStationTo");
		destiny.clear();
		destiny.sendKeys("SBC", Keys.ENTER);
		// Uncheck the Sort on Date
		driver.findElementById("chkSelectDateOnly").click();
		Thread.sleep(5000);

		// Finding the no of rows in the table
		List<WebElement> rows = driver.findElementsByXPath("//table[@class='DataTable TrainList TrainListHeader']//tr");
		int rowCount = rows.size();
		// Initiate List<String> to store the train names
		List<String> trainNames = new ArrayList<String>();

		// Iterate over rows to get the train names from the table
		for (int i = 1; i <= rowCount; i++) {
			String trainName = driver
					.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']//tr[" + i + "]/td[2]")
					.getText();
			// Store the train name into the list

			trainNames.add(trainName);
		}
		// Validating the count between the webtable and list
		System.out.println("List Size:" + trainNames.size());
		System.out.println("No of Rows:" + rowCount);
		if (trainNames.size() == rowCount) {
			System.out.println("Count Matched");
		} else {
			System.out.println("Count Mismatched");
		}

		// Sorting the List
		Collections.sort(trainNames);

		// Click on the train names in the webPage
		driver.findElementByLinkText("Train Name").click();

		// Again Get the sorted names from the webPage and store it in another list
		// Initiate List<String> to store the train names
		List<String> trainNamesNew = new ArrayList<String>();
		// Iterate over rows to get the train names from the table
		for (int i = 1; i <= rowCount; i++) {
			String trainName = driver
					.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']//tr[" + i + "]/td[2]")
					.getText();
			// Store the train name into the list

			trainNamesNew.add(trainName);
		}

		

		if (trainNamesNew.equals(trainNames)) {
			System.out.println("Both List are identical");
		} else {
			System.out.println("Both list are not Identical");
		}

	}
}
