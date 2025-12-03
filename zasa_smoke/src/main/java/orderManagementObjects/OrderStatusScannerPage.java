package orderManagementObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import commonObjects.BasePage;

public class OrderStatusScannerPage extends BasePage{

	public OrderStatusScannerPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//input[@placeholder='Scan or type the barcode...']")
	WebElement barcodeText;
	
	public void enterBarcode(String Barcode)
	{
		barcodeText.sendKeys(Barcode);
	}
	

}
