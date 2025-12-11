package productManagementObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import commonObjects.BasePage;
import utilities.WaitHelper;

public class TypeSettings extends BasePage {
	
	WaitHelper wait=new WaitHelper(driver);

	public TypeSettings(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = "//button[text()='TYPE']")
	private WebElement selectType;

	@FindBy(xpath = "//button[text()='Add Type']")
	private WebElement btnAddtype;

	@FindBy(id = "type")
	private WebElement txtEnterType;

	@FindBy(xpath = "//option[text()='Uniform']")
	private WebElement dropdowncategory;

	@FindBy(xpath = "//button[text()='Save']")
	private WebElement saveBtn;
	
	@FindBy(xpath = "(//button[contains(@class,'text-[#454661]')])[1]")
	private WebElement  editTypeBtn;
	
	@FindBy(id = "type")
	private WebElement  editTypeField;
	
	@FindBy(xpath = "//button[text()='Update']")
	private WebElement  updateBtn;
	
	@FindBy(xpath = "//div[text()='Type updated successfully.']")
	private WebElement typeUpdatedMessage;
	
	@FindBy(xpath = "//div[text()='Type added successfully.']")
	private WebElement typeAddedMessage;
	
	@FindBy(xpath = "(//button[contains(@class,'text-[#454661]')])[2]")
	private WebElement deleteTypeBtn;
	
	@FindBy(xpath="//button[text()='OK']")
	private WebElement confirmDelete;
	
	@FindBy(xpath="//div[text()='Type deleted successfully.']")
	private WebElement typeDeletedMessage;

	public void verifyAddNewType(String typeName) {
		selectType.click();
		btnAddtype.click();
		txtEnterType.sendKeys(typeName);
		dropdowncategory.click();
		saveBtn.click();
	}
	
	public void verifyEditType(String newTypeName) {
		selectType.click();
		editTypeBtn.click();
		editTypeField.clear();
		editTypeField.sendKeys(newTypeName);
		updateBtn.click();
	}
	
	public void verifyDeleteType() {
		selectType.click();
		deleteTypeBtn.click();
		wait.visibilityOf(confirmDelete, 5);
		confirmDelete.click();
	}
	
	
	public String getTypeDeletedMessage() {
		
		wait.visibilityOf(typeDeletedMessage, 5);
		return typeDeletedMessage.getText();
	}
	
	
	
	public String getTypeUpdatedMessage() {
		
		wait.visibilityOf(typeUpdatedMessage, 5);
		return typeUpdatedMessage.getText();
	}
	
	public String getTypeAddedMessage()
	{
		wait.visibilityOf(typeAddedMessage, 5);
		return typeAddedMessage.getText();
	}
	
	

}
