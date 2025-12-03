package orderManagementObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import commonObjects.BasePage;
import utilities.WaitHelper;

public class orderspage extends BasePage{

	WaitHelper wait= new WaitHelper(driver); 
	
	public orderspage(WebDriver driver) {
		super(driver);
		
	}
	
    By loader=By.xpath("(//section[@aria-label='Notifications alt+T'])[1]");
    
	@FindBy(xpath="(//input[@type='text'])[1]")
	WebElement searchFunction;
	
	@FindBy(xpath="(//button[@aria-label='View Order'])[1]")
	WebElement orderView;
	
	@FindBy(xpath="//button[text()='Await for Payment (']")
	WebElement btnAwaitpayement;
	
	@FindBy(xpath="//button[text()='Cancelled (']")
	WebElement btnCancelled;
	
	@FindBy(xpath = "//button[text()='Bulk Search']")
	WebElement btnBulkSearch;
	
	@FindBy(xpath="//textarea")
	WebElement enterData;
	
	@FindBy(xpath="//button[text()='Search']")
	WebElement btnSearch;
	
    @FindBy(xpath="//div[text()='Search completed for 2 item(s)']")	
    WebElement bulkSearchMessage;
	
	public void checkSearch(String orderID)
	{
		wait.invisiblilityOfElementLocatedBy(loader, 6);		
		searchFunction.sendKeys(orderID);	
	}
	
	public void clearSearch() {
		wait.invisiblilityOfElementLocatedBy(loader, 6);	
		searchFunction.clear();
	}
	
	
	public void viewOrder()
	{
		orderView.click();
	}
	
	public void awaitForPaymentpage()
	{
		wait.invisiblilityOfElementLocatedBy(loader, 6);
		btnAwaitpayement.click();
	}
	
	public void cancelledpage()
	{
		wait.invisiblilityOfElementLocatedBy(loader, 6);
		btnCancelled.click();
	}
	
	public String getBulkSearchMessage()
	{
		wait.visibilityOf(bulkSearchMessage, 3);
		return bulkSearchMessage.getText();
		
	}
	
	public void bulkSearchpage(String orderID,String orderID2)
	{
		wait.invisiblilityOfElementLocatedBy(loader, 6);
		btnBulkSearch.click();
		wait.elementToBeClickable(enterData, 3);
		enterData.sendKeys(orderID+"\n"+orderID2);
		
		btnSearch.click();
		
	}
	
	
	
	

}
