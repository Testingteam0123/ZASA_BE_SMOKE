package productManagementObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import commonObjects.BasePage;
import utilities.WaitHelper;

public class ProductBarcodePrintingPage extends BasePage{
	
	WaitHelper wait=new WaitHelper(driver);

	public ProductBarcodePrintingPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="(//input[@inputmode='numeric'])[1]")
	private WebElement txtNoOfPrints;
	
	@FindBy(xpath="(//button[@role='checkbox'])[2]")
	private WebElement chkBox;
	
	@FindBy(xpath="//button[text()='Print Barcodes']")
	private WebElement btnPrintBarcodes;
	
	@FindBy(xpath="//div[text()='PDF downloaded successfully.']")
	private WebElement pdfDownloadedMessage;
	
	@FindBy(xpath="//div[@class='relative']//input")
	private WebElement searchBox;
	
	@FindBy(xpath="//button//span[text()='Filter']")
	private WebElement filterOption;
	
	@FindBy(xpath="(//input[@class='accent-[#966AC3]'])[1]")
	private WebElement clickBook;
	
	
	
	
	public void enterNoOfPrints(String noOfPrints) 
	{
		txtNoOfPrints.sendKeys(noOfPrints);
	}
	
	public void selectChkBox() 
	{
		chkBox.click();
	}
	
	public void clickPrintBarcodes() 
	{
		btnPrintBarcodes.click();
	}
	
	public String getPdfDownloadedMessage()
	{
		wait.visibilityOf(pdfDownloadedMessage, 3);
		return pdfDownloadedMessage.getText();
		
	}
	
	public void checkSearchBox(String name)
	{
		searchBox.sendKeys(name);
	}
	
	public void clickfilterOption()
	{
		wait.elementToBeClickable(filterOption, 5);
		filterOption.click();
	}
	
	public void selectBook()
	{
		wait.elementToBeClickable(clickBook, 5);
		clickBook.click();
		
	}
}
