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
	private WebElement searchField;
	
	@FindBy(xpath="//*[text()='Search Customer / Student']")
	private WebElement searchCustomer;
	
	@FindBy(xpath = "//option[@value=4]")
	private WebElement selectSchool;
	
	@FindBy(xpath="//input[@placeholder='Enter admission number']")
	private WebElement enterAdmissionNo;
	
	@FindBy(xpath="//button[text()='Search Customer']")
	private WebElement clickSearchButton;
	
	@FindBy(xpath="//div[text()='Found 1 student(s)']")
	private WebElement searchMessage;
	
	@FindBy(xpath="//button[contains(@class,'text-white hover:text')]")
	private WebElement popCancel;
	
	@FindBy(xpath="(//button[contains(@class,'text-[#454661]')])[1]")
	private WebElement actionBtn;
	
	@FindBy(xpath="//h1")
	private WebElement headTitle;
	
	
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
		popCancel.click();
	}
	
	public String getSearchMessage()
	{
		wait.visibilityOf(searchMessage, 3);
		return searchMessage.getText();
	}
	
	public void clickAction()
	{
		actionBtn.click();
	}
	
	public String getTitle()
	{
		wait.visibilityOf(headTitle, 3);
		return headTitle.getText();
	}
	

}
