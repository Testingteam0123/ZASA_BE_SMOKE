package quotationManagementObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import commonObjects.BasePage;
import utilities.WaitHelper;

public class PurchaseManagementPage extends BasePage {
	
	WaitHelper wait=new WaitHelper(driver);

	public PurchaseManagementPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath="//button[text()='Add Purchase Order']")
	private WebElement btnAddPurchaseOrder;
	
	@FindBy(xpath="//option[text()='Direct Purchase']")
	private WebElement selectDirectPurchase;
	
	@FindBy(xpath="//option[text()='Purchase Order']")
	private WebElement selectPurchaseOrder;
	
	@FindBy(xpath="//option[text()='CORDOVA']")
	private WebElement selectCordova;
	
	@FindBy(xpath="//option[text()='QO0000019']")
	private WebElement selectQuotation;
	
	@FindBy(xpath="//button[text()='SAVE']")
	private WebElement btnSave;
	
	@FindBy(xpath="//div[text()='Purchase Order added successfully.']")
	private WebElement purchaseOrderAddedMessage;
	
	@FindBy(xpath="(//button[contains(@class,'p-1 hover')])[1]")
	private WebElement deletePurchaseOrder;
	
	@FindBy(xpath="//button[text()='OK']")
	private WebElement confirmDelete;
	
	@FindBy(xpath="//div[text()='Purchase Order deleted successfully.']")
	private WebElement PurchaseDeletedMessage;
	
	@FindBy(xpath="(//button[@aria-haspopup='menu'])[2]")
	private WebElement changeStatus;
	
	@FindBy(xpath="//div[text()='Approve']")
	private WebElement selectApproved;
	
	@FindBy(xpath="//textarea[@placeholder='Enter reason here...']")
	private WebElement enterReason;
	
	@FindBy(xpath="//button[text()='Approve']")
	private WebElement clickSaveReason;
	
	@FindBy(xpath="//div[text()='Purchase status updated successfully.']")
	private WebElement PurchaseStatusUpdatedMessage;
	
	
	public void clickAddPurchaseOrder() 
	{
		btnAddPurchaseOrder.click();
	}
	
	public void selectDirectPurchaseOption() 
	{
		selectDirectPurchase.click();
	}
	
	
	public String getPurchaseOrderAddedMessage() 
	{
		wait.visibilityOf(purchaseOrderAddedMessage, 5);
		return purchaseOrderAddedMessage.getText();
	}
	
	public void deletePurchaseOrder() 
	{
		deletePurchaseOrder.click();
		wait.visibilityOf(confirmDelete, 5);
		confirmDelete.click();
	}
	
	public String getPurchaseOrderDeletedMessage() 
	{
		wait.visibilityOf(PurchaseDeletedMessage, 5);
		return PurchaseDeletedMessage.getText();
	}
	
	
	public String getPurchaseStatusUpdatedMessage() 
	{
		wait.visibilityOf(PurchaseStatusUpdatedMessage, 5);
		return PurchaseStatusUpdatedMessage.getText();
	}
	
	public void selectPurchaseOrderOption() 
	{
		selectPurchaseOrder.click();
		selectCordova.click();
		selectQuotation.click();
		wait.elementToBeClickable(btnSave, 3);
		btnSave.click();
	}
	
	public void changeStatusToApproved(String reason) 
	{
		changeStatus.click();
		wait.visibilityOf(selectApproved, 3);
		selectApproved.click();
		wait.visibilityOf(enterReason, 3);
		enterReason.sendKeys(reason);
		clickSaveReason.click();
	}

}
