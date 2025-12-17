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
	
	@FindBy(xpath="//button//span[text()='Filter']")
	private WebElement filterBtn;
	
	@FindBy(xpath="(//input[@class='accent-[#966AC3]'])[1]")
	private WebElement bookOption;
	
	@FindBy(xpath="//input[contains(@placeholder,'Search')]")
	private WebElement searchBox;

	
	
	public boolean isStockTableDisplayed() {
		return stockTable.isDisplayed();
	}
	
	public int getStockTableRowCount() {
		return stockTableRows.size();
	}
	
	public void clickNextButton() {
		nextButton.click();
	}
	
	public void selectBook()
	{
		filterBtn.click();	
		bookOption.click();
	}
	
	public void enterSearch(String product)
	{
		searchBox.sendKeys(product);
	}

}
