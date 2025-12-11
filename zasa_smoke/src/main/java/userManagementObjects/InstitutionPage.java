package userManagementObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import commonObjects.BasePage;
import utilities.WaitHelper;

public class InstitutionPage extends BasePage{
	
	
	WaitHelper wait= new WaitHelper(driver);

	public InstitutionPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//button[text()='INSTITUTION']")
	private WebElement btnInstitution;
	
	@FindBy(xpath="//button[text()='Add Institution']")
	private WebElement btnAddInstitution;
	
	@FindBy(xpath="//input[@placeholder='Search by Institution']")
	private WebElement searchInstitutionBox;
	
	@FindBy(id = "name")
	private WebElement institutionName;
	
	@FindBy(id = "code")
	private WebElement institutionCode;
	
	@FindBy(id = "address")
	private WebElement institutionAddress;
	
	@FindBy(xpath = "//button[@role='combobox']")
	private WebElement isStore;
	
	@FindBy(xpath = "//select/option[text()='No']")
	private WebElement options;
	
	@FindBy(xpath="//button[text()='Browse Files']")
	private WebElement browseElement;
	
	@FindBy(xpath="//button[text()='Save']")
	private WebElement btnSave;
	
	@FindBy(xpath="//div[text()='Institution added successfully.']")
	private WebElement institutionAddedMessage;
	
	@FindBy(xpath="(//button[@aria-label='Edit'])[1]")
	private WebElement btnEdit;
	
	@FindBy(xpath = "//button[text()='Update']")
	private WebElement btnUpdate;
	
	@FindBy(xpath="//div[text()='Institution updated successfully.']")
	private WebElement institutionUpdateddMessage;
	
	@FindBy(xpath="(//button[@aria-label='Delete'])[1]")
	private WebElement btnDelete;	
	
	@FindBy(xpath="//button[text()='OK']")
	private WebElement btnOk;
	
	@FindBy(xpath="//div[text()='Institution deleted successfully.']")
	private WebElement institutionDeletedMessage;

	
	
	public void clickInstitution() 
	{
		btnInstitution.click();
	}
	
	public void addInstitition()
	{
		btnAddInstitution.click();
	}
	
	public void searchBoxInstitution(String name)
	{
		searchInstitutionBox.sendKeys(name);
	}
	
	public void enterInstitutionName(String name)
	{
		institutionName.sendKeys(name);
	}
	
	public void enterInstitutionCode(String code)
	{
		institutionCode.sendKeys(code);
	}
	
	public void selectOption()
	{
		options.click();
	}
	
	public void uploadLogo(String imagePath)
	{
		browseElement.sendKeys(imagePath);
	}
	
	public void clickSave()
	{
		btnSave.click();
	}
	
	public String getinstitutionAddedMessage()
	{
		wait.visibilityOf(institutionAddedMessage, 3);
		return institutionAddedMessage.getText();
	}
	
	public void institutionSearchBox(String name)
	{
		searchInstitutionBox.clear();
		searchInstitutionBox.sendKeys(name);
	}
	
	public void clickEditfunction()
	{
		btnEdit.click();
	}
	
	public void enterEditName(String name)
	{
		institutionName.clear();
		institutionName.sendKeys(name);
	}
	
	public void editUpdate()
	{
		btnUpdate.click();
	}
	
	public String getInstitutionUpdatedMessage()
	{
		wait.visibilityOf(institutionUpdateddMessage, 3);
		return institutionUpdateddMessage.getText();
		
	}
	
	public void clickDelete()
	{
		btnDelete.click();
	}
	
	public void confirmButton()
	{
		btnOk.click();
	}
	
	public String getInstitutionDeletedMessage()
	{
		wait.visibilityOf(institutionDeletedMessage, 3);
		return institutionDeletedMessage.getText();
		
	}
	

}
