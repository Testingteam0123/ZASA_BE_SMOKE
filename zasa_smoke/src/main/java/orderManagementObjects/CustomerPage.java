package orderManagementObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import commonObjects.BasePage;
import utilities.WaitHelper;

public class CustomerPage extends BasePage{

	WaitHelper wait= new WaitHelper(driver);
	
	public CustomerPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath="//input[@placeholder='Search customers...']")
	WebElement searchField;
	
	@FindBy(xpath="//*[text()='Search Customer / Student']")
	WebElement searchCustomer;
	
	@FindBy(xpath = "//option[@value=4]")
	WebElement selectSchool;
	
	@FindBy(xpath="//input[@placeholder='Enter admission number']")
	WebElement enterAdmissionNo;
	
	@FindBy(xpath="//button[text()='Search Customer']")
	WebElement clickSearchButton;
	
	@FindBy(xpath="//div[text()='Found 1 student(s)']")
	WebElement searchMessage;
	
	public void enterName(String name)
	{
		searchField.sendKeys(name);
	}
	
	public void enterCusomerDetails(String admissionNo)
	{
		searchCustomer.click();
		selectSchool.click();
		enterAdmissionNo.sendKeys(admissionNo);
		clickSearchButton.click();
	}
	
	public String getSearchMessage()
	{
		wait.visibilityOf(searchMessage, 3);
		return searchMessage.getText();
		
	}
	

}
