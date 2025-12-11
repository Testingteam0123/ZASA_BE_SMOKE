package productManagementObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import commonObjects.BasePage;
import utilities.WaitHelper;

public class EditionSettings extends BasePage{
	
	WaitHelper wait=new WaitHelper(driver);

	public EditionSettings(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//button[text()='EDITION']")
	private WebElement selectEdition;
	
	@FindBy(xpath="//button[text()='Add Edition']")
	private WebElement btnAddEdition;
	
	@FindBy(css="#editionname")
	private WebElement txteditionName;
	
	@FindBy(xpath="//option[text()='Stationery']")
	private WebElement selectcategory;
	
	@FindBy(xpath = "//button[text()='Save']")
	private WebElement saveBtn;
	
	@FindBy(xpath = "(//button[contains(@class,'text-[#454661]')])[1]")
	private WebElement  editEditionBtn;
	
	@FindBy(id = "editionname")
	private WebElement  editEditionField;
	
	@FindBy(xpath = "//button[text()='Update']")
	private WebElement  updateBtn;
	
	@FindBy(xpath = "//div[text()='Edition updated successfully.']")
	private WebElement editionUpdatedMessage;
	
	@FindBy(xpath = "(//button[contains(@class,'text-[#454661]')])[2]")
	private WebElement deleteEditionBtn;
	
	@FindBy(xpath="//button[text()='OK']")
	private WebElement confirmDelete;
	
	@FindBy(xpath="//div[text()='Edition deleted successfully.']")
	private WebElement editionDeletedMessage;
	
	@FindBy(xpath="//div[text()='Edition added successfully.']")
	private WebElement editionAddedMessage;
	
	

	public void createEdition(String name)
	{
		selectEdition.click();
		btnAddEdition.click();
		txteditionName.sendKeys(name);
		selectcategory.click();
		saveBtn.click();
	}
	
	public void editEdition(String newName)
	{
		selectEdition.click();
		editEditionBtn.click();
		editEditionField.clear();
		editEditionField.sendKeys(newName);
		updateBtn.click();
	}
	
	public void deleteEdition()
	{
		selectEdition.click();
		deleteEditionBtn.click();
		wait.visibilityOf(confirmDelete, 5);
		confirmDelete.click();
	}
	
	public String getEditionUpdatedMessage() {
		wait.visibilityOf(editionUpdatedMessage, 5);
		return editionUpdatedMessage.getText();
	}
	
	public String getEditionDeletedMessage() {
		wait.visibilityOf(editionDeletedMessage, 5);
		return editionDeletedMessage.getText();
	}
	
	public String getEditionAddedMessage() {
		wait.visibilityOf(editionAddedMessage, 5);
		return editionAddedMessage.getText();
	}

}
