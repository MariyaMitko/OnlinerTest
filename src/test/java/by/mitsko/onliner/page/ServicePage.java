package by.mitsko.onliner.page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ServicePage extends AbstractPage{
	
		
	@FindBy(xpath = "//*[@id='container']/div/div[2]/div/div/div/navigation/div/div/div[1]/ul/li[2]/a/span/span")
	private WebElement performers;
	
	@FindBy(xpath = "//*[@id='service-list']/div[2]/div/div/div[1]/div[1]/div[1]/div/div[2]/div[1]/ul/li[1]/label/span/span[1]")
	private WebElement region;

	@FindBy(xpath = "//*[@id='service-list']/div[2]/div/div/div[1]/div[1]/div[2]/div/div[2]/div/div/div[11]")
	private WebElement service;

	@FindBy(xpath = "//*[@id='service-list']/div[2]/div/div/div[1]/div[1]/div[2]/div/div[2]/div/div/div[11]/div[2]/ul/li[1]/label/span/span[1]")
	private WebElement computerHelp;
	
	@FindBy(xpath = "//div[@class='service-offers__unit ng-scope']")
	private List<WebElement> results;	
	
	@FindBy(xpath = "//*[@id='service-list']/div[2]/div/div/div[2]/search-profiles-list/div/div/div/search-profiles-item/div/div/div[1]/div[number(substring(./div/div/a[1]/text(), 10, 2)) > 2 and number(substring(./div/div/div/rating-popover/div/a/span[2]/text(), 1, 2)) > 3")
	private List<WebElement> selectedResults;	
	
	public ServicePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(this.driver, this);
	}

	public void performer () throws InterruptedException{
		performers.click();
		Thread.sleep(6000);
	}
	
	public void selectRegion () throws InterruptedException{
		region.click();	
		Thread.sleep(6000);
	}
	
	public void selectService () throws InterruptedException{
		service.click();
		Thread.sleep(6000);
		computerHelp.click();
		Thread.sleep(6000);
	}
	
	public List<WebElement> ResultList() {
		List<WebElement> resultList = results;
		return resultList;
	}  
	
	public List<WebElement> SelectedResultList() {
		List<WebElement> resultList = selectedResults;
		return selectedResults;
	}  
	
	@Override
	public void openPage() {
		
		
		
		
	}
	
	

}
