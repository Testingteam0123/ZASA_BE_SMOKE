package orderManagementObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import commonObjects.BasePage;
import utilities.WaitHelper;

public class ExchangePage extends BasePage{

	WaitHelper wait= new WaitHelper(driver);
	
	public ExchangePage(WebDriver driver) {
		super(driver);
	}
	
	By loader=By.xpath("(//section[@aria-label='Notifications alt+T'])[1]");
	
	@FindBy(xpath="//button[text()='Bulk Search']")
	private WebElement btnBulkSearch;
	
	@FindBy(xpath="//textarea")
	private WebElement textarea;
	
	@FindBy(xpath="//button[text()='Search']")
	private WebElement btnSearch;
	
    @FindBy(xpath="//div[text()='Search completed for 1 item(s)']")	  
    private WebElement bulkSearchMessage;
   
    @FindBy(xpath="(//button[contains(@aria-label,'View')])[1]")
    private WebElement exchangeDetailView;
	
	public void clickBulkSearch()
	{
		btnBulkSearch.click();
	}
	
	public void enterExchangeIDTextArea(String exchangeID)
	{
		textarea.sendKeys(exchangeID);
	}
	
	public void clickSearch()
	{
		btnSearch.click();
	}

	public String getBulkSearchMessage()
	{
		wait.visibilityOf(bulkSearchMessage, 3);
		return bulkSearchMessage.getText();
		
	}
	
	public void clickExchangeDetailView()
	{
		exchangeDetailView.click();
	}

}
