package productManagementObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import commonObjects.BasePage;
import utilities.WaitHelper;

public class BrandSettings extends BasePage{
 
	WaitHelper wait= new WaitHelper(driver);
	
	public BrandSettings(WebDriver driver) {
		super(driver);
	
	}
	
	@FindBy(xpath="//button[text()='BRAND']")
	private WebElement selectBrand;
	
	@FindBy(xpath="//button[text()='Add Brand']")
	private WebElement btnAddBrand;
	
	@FindBy(css ="#name")
	private WebElement txtBrandName;
	
	@FindBy(css="#email")
	private WebElement txtEmailAdd;
	
	@FindBy(css="#code")
	private WebElement txtCode;
	
	@FindBy(css="#contactinfo")
	private WebElement txtContInfo;
	
	@FindBy(css="[type='number']")
	private WebElement txtNumber;
	
	@FindBy(xpath = "//option[text()='Uniform']")
	private WebElement dropdownCategory;
	
	@FindBy(xpath = "//button[text()='Save']")
	private WebElement btnSave;
	
	@FindBy(xpath="//div[text()='Brand added successfully.']")
	private WebElement brandAddedMessage;
	
	@FindBy(xpath="//div[@class='relative']//input")
	private WebElement searchBox;
	
	@FindBy(xpath="(//button[@aria-label='Edit'])[1]")
	private WebElement btnEdit;
	
	@FindBy(xpath = "//button[text()='Update']")
	private WebElement btnUpdate;
	
	@FindBy(xpath="//div[text()='Brand updated successfully.']")
	private WebElement brandUpdatedMessage;
	
	@FindBy(xpath = "(//button[contains(@class,'text-[#454661]')])[2]")
	private WebElement deleteBrandBtn;
	
	@FindBy(xpath="//button[text()='OK']")
	private WebElement confirmDelete;
	
	@FindBy(xpath="//div[text()='Brand deleted successfully.']")
	private WebElement brandDeletedMessage;
	
	@FindBy(xpath="(//button[@role='switch'])[1]")
	private WebElement statusbtn;
	
	
	@FindBy(xpath="//div[text()='Brand status updated successfully.']")
	private WebElement brandStatusUpdatedMessage;
	
	public void enterBrand(String name,String email,String code,String contInfo, String contno)
	{
		selectBrand.click();
		btnAddBrand.click();
		txtBrandName.sendKeys(name);
		txtEmailAdd.sendKeys(email);
		txtCode.sendKeys(code);
		txtContInfo.sendKeys(contInfo);
		txtNumber.sendKeys(contno);
		dropdownCategory.click();
		btnSave.click();
		
	}
	
	public void editBrand(String name)
	{
		btnEdit.click();
		txtBrandName.clear();
		txtBrandName.sendKeys(name);
		btnUpdate.click();
	}
	
	public String getbrandUpdatedMessage()
	{
		wait.visibilityOf(brandUpdatedMessage, 3);
		return brandUpdatedMessage.getText();
	}
	
	public String getBrandAddedMessage()
	{
		wait.visibilityOf(brandAddedMessage, 3);
		return brandAddedMessage.getText();
	}

	public void checkSearchBox(String name)
	{
		searchBox.sendKeys(name);
	}
	
	public void deleteBrand() {
		deleteBrandBtn.click();
		wait.visibilityOf(confirmDelete, 5);
		confirmDelete.click();
	}
	
	public String getBrandDeletedMessage()
	{
		wait.visibilityOf(brandDeletedMessage, 3);
		return brandDeletedMessage.getText();
	}
	
	public void changeStatus()
	{
		statusbtn.sendKeys(Keys.SPACE);
	}
	
	public String getBrandStatusUpdatedMessage()
	{
		wait.visibilityOf(brandStatusUpdatedMessage, 3);
		return brandStatusUpdatedMessage.getText();
	}

}
