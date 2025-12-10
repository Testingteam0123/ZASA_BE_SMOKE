package commonObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class SidePages extends BasePage {

	public SidePages(WebDriver driver) {
		super(driver);
	}

	// ======================
	// LOCATORS
	// ======================

	@FindBy(xpath = "//span[text()='Product Management']")
	WebElement btnProductManagement;

	@FindBy(xpath = "//button[text()='Product Settings']")
	WebElement brnProductSettings;

	@FindBy(xpath = "(//button[text()='Weight Management'])[1]")
	WebElement btnWeightManagement;

	@FindBy(xpath = "//button[text()='Product']")
	WebElement btnProduct;

	@FindBy(xpath = "(//button[text()='Product Barcode Printing'])[1]")
	WebElement btnProductBarcodePrinting;

	@FindBy(xpath = "//span[text()='Quotation & Purchase']")
	WebElement btnQuotationAndPurchase;
	
	@FindBy(xpath="//*[text()='Quotation Management']")
	WebElement btnQuotationManagement;
	
	@FindBy(xpath="//*[text()='Purchase Management']")
	WebElement btnPurchaseManagement;
	
	@FindBy(xpath="//*[text()='Purchase Return']")
	WebElement btnPurchaseReturn;
	
	@FindBy(xpath = "//span[text()='Stock Management']")
	WebElement btnStockManagement;
	
	@FindBy(xpath = "(//*[text()='Stocks'])[1]")
	WebElement btnStocks;
	
	@FindBy(xpath="//*[text()='Mark Dead Stock']")
	WebElement btnMarkDeadStock;
	
	@FindBy(xpath="//span[text()='Order Management']")
	WebElement btnOrderManagement;
	
	@FindBy(xpath="//*[text()='Orders']")
	WebElement btnOrders;
	
	@FindBy(xpath="//button[text()='Order Status Scanner']")
	WebElement btnOrderStatusScanner;
	
	@FindBy(xpath="//button[text()='Exchange']")
	WebElement btnExchange;
	
	@FindBy(xpath="//button[text()='Return']")
	WebElement btnReturn;
	
	@FindBy(xpath="//button[text()='Scan to Pack']")
	WebElement btnScanToPack;
	
	@FindBy(xpath="//button[text()='Customer']")
	WebElement btnCustomer;
	
	@FindBy(xpath="//span[text()='Settings']")
	WebElement btnSettings;
	
	@FindBy(xpath="(//button[text()='Rate Management'])[1]")
	WebElement btnRateManagement;
	
	@FindBy(xpath="(//button[text()='Discount Coupon'])[1]")
	WebElement btnDiscountCoupon;
	
	@FindBy(xpath="(//button[text()='Order Settings'])[1]")
	WebElement btnOrderSettings;
	
	@FindBy(xpath="(//button[text()='Email Settings'])[1]")
	WebElement btnEmailSettings;
	
	@FindBy(xpath="(//button[text()='Delivery Partner'])[1]")
	WebElement btnDeliveryPartner;
	
	@FindBy(xpath="//span[text()='User Management']")
	WebElement btnUserManagement;
	
	
	
	
	// ======================
	// Methods
	// ======================
	
	public void openProductSettingspage() {
		btnProductManagement.click();
		brnProductSettings.click();
	}

	public void openWeightManagementpage() {
		btnProductManagement.click();
		btnWeightManagement.click();
	}

	public void openProductPage() {
		btnProductManagement.click();
		btnProduct.click();
	}

	public void openProductBarcodePrintingPage() {
		btnProductManagement.click();
		btnProductBarcodePrinting.click();
	}
	public void openQuotationManagementPage() {
		btnQuotationAndPurchase.click();
		btnQuotationManagement.click();
	}
	
	
	public void openPurchaseManagementPage() {
		btnQuotationAndPurchase.click();
		btnPurchaseManagement.click();
	}
	
	public void openPurchaseReturnPage() {
		btnQuotationAndPurchase.click();
		btnPurchaseReturn.click();
	}
	
	public void openStocksPage() {
		btnStockManagement.click();
		btnStocks.click();
	}
	
	public void openMarkDeadStock()
	{
		btnStockManagement.click();
		btnMarkDeadStock.click();
	}
	
	public void openOrdersModule()
	{
		btnOrderManagement.click();
		btnOrders.click();
	}
	
	public void openOrderScannerPage()
	{
		btnOrderManagement.click();
		btnOrderStatusScanner.click();
	}
	
	public void openExchangePage()
	{
		btnOrderManagement.click();
		btnExchange.click();
	}
	
	public void openReturnPage()
	{
		btnOrderManagement.click();
		btnReturn.click();
	}
	
	public void openScanToPack()
	{
		btnOrderManagement.click();
		btnScanToPack.click();
	}
	
	public void openCustomerPage()
	{
		btnOrderManagement.click();
		btnCustomer.click();
	}
	
	public void openRateManagementPage()
	{
		btnSettings.click();
		btnRateManagement.click();
	}
	
	public void openDiscountCouponPage()
	{
		btnSettings.click();
		btnDiscountCoupon.click();
	}
	
	public void openOrderSettingsPage()
	{
		btnSettings.click();
		btnOrderSettings.click();
	}
	
	public void openEmailSettingsPage()
	{
		btnSettings.click();
		btnEmailSettings.click();
	}
	
	public void openDeliveryPartnerPage()
	{
		btnSettings.click();
		btnDeliveryPartner.click();
	}
	
	public void openUserManagement()
	{
		btnUserManagement.click();
	}
	
}
