package productManagementObjects;

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
	
	public String getBrandAddedMessage()
	{
		wait.visibilityOf(brandAddedMessage, 3);
		return brandAddedMessage.getText();
	}

}
