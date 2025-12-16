package productManagementObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import commonObjects.BasePage;
import utilities.WaitHelper;

public class PublisherSettings extends BasePage{
	
	WaitHelper wait=new WaitHelper(driver);

	public PublisherSettings(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//button[text()='PUBLISHER']")
	private WebElement selectpublisher;
	
	@FindBy(xpath="//button[text()='Add Publisher']")
	private WebElement btnAddPublisher;
	
	@FindBy(id="publishername")
	private WebElement publishName;
	
	@FindBy(xpath="//option[text()='Stationery']")
	private WebElement selectcategory;
	
	@FindBy(xpath = "//button[text()='Save']")
	private WebElement saveBtn;
	
	@FindBy(xpath = "(//button[contains(@class,'text-[#454661]')])[1]")
	private WebElement  editPublisherBtn;
	
	@FindBy(id = "publishername")
	private WebElement  editPublisherField;
	
	@FindBy(xpath = "//button[text()='Update']")
	private WebElement  updateBtn;
	
	@FindBy(xpath = "//div[text()='Publisher updated successfully.']")
	private WebElement publisherUpdatedMessage;
	
	@FindBy(xpath = "(//button[contains(@class,'text-[#454661]')])[2]")
	private WebElement deletePublisherBtn;
	
	@FindBy(xpath="//button[text()='OK']")
	private WebElement confirmDelete;
	
	@FindBy(xpath="//div[text()='Publisher deleted successfully.']")
	private WebElement publisherDeletedMessage;
	
	@FindBy(xpath="//div[text()='Publisher added successfully.']")
	private WebElement publisherAddedMessage;
	
	@FindBy(xpath="//div[@class='relative']//input")
	private WebElement searchBox;
	
	@FindBy(xpath="(//button[@role='switch'])[1]")
	private WebElement statusbtn;
	
	@FindBy(xpath="//div[text()='Publisher status updated successfully.']")
	private WebElement publisherStatusUpdatedMessage;
	
	
	public void createPublisher(String name)
	{
		selectpublisher.click();
		btnAddPublisher.click();
		publishName.sendKeys(name);
		selectcategory.click();
		saveBtn.click();
		
	}
	
	public void editPublisher(String newName)
	{
		selectpublisher.click();
		editPublisherBtn.click();
		editPublisherField.clear();
		editPublisherField.sendKeys(newName);
		updateBtn.click();
	}
	
	public void deletePublisher()
	{
		selectpublisher.click();
		deletePublisherBtn.click();
		wait.visibilityOf(confirmDelete, 5);
		confirmDelete.click();
	}
	
	public String getPublisherUpdatedMessage() 
	{
		wait.visibilityOf(publisherUpdatedMessage, 5);
		return publisherUpdatedMessage.getText();
	}
	
	
	public String getPublisherDeletedMessage() 
	{
		wait.visibilityOf(publisherDeletedMessage, 5);
		return publisherDeletedMessage.getText();
	}
	
	public String getpublisherAddedMessage()
	{
		wait.visibilityOf(publisherAddedMessage, 5);
		return publisherAddedMessage.getText();
	}
	
	public void checkSearchBox(String name)
	{
		searchBox.sendKeys(name);
	}

	public void changeStatus()
	{
		statusbtn.sendKeys(Keys.SPACE);
	}
	
	public String getpublisherStatusUpdatedMessage()
	{
		wait.visibilityOf(publisherStatusUpdatedMessage, 5);
		return publisherStatusUpdatedMessage.getText();
	}
}
