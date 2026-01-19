package reportsObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import commonObjects.BasePage;

public class salesPage extends BasePage{

	public salesPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//h1")
	private WebElement heading;
	
	
	public String getHeading()
	{
		return heading.getText();	
	}
	

}
