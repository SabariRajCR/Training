package week4.day1.assignment;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
		driver.get("https://jqueryui.com/");
		//Draggable
		driver.findElementByLinkText("Draggable").click();
		driver.switchTo().frame(0);
		WebElement draggable = driver.findElementById("draggable");
		Actions builder = new Actions(driver);
		builder.dragAndDropBy(draggable, 100, 100).perform();
		driver.switchTo().defaultContent();
		driver.findElementByLinkText("Droppable").click();	
		driver.switchTo().frame(0);
		
		builder.dragAndDrop(driver.findElementById("draggable"),driver.findElementById("droppable")).perform();
		driver.switchTo().defaultContent();
		driver.findElementByLinkText("Resizable").click();
		
		driver.switchTo().frame(0);
		
		builder.clickAndHold(driver.findElementByXPath("//div[contains(@class,'ui-resizable-handle ui-resizable-se')]")).moveByOffset(100,100).release().perform();
		
		driver.switchTo().defaultContent();
		
		//Selectable
		driver.findElementByLinkText("Selectable").click();
		driver.switchTo().frame(0);
		List<WebElement> selectable = driver.findElementsByXPath("//ol/*");
		builder.keyDown(Keys.CONTROL).perform();
		for (int i = 0; i < selectable.size(); i++) {
			
			if (i%2==0) {
							
			builder.click(selectable.get(i)).build().perform();
			
			}
		}
		
		builder.keyUp(Keys.CONTROL).perform();
		
		driver.switchTo().defaultContent();
		//Sortable
		driver.findElementByLinkText("Sortable").click();
		
		driver.switchTo().frame(0);
		List<WebElement> sortable = driver.findElementsByXPath("//ul[@id='sortable']/li");
		
			
		System.out.println(sortable.size());
		
		builder.dragAndDrop(sortable.get(6),sortable.get(0)).perform();
			
		builder.clickAndHold(sortable.get(0)).moveToElement(sortable.get(6)).moveByOffset(0, 10).release().build().perform();
		
		
		
		
	}

}
