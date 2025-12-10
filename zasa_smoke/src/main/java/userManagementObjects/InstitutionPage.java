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
	WebElement btnInstitution;
	
	@FindBy(xpath="//button[text()='Add Institution']")
	WebElement btnAddInstitution;
	
	@FindBy(xpath="//input[@placeholder='Search by Institution']")
	WebElement searchInstitutionBox;
	
	@FindBy(id = "name")
	WebElement institutionName;
	
	@FindBy(id = "code")
	WebElement institutionCode;
	
	@FindBy(id = "address")
	WebElement institutionAddress;
	
	@FindBy(xpath = "//button[@role='combobox']")
	WebElement isStore;
	
	@FindBy(xpath = "//select/option[text()='No']")
	WebElement options;
	
	@FindBy(xpath="//button[text()='Browse Files']")
	WebElement browseElement;
	
	@FindBy(xpath="//button[text()='Save']")
	WebElement btnSave;
	
	@FindBy(xpath="//div[text()='Institution added successfully.']")
	WebElement institutionAddedMessage;
	
	@FindBy(xpath="(//button[@aria-label='Edit'])[1]")
	WebElement btnEdit;
	
	@FindBy(xpath = "//button[text()='Update']")
	WebElement btnUpdate;
	
	@FindBy(xpath="//div[text()='Institution updated successfully.']")
	WebElement institutionUpdateddMessage;
	
	@FindBy(xpath="(//button[@aria-label='Delete'])[1]")
	WebElement btnDelete;	
	
	@FindBy(xpath="//button[text()='OK']")
	WebElement btnOk;
	
	@FindBy(xpath="//div[text()='Institution deleted successfully.']")
	WebElement institutionDeletedMessage;

	
	
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
