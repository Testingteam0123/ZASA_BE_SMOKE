package productManagementObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import commonObjects.BasePage;
import utilities.WaitHelper;

public class ColorSettings extends BasePage {
	
	WaitHelper wait= new WaitHelper(driver);

	public ColorSettings(WebDriver driver) {
		super(driver);

	}

	
	//Add color
	@FindBy(xpath = "//button[text()='Add Color']")
	private WebElement btnAddColor;

	@FindBy(id = "colorname")
	private WebElement txtColorName;

	@FindBy(id = "colorcode")
	private WebElement txtColorCode;

	@FindBy(xpath = "//option[text()='Uniform']")
	private WebElement dropdownCategory;

	@FindBy(xpath = "//button[text()='Save']")
	private WebElement btnSave;
	
	@FindBy(xpath="//div[text()='Color added successfully.']")
	private WebElement colorAddedMessage;
	
	
	//Edit
	@FindBy(xpath="(//button[@aria-label='Edit'])[1]")
	private WebElement btnEdit;
	
	@FindBy(id = "colorname")
	private WebElement txtColorRename;
	
	@FindBy(id = "colorcode")
	private WebElement txtColorRecode;
	
	@FindBy(xpath="//button[text()='Update']")
	private WebElement btnUpdate;
	
	@FindBy(xpath="//div[text()='Color updated successfully.']")
	private WebElement colorUpdatedMessage;
	
	//Delete
	@FindBy(xpath="(//button[@aria-label='Delete'])[1]")
	private WebElement btnDelete;
	
	@FindBy(xpath="//button[text()='OK']")
	private WebElement okBtn;
	
	//status
	@FindBy(xpath="(//button[@role='switch'])[1]")
	private WebElement btnStatus;
	
	@FindBy(xpath="//div[text()='Colour deleted successfully.']")
	private WebElement colorDeletedMessage;
	
	

	public void enterColorName(String color, String code) {
		btnAddColor.click();
		txtColorName.sendKeys(color);
		txtColorCode.sendKeys(code);
		dropdownCategory.click();
		btnSave.click();
	}
	
	public void editColoring(String color, String code)
	{
		btnEdit.click();
		txtColorRename.clear();
		txtColorRename.sendKeys(color);
		txtColorRecode.clear();
		txtColorRecode.sendKeys(code);
		btnUpdate.click();
	}
	
	public void deleteColoring()
	{
		btnDelete.click();
		okBtn.click();
	}
	
	
	public String getColorAddedMessage()
	{
		wait.visibilityOf(colorAddedMessage, 3);
		return colorAddedMessage.getText();
		
	}
	
	
	public String getColorUpdatedMessage()
	{
		wait.visibilityOf(colorUpdatedMessage, 3);
		return colorUpdatedMessage.getText();
		
	}
	
	public String getColorDeletedMessage()
	{
		wait.visibilityOf(colorDeletedMessage, 3);
		return colorDeletedMessage.getText();
		
	}
	
	public void statusChange()
	{
		btnStatus.click();
	}

}
