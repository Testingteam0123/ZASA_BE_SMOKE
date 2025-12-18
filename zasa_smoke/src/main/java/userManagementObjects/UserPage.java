package userManagementObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import commonObjects.BasePage;
import utilities.WaitHelper;

public class UserPage extends BasePage{

	WaitHelper wait= new WaitHelper(driver);
	
	public UserPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//button[text()='USER']")
	WebElement btnUser;
	
	@FindBy(xpath = "//button[text()='Add User']")
	WebElement btnAddUser;
	
	@FindBy(css="[id='name']")
	WebElement textName;
	
	@FindBy(css="[id='email']")
	WebElement textEmail;
	
	@FindBy(xpath="//div[@class='relative w-full']//button")
	WebElement selectUserRoleDropDown;
	
	@FindBy(xpath="//option")
	List<WebElement> userRoleOptions;
	
	@FindBy(xpath = "(//div[@class='relative w-full']//div)[1]")
	WebElement selectInstitutionDropDown;
	
	@FindBy(xpath="//ul[@class='py-2']//li")
	List<WebElement> institutionOption;
	
	@FindBy(xpath="//button[text()='Save']")
	WebElement btnSave;
	
	@FindBy(xpath="//div[text()='User Added Successfully.']")
    WebElement userAddedMessage;	
	
	@FindBy(xpath="//div[text()='User updated successfully.']")
    WebElement userUpdatedMessage;	
	
    @FindBy(xpath="//div[text()='User deleted successfully.']")
    WebElement userDeletedMessage;
    
	@FindBy(xpath="//div//input")
	WebElement searchBar;
	
	@FindBy(xpath="(//button[@aria-label='Edit'])[1]")
	WebElement editField;
	
	@FindBy(xpath="(//button[@aria-label='Delete'])[1]")
	WebElement deleteField;
	
	@FindBy(xpath="//button[text()='Update']")
	WebElement btnUpdate;
	
	@FindBy(xpath="//button[text()='OK']")
	WebElement clickOk;
	
	@FindBy(xpath="//button//span[text()='Filter']")
	private WebElement filterBtn;
	
	@FindBy(xpath="(//input[@class='accent-[#966AC3]'])[1]")
	private WebElement schoolOption;
	
	public void clickUser()
	{
		btnUser.click();
	}
	
	public void clickAddUser()
	{
		btnAddUser.click();
	}
	
	public void entertextName(String name)
	{
		textName.sendKeys(name);
	}
	
	public void entertextEmail(String email)
	{
		textEmail.sendKeys(email);
	}
	
	public void selectUserRoleOptions(String role)
	{
		selectUserRoleDropDown.click();
		for(WebElement option: userRoleOptions)
		{
			 if (option.getText().contains(role)) {
		            option.click();
		        }
		}
		
	}
	
	public void selectInstitutionOptions(String institution)
	{
		selectInstitutionDropDown.click();
		
		for(WebElement option:institutionOption)
		{
			if (option.getText().contains(institution)) {
	            option.click();
	        }
		}
	}
	
	public void clickSave()
	{
		btnSave.click();
	}
	
	public String getUserAddedMessage()
	{
		wait.visibilityOf(userAddedMessage, 3);
		return userAddedMessage.getText();
		
	}
	

	public String getUpdatedMessage()
	{
		wait.visibilityOf(userUpdatedMessage, 3);
		return userUpdatedMessage.getText();
		
	}
	
	public String getDeletedMessage()
	{
		wait.visibilityOf(userDeletedMessage, 3);
		return userDeletedMessage.getText();
	}
	
	
	public void searchUser(String user)
	{
		searchBar.sendKeys(user);
	}
	
	public void editUser(String name)
	{
		editField.click();
		textName.sendKeys(name);
		btnUpdate.click();
	}
	
	public void deleteUser()
	{
		deleteField.click();
		wait.elementToBeClickable(clickOk, 5);		
		clickOk.click();
	}
	
	public void selectSchool()
	{
		filterBtn.click();	
		schoolOption.click();
	}
	

}
