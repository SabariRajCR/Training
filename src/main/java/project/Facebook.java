package project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("-disable-notifications");
		
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		
		driver.get("https://www.facebook.com/");
		
		driver.findElementById("email").sendKeys("therulersabari@gmail.com");
		driver.findElementById("pass").sendKeys("Chamundi");
		driver.findElementByXPath("//input[@value='Log In']").click();
		
		
		/*
		Alert alert = driver.switchTo().alert();
		alert.dismiss();*/
		
		//Thread.sleep(2000);
		
		WebElement search = driver.findElementByXPath("//input[@data-testid='search_input']");
		Thread.sleep(2000);
		search.sendKeys("TestLeaf");
		
		driver.findElementByXPath("//button[@data-testid='facebar_search_button']").click();
		
		Thread.sleep(2000);
		
		String text = driver.findElementByXPath("//*[text()='TestLeaf']//following::button[contains(@class,'PageLikeButton')]").getText();
		String Like ="Like";
		String Liked ="Liked";
		
		if(text.equals(Like)) {
			
			
			driver.findElementByXPath("//*[text()='TestLeaf']//following::button[contains(@class,'PageLikeButton')]").click();
			
		}else if (text.equals(Liked)) {
			
			System.out.println("Already Liked");
			
			
		} else {
			
			System.out.println("Error ---No Like Button");
		}
		
		
		driver.findElementByXPath("//*[text()='TestLeaf']//following::button[contains(@class,'PageLikeButton')]//preceding::a[text()='TestLeaf']").click();
		
		String title = driver.getTitle();
		String verify = "TestLeaf";
		
		if(title.contains(verify)) {
			
			System.out.println("Title verified");
		}else {
			System.out.println("Mismatch");
		}
		
		WebDriverWait wait = new WebDriverWait(driver,90);
		
		WebElement Likes = driver.findElementByXPath("//div[@id='PagesProfileHomeSecondaryColumnPagelet']//span[text()='Community']/following::div[contains(text(),'people like this')]");
		wait.until(ExpectedConditions.visibilityOf(Likes));
		
		String noOfLikes = Likes.getText();
		
		String noOFLikesTestLeaf = noOfLikes.replaceAll("\\D","");
		
		System.out.println(noOFLikesTestLeaf);
		
	}

}
