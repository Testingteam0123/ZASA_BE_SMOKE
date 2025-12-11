package stockManagementObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import commonObjects.BasePage;


public class StockPage extends BasePage {

	public StockPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//table[contains(@class,'min-w-full')]")
	private WebElement stockTable;
	
	
	@FindBy(xpath = "//table//tbody//tr")
	private List<WebElement> stockTableRows;
	
	@FindBy(xpath = "//span[text()='Next']")
	private WebElement nextButton;
	
	
	public boolean isStockTableDisplayed() {
		return stockTable.isDisplayed();
	}
	
	public int getStockTableRowCount() {
		return stockTableRows.size();
	}
	
	public void clickNextButton() {
		nextButton.click();
	}

}
