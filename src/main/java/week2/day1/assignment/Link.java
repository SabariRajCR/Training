package week2.day1.assignment;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.HttpsURLConnection;

import org.apache.http.HttpConnection;
import org.apache.http.protocol.HTTP;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://testleaf.herokuapp.com/pages/Link.html");
		
		driver.findElementByLinkText("Go to Home Page").click();
		
		driver.navigate().back();
		
		String link = driver.findElementByPartialLinkText("Find where am supposed").getAttribute("href");
		System.out.println(link);
		
		String attribute = driver.findElementByLinkText("Verify am I broken?").getAttribute("href");
		try{
			
		URL link1 = new URL(attribute);
		HttpURLConnection h = (HttpURLConnection) link1.openConnection();
			int responseCode = h.getResponseCode();
		if(responseCode==404){
			
			System.out.println("Broken");
		}else{
			System.out.println("Not Broken");
		}
		
		}catch(Exception e){
			
		}
		
		driver.findElementByXPath("(//a[text()='Go to Home Page'])[2]").click();
		
		driver.navigate().back();
		
		List<WebElement> list = driver.findElementsByTagName("a");
		
		int size = list.size();
		System.out.println(size);
	}

}
