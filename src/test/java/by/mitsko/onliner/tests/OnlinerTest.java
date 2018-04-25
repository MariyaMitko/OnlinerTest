package by.mitsko.onliner.tests;


import org.testng.annotations.Test;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import by.mitsko.onliner.steps.Steps;


public class OnlinerTest {
	 private Steps st = new Steps();
	 private WebDriver driver;
	 
	 
	 
	
  @Test
  public void openPage() throws InterruptedException {
	  
		 st.initBrowser();
		 st.servicePage();
	    
  }
  
  @Test
  public void regionList() throws InterruptedException {
	    List <WebElement> list = st.createRegionResultList();
	     Assert.assertTrue(list.size() > 0);
  }
  
  @Test
  public void serviceList() throws InterruptedException {
	  List <WebElement> list = st.createServiceResultList();
	  Assert.assertTrue(list.size() > 0);
  }
  
  
  @Test
  public void performersList() throws InterruptedException {
	  List <WebElement> list = st.createSelectedResultList();
	  Assert.assertTrue(list.size() > 0);
  }
}
