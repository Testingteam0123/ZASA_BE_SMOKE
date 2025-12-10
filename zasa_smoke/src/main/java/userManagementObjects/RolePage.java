package userManagementObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import commonObjects.BasePage;
import utilities.WaitHelper;

public class RolePage extends BasePage{

	WaitHelper wait= new WaitHelper(driver);
	
	public RolePage(WebDriver driver) {
		super(driver);
	}
	
	
	@FindBy(xpath = "//button[text()='ROLE']")
	WebElement btnRole;
	
	@FindBy(xpath="//button[text()='Add Role']")
	WebElement btnAddRole;
	
	@FindBy(id="name")
	WebElement textRoleName;
	
	@FindBy(css="[id=select-all-permissions]")
	WebElement selectAllBox;
	
	@FindBy(xpath="//input[@placeholder='Search by User Role']")
	WebElement searchRoleBox;
	
	@FindBy(xpath = "//button[text()='Save']")
	WebElement btnSave;
	
	@FindBy(xpath="//div[text()='Role added successfully.']")
	WebElement roleCreatedMessage;
	
	@FindBy(xpath="//div[text()='Role updated successfully.']")
	WebElement roleUpdateddMessage;
	
	@FindBy(xpath="//div[text()='Role deleted successfully.']")
	WebElement roleDeletedMessage;
	
	@FindBy(xpath="(//button[@aria-label='Edit'])[1]")
	WebElement btnEdit;
	
	@FindBy(xpath = "//button[text()='Update']")
	WebElement btnUpdate;
	
	@FindBy(xpath="(//button[@aria-label='Delete'])[1]")
	WebElement btnDelete;	
	
	@FindBy(xpath="//button[text()='OK']")
	WebElement btnOk;

	
	
	public void clickRole()
	{
		btnRole.click();
	}
	
	
	public void addUserRole()
	{
		btnAddRole.click();
	}
	
	public void addRoleName(String name)
	{
		textRoleName.sendKeys(name);
	}
	
	public void clickCheckBox()
	{
		selectAllBox.click();
	}
	
	public void clickSave()
	{
		btnSave.click();		
	}
	
	public String getRoleCreatedMessage()
	{
		wait.visibilityOf(roleCreatedMessage, 3);
		return roleCreatedMessage.getText();	
	}
	
	public void clickEditfunction()
	{
		btnEdit.click();
	}
	
	public void enterEditName(String name)
	{
		textRoleName.clear();
		textRoleName.sendKeys(name);
	}
	
	public void editUpdate()
	{
		btnUpdate.click();
	}
	
	public String getRoleUpdatedMessage()
	{
		wait.visibilityOf(roleUpdateddMessage, 3);
		return roleUpdateddMessage.getText();
		
	}
	
	public void searchBoxFunction(String name)
	{
		searchRoleBox.clear();
		searchRoleBox.sendKeys(name);
	}
	
	public void clickDelete()
	{
		btnDelete.click();
	}
	
	public void confirmDelete()
	{
		btnOk.click();
	}
	
	public String getRoleDeletedMessage()
	{
		wait.visibilityOf(roleDeletedMessage, 3);
		return roleDeletedMessage.getText();
	}

}
