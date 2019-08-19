package week2.day1.assignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class IRCTC_Website {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		
	}

}
