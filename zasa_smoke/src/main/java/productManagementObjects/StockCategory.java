package productManagementObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import commonObjects.BasePage;
import utilities.WaitHelper;

public class StockCategory extends BasePage{
	
	WaitHelper wait=new WaitHelper(driver);

	public StockCategory(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//button[text()='STOCK CATEGORY']")
	private WebElement selectStock;
	
	@FindBy(xpath="//button[text()='Add Stock Category']")
	private WebElement btnAddStock;
	
	@FindBy(id="categoryname")
	private WebElement txtCategoryName;
	
	@FindBy(xpath="//option[text()='Stationery']")
	private WebElement selectcategory;
	
	@FindBy(css="#description")
	private WebElement txtdescription;
	
	@FindBy(xpath = "//button[text()='Save']")
	private WebElement saveBtn;
	
	@FindBy(xpath="//div[text()='Stock Category added successfully.']")
	private WebElement stockCategoryAddedMessage;
	
	@FindBy(xpath="(//button[@aria-label='Edit'])[1]")
	private WebElement btnEdit;	
	
	@FindBy(xpath="//div[text()='Stock Category updated successfully.']")
	private WebElement stockCategoryUpdatedMessage;
	
	@FindBy(xpath="(//button[@aria-label='Delete'])[1]")
	private WebElement btnDelete;
	
	@FindBy(xpath="//div[text()='Stock Category deleted successfully.']")
	private WebElement stockCategoryDeletedMessage;
	
	@FindBy(xpath="//div[text()='Stock Category status updated successfully.']")
	private WebElement stockCategoryStatusUpdatedMessage;
	
	@FindBy(xpath="//button[text()='OK']")
	private WebElement okBtn;
	
	@FindBy(xpath="//button[text()='Update']")
	private WebElement btnUpdate;
	
	@FindBy(xpath="//div[@class='relative']//input")
	private WebElement searchBox;
	
	@FindBy(xpath="(//button[@role='switch'])[1]")
	private WebElement statusbtn;
	
	
	public void addStockCategory(String name,String txt)
	{
		selectStock.click();
		btnAddStock.click();
		txtCategoryName.sendKeys(name);
		selectcategory.click();
		txtdescription.sendKeys(txt);
		saveBtn.click();
	}
	
	public String getStockAddedMessage()
	{
		wait.visibilityOf(stockCategoryAddedMessage, 5);
		return stockCategoryAddedMessage.getText();
		
	}
	
	public String getstockCategoryUpdatedMessage()
	{
		wait.visibilityOf(stockCategoryUpdatedMessage, 5);
		return stockCategoryUpdatedMessage.getText();
		
	}
	
	public String getStockCategoryDeletedMessage()
	{
		wait.visibilityOf(stockCategoryDeletedMessage, 5);
		return stockCategoryDeletedMessage.getText();
		
	}
	
	public void editStockCategory(String name)
	{
		btnEdit.click();
		txtCategoryName.clear();
		txtCategoryName.sendKeys(name);
		btnUpdate.click();		
	}
	
	
	public void checkSearchBox(String name)
	{
		searchBox.clear();
		searchBox.sendKeys(name);
	}

	public void changeStatus()
	{
		wait.elementToBeClickable(statusbtn, 5);
		statusbtn.sendKeys(Keys.SPACE);
	}
	
	public void deleteStockCategory()
	{
		btnDelete.click();
		wait.visibilityOf(okBtn, 5);
		okBtn.click();
	}
	
	public String getStockCategoryStatusUpdatedMessage()
	{
		wait.visibilityOf(stockCategoryStatusUpdatedMessage, 3);
		return stockCategoryStatusUpdatedMessage.getText();
		
	}
	

}
