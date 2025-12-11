package orderManagementObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import commonObjects.BasePage;
import utilities.WaitHelper;

public class ReturnPage extends BasePage {
	
	WaitHelper wait = new WaitHelper(driver);

	public ReturnPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//button[text()='Bulk Search']")
	private WebElement btnBulkSearch;

	@FindBy(xpath = "//textarea")
	private WebElement textarea;

	@FindBy(xpath = "//button[text()='Search']")
	private WebElement btnSearch;

	@FindBy(xpath = "//div[text()='Search completed for 1 item(s)']")
	private WebElement bulkSearchMessage;
	
	@FindBy(xpath="(//button[contains(@aria-label,'View')])[1]")
	private WebElement returnDetailView;

	public void clickBulkSearch() {
		btnBulkSearch.click();
	}

	public void enterReturnIDTextArea(String orderID) {
		textarea.sendKeys(orderID);
	}

	public void clickSearch() {
		btnSearch.click();
	}

	public String getBulkSearchMessage() {
		wait.visibilityOf(bulkSearchMessage, 3);
		return bulkSearchMessage.getText();

	}
	
	public void clickReturnDetailView()
	{
		returnDetailView.click();
	}

}
