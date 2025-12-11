package productManagementObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import commonObjects.BasePage;
import utilities.WaitHelper;

public class SizeSettings extends BasePage {
	
	WaitHelper wait=new WaitHelper(driver);

	public SizeSettings(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = "//button[text()='SIZE']")
	private WebElement sizeField;

	@FindBy(xpath = "//button[text()='Add Size']")
	private WebElement btnAddSize;

	@FindBy(id = "size")
	private WebElement txtEnterSize;

	@FindBy(xpath = "//option[text()='Uniform']")
	private WebElement dropdowncategory;

	@FindBy(xpath = "//button[text()='Save']")
	private WebElement saveBtn;
	
	@FindBy(xpath = "(//button[contains(@class,'text-[#454661]')])[1]")
	private WebElement  editSizeBtn;
	
	@FindBy(id = "size")
	private WebElement  editSizeField;
	
	@FindBy(xpath = "//button[text()='Update']")
	private WebElement  updateBtn;
	
	@FindBy(xpath = "//div[text()='Size updated successfully.']")
	private WebElement sizeUpdatedMessage;
	
	@FindBy(xpath = "(//button[contains(@class,'text-[#454661]')])[2]")
	private WebElement deleteSizeBtn;
	
	@FindBy(xpath="//button[text()='OK']")
	private WebElement confirmDelete;
	
	@FindBy(xpath="//div[text()='Size deleted successfully.']")
	private WebElement sizeDeletedMessage;
	
	@FindBy(xpath="//div[text()='Size added successfully.']")
	private WebElement sizeAddedMessage;
	
	

	public void enterSize(String size) {
		sizeField.click();
		btnAddSize.click();
		txtEnterSize.sendKeys(size);
		dropdowncategory.click();
		saveBtn.click();
	}
	
	public void editSize(String newSize) {
		sizeField.click();
		editSizeBtn.click();
		editSizeField.clear();
		editSizeField.sendKeys(newSize);
		updateBtn.click();
	}
	
	public String getSizeUpdatedMessage() {
		wait.visibilityOf(sizeUpdatedMessage, 5);
		return sizeUpdatedMessage.getText();
	}
	
	public void deleteSize() {
		sizeField.click();
		deleteSizeBtn.click();
		wait.visibilityOf(confirmDelete, 5);
		confirmDelete.click();
	}
	
	public String getSizeDeletedMessage() {
		wait.visibilityOf(sizeDeletedMessage, 5);
		return sizeDeletedMessage.getText();
	}
	
	public String getSizeAddedMessage() {
		wait.visibilityOf(sizeAddedMessage, 5);
		return sizeAddedMessage.getText();
	}

}
