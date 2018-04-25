package by.mitsko.onliner.steps;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import by.mitsko.onliner.driver.SingletonDriver;
import by.mitsko.onliner.page.MainPage;
import by.mitsko.onliner.page.ServicePage;

public class Steps {
	
	private WebDriver driver;
	private MainPage mainPage;
	private ServicePage servicePage;

	private final Logger logger = LogManager.getRootLogger();

	public void initBrowser()
	{
		driver = SingletonDriver.getDriver();
	}

	public void closeDriver()
	{
		SingletonDriver.closeDriver();
	}

	
	
	public void servicePage() throws InterruptedException
	{   mainPage = new MainPage(driver);
	    mainPage.openPage();
	    Thread.sleep(5000);
		servicePage = new ServicePage(driver);
		Thread.sleep(5000);
		servicePage.performer();
		logger.info("Performers section was selected");
		
		
	}
	
	
	public  List<WebElement> createRegionResultList() throws InterruptedException{
		
		servicePage();
		servicePage = new ServicePage(driver);
		servicePage.selectRegion();
		logger.info("Minsk city was selected");
		return servicePage.ResultList();
		
		 
		
	}
	
	public List<WebElement> createServiceResultList() throws InterruptedException{
	    servicePage();
	    servicePage = new ServicePage(driver);
	    servicePage.selectRegion();
	    servicePage.selectService();
	    logger.info("Software installation was selected");
	    return servicePage.ResultList();
		
		
	}

	public List<WebElement> createSelectedResultList() throws InterruptedException{
		servicePage();
	    servicePage = new ServicePage(driver);
	    servicePage.selectRegion();
	    servicePage.selectService();
	    logger.info("List of performers acording to selected cretiria  was created");
	    return servicePage.SelectedResultList();
	    
	
	}
	
}
