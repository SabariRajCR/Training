package week2.day1.assignment;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerificationOfBrowserAndWebElements_Button {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://testleaf.herokuapp.com/pages/Button.html");
		/*Bowser Verification:
		1.getTitle
		2.getcurrentUrl
		3.getPageSource*/
		
	/*	//getTitle
		String title = driver.getTitle();
		System.out.println(title);
		if(driver.getTitle().contains("TestLeaf")) {
			
			System.out.println("True");
		}
		
		//getCurrentUrl:
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		//getPageource:
		
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);*/
		
	/*	
		WebElement Verification
		1.getAttribute
		2.getCssValue
		3.getText
		4.getLocation
		5.getSize
		6.getTagName
		7.isDisplayed
		8.isSelected
		9.isEnabled*/
		
		//getAttribute- returns the value of the particular Attribute
		WebElement homepage = driver.findElementById("home");
		String attribute = homepage.getAttribute("onclick");
		System.out.println(attribute);
		
		//getCssValue - the value of css property color is returned a rgba string
		WebElement whatcolor = driver.findElementById("color");
		String colorIs = whatcolor.getCssValue("background-color");
		System.out.println(colorIs);
		
		//getText - gets the visible text
		String text = whatcolor.getText();
		System.out.println(text);
		
		//getLocation
		WebElement whatposition = driver.findElementById("position");
		Point location = whatposition.getLocation();
		System.out.println(location);
		System.out.println(whatposition.getLocation().getY());
		
		//getSize
		WebElement whatsize = driver.findElementById("size");
		Dimension size = whatsize.getSize();
		System.out.println(size);
		
		//getTagName
		String tagName = whatsize.getTagName();
		System.out.println(tagName);
	}

}
