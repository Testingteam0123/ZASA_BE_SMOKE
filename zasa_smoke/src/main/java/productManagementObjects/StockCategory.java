package productManagementObjects;

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

}
