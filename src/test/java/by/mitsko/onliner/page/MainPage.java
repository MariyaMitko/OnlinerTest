package by.mitsko.onliner.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends AbstractPage{

private final String BASE_URL = "https://s.onliner.by/";

	
	public MainPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(this.driver, this);
	}

	
	@Override
	public void openPage()
	{
		driver.navigate().to(BASE_URL);
	}

	
	  

}