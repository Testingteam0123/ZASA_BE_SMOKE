package productManagementObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import commonObjects.BasePage;
import utilities.WaitHelper;

public class WeightManagementPage extends BasePage {
	
	WaitHelper wait=new WaitHelper(driver);

	public WeightManagementPage(WebDriver driver) {
		super(driver);
		
	}
	
	
	@FindBy(xpath="(//input[@placeholder='Enter New Weight'])[1]")
	private WebElement txtNewWeight;
	
	@FindBy(xpath="//button[text()='SAVE']")
	private WebElement btnSave;
	
	@FindBy(xpath="//div[text()='Weights updated successfully!']")
	private WebElement weightUpdatedMessage;
	
	
	@FindBy(xpath = "//div[@class='relative']//input")
	private WebElement searchBox;
	
	@FindBy(xpath="//button//span[text()='Filter']")
	private WebElement filterOption;
	
	@FindBy(xpath="(//input[@class='accent-[#966AC3]'])[3]")
	private WebElement clickStationary;
	
	
	public void addNewWeight(String weight) 
	{
		txtNewWeight.sendKeys(weight);
		btnSave.click();
	}
	
	public void getSearchBox(String name) 
	{
		wait.elementToBeClickable(searchBox, 5);
		searchBox.click();
		searchBox.sendKeys(name);
	}
	
	
	
	public String getWeightUpdatedMessage()
	{
	wait.visibilityOf(weightUpdatedMessage, 3);	
	return weightUpdatedMessage.getText();
	}

	public void clickfilterOption()
	{
		wait.elementToBeClickable(filterOption, 5);
		filterOption.click();
	}
	
	public void selectStationary()
	{
		wait.elementToBeClickable(clickStationary, 5);
		clickStationary.click();
		
	}
	
}
