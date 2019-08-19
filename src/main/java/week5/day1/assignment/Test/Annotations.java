package week5.day1.assignment.Test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

import week5.day1.assignment.ProjectSpecificMethods;



public class Annotations extends ProjectSpecificMethods {
  @Test(enabled=false)
  public void test() {
	  System.out.println("test");
  }
  @Test
  public void test2() throws IOException {
	// TODO Auto-generated method stub
	  System.out.println("test2");
	  
	  File source = driver.getScreenshotAs(OutputType.FILE);
	  File target = new File("./screenshot/1.png");
	  FileUtils.copyFile(source, target);
	  

}
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.out.println("Before Method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("afterMethod");
  }

  @BeforeClass
  public void beforeClass() {
	  
	  System.out.println("Before Class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("AfterClass");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before Test");
  }

  @AfterTest
  public void afterTest() {
	  
	  System.out.println("After Test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Before Suit");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("After Suit");
  }
  
  

}
