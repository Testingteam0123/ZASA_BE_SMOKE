package settingsObjects;


import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import commonObjects.BasePage;
import utilities.WaitHelper;

public class RateManagementPage extends BasePage{
	
	WaitHelper wait= new WaitHelper(driver);

	public RateManagementPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//li[contains(@class,'group toast')]//div//div[text()='Successfully logged In']")
	private WebElement loginSuccessMessage;
	
	@FindBy(xpath="(//input[@placeholder='Enter New Rate'])[1]")
	private WebElement textNewRate;
	
	@FindBy(xpath="//button[text()='SAVE']")
	private WebElement btnSave;
	
	@FindBy(xpath="//div[text()='Product rates updated successfully.']")
	private WebElement savedSuccessMessage;
	
	@FindBy(xpath="//input[contains(@placeholder,'Search')]")
	private WebElement searchBox;
	
	@FindBy(xpath = "//table//tbody//tr//td[2]/div/div")
	private List<WebElement> firstRow;
	
	@FindBy(xpath="//button//span[text()='Filter']")
	private WebElement filterBtn;
	
	@FindBy(xpath="(//input[@class='accent-[#966AC3]'])[1]")
	private WebElement bookOption;

	
	
	public void enterNewRate(String text) 
	{
		textNewRate.sendKeys(text);
		btnSave.click();
	}
	
	
	public void enterSearch(String product)
	{
		searchBox.sendKeys(product);
	}
	
	public String getSavedSuccessMessage()
	{
		wait.visibilityOf(savedSuccessMessage, 3);
		return savedSuccessMessage.getText();
	}
	
	
	public boolean checkProduct(String productName) throws InterruptedException
	{
		wait.visibilityOf(loginSuccessMessage, 3);
		
		  Thread.sleep(800);
		
		wait.visibilityOfAll(firstRow, 3);
		for(WebElement product: firstRow)
		{
			if(product.getText().equals(productName))
			{
				return true;
			}
		}
		return false;
	}
	
	public void selectBook()
	{
		filterBtn.click();	
		bookOption.click();
	}
	

}
