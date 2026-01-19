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
	private WebElement btnProductManagement;

	@FindBy(xpath = "//button[text()='Product Settings']")
	private WebElement brnProductSettings;

	@FindBy(xpath = "(//button[text()='Weight Management'])[1]")
	private WebElement btnWeightManagement;

	@FindBy(xpath = "//button[text()='Product']")
	private WebElement btnProduct;

	@FindBy(xpath = "(//button[text()='Product Barcode Printing'])[1]")
	private WebElement btnProductBarcodePrinting;

	@FindBy(xpath = "//span[text()='Quotation & Purchase']")
	private WebElement btnQuotationAndPurchase;
	
	@FindBy(xpath="//*[text()='Quotation Management']")
	private WebElement btnQuotationManagement;
	
	@FindBy(xpath="//*[text()='Purchase Management']")
	private WebElement btnPurchaseManagement;
	
	@FindBy(xpath="//*[text()='Purchase Return']")
	private WebElement btnPurchaseReturn;
	
	@FindBy(xpath = "//span[text()='Stock Management']")
	private WebElement btnStockManagement;
	
	@FindBy(xpath = "(//*[text()='Stocks'])[1]")
	private WebElement btnStocks;
	
	@FindBy(xpath="//*[text()='Mark Dead Stock']")
	private WebElement btnMarkDeadStock;
	
	@FindBy(xpath="//span[text()='Order Management']")
	private WebElement btnOrderManagement;
	
	@FindBy(xpath="//*[text()='Orders']")
	private WebElement btnOrders;
	
	@FindBy(xpath="//button[text()='Order Status Scanner']")
	private WebElement btnOrderStatusScanner;
	
	@FindBy(xpath="//button[text()='Exchange']")
	private WebElement btnExchange;
	
	@FindBy(xpath="//button[text()='Return']")
	private WebElement btnReturn;
	
	@FindBy(xpath="//button[text()='Scan to Pack']")
	private WebElement btnScanToPack;
	
	@FindBy(xpath="//button[text()='Customer']")
	private WebElement btnCustomer;
	
	@FindBy(xpath="//span[text()='Settings']")
	private WebElement btnSettings;
	
	@FindBy(xpath="(//button[text()='Rate Management'])[1]")
	private WebElement btnRateManagement;
	
	@FindBy(xpath="(//button[text()='Discount Coupon'])[1]")
	private WebElement btnDiscountCoupon;
	
	@FindBy(xpath="(//button[text()='Order Settings'])[1]")
	private WebElement btnOrderSettings;
	
	@FindBy(xpath="(//button[text()='Email Settings'])[1]")
	private WebElement btnEmailSettings;
	
	@FindBy(xpath="(//button[text()='Delivery Partner'])[1]")
	private WebElement btnDeliveryPartner;
	
	@FindBy(xpath="//span[text()='User Management']")
	private WebElement btnUserManagement;
	
	@FindBy(xpath = "//button//span[text()='Reports']")
	private WebElement btnReports;
	
	@FindBy(xpath="//button//span[text()='Stocks']")
	private WebElement btnStockss;
	
	@FindBy(xpath="//button//span[text()='Sales']")
	private WebElement btnSales;
	
	@FindBy(xpath="(//button[text()='Sub Store Stock Report'])[1]")
	private WebElement btnSubStoreReport;
	
	@FindBy(xpath="(//button[text()='Main Store Stock Report'])[1]")
	private WebElement btnMainStoreReport;
	
	@FindBy(xpath = "(//button[text()='Category Wise Report'])[1]")
	private WebElement btnCategoryWiseReport;
	
	@FindBy(xpath="(//button[text()='Stock Allotment Report'])[1]")
	private WebElement btnStockAllotmentReport;
	
	@FindBy(xpath="(//button[text()='Sales Report'])[1]")
	private WebElement btnSalesReport;
	
	@FindBy(xpath="(//button[text()='Account Report'])[1]")
	private WebElement btnAccountReport;
	
	@FindBy(xpath="(//button[text()='Sales By Customer'])[1]")
	private WebElement btnSalesByCustomer;
	
	@FindBy(xpath="(//button[text()='Sales By Product'])[1]")
	private WebElement btnSalesByProduct;
	
	@FindBy(xpath="(//button[text()='Sales By Student'])[1]")
	private WebElement btnSalesByStudent;
	
	@FindBy(xpath="(//button[text()='Online Payment Report'])[1]")
	private WebElement btnOnlinePaymentReport;
	
	@FindBy(xpath="(//button[text()='Status Wise Order Report'])[1]")
	private WebElement btnStatusWiseOrderReport;
	
	@FindBy(xpath="(//button[text()='Classroom Delivery Report'])[1]")
	private WebElement btnClassroomDelivaryReport;
	
	@FindBy(xpath="(//button[text()='Exchange Report'])[1]")
	private WebElement btnExchangeReport;
	
	@FindBy(xpath="(//button[text()='Return Report'])[1]")
	private WebElement btnReturnReport;
	
	@FindBy(xpath="(//button[text()='Collect Order Report'])[1]")
	private WebElement btnCollectOrderReport;
	
	@FindBy(xpath="(//button[text()='Cancel Order Report'])[1]")
	private WebElement btnCancelOrderReport;
	
	@FindBy(xpath="(//button[text()='Coupon Report'])[1]")
	private WebElement btnCouponReport;
	
	@FindBy(xpath="(//button[text()='Kit Report'])[1]")
	private WebElement btnKitReport;
	
	

	
	
	
	
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
	
	
	public void openSubStoreStockReport()
	{
		openStocksMenuIfNeeded();
		btnSubStoreReport.click();
	}
	
	
	
	public void openMainStoreStockReport()
	{
		openStocksMenuIfNeeded();
		btnMainStoreReport.click();
	}
	
	public void openCategoryWiseReport()
	{
		openStocksMenuIfNeeded();
		btnCategoryWiseReport.click();
	}
	
	public void openStockAllotmentReport()
	{
		openStocksMenuIfNeeded();
		btnStockAllotmentReport.click();
	}
	
	public void openSalesReport()
	{
		openSalesMenuIfNeeded();
		btnSalesReport.click();
	}
	
	public void openAccountReport()
	{
		openSalesMenuIfNeeded();
		btnAccountReport.click();
	}
	
	public void openSalesByCustomer()
	{
		openSalesMenuIfNeeded();
		btnSalesByCustomer.click();
	}
	
	public void openSalesByProduct()
	{
		openSalesMenuIfNeeded();
		btnSalesByProduct.click();
	}
	
	public void openSalesByStudent()
	{
		openSalesMenuIfNeeded();
		btnSalesByStudent.click();
	}
	
	public void openOnlinePaymentReport()
	{
		openSalesMenuIfNeeded();
		btnOnlinePaymentReport.click();
	}
	
	public void openStatusWiseOrderReport()
	{
		openSalesMenuIfNeeded();
		btnStatusWiseOrderReport.click();
	}
	
	public void openClassroomDeliveryReport()
	{
		openSalesMenuIfNeeded();
		btnClassroomDelivaryReport.click();
	}
	
	public void openExchangeReport()
	{
		openSalesMenuIfNeeded();
		btnExchangeReport.click();
	}
	
	public void openReturnReport()
	{
		openSalesMenuIfNeeded();
		btnReturnReport.click();
	}
	
	public void openCollectOrderReport()
	{
		openSalesMenuIfNeeded();
		btnCollectOrderReport.click();
	}
	
	public void openCancelOrderReport()
	{
		openSalesMenuIfNeeded();
		btnCancelOrderReport.click();
	}
	
	public void openCouponReport()
	{
		openSalesMenuIfNeeded();
		btnCouponReport.click();
	}
	
	public void openKitReport()
	{
		openSalesMenuIfNeeded();
		btnKitReport.click();
	}	
	
	public void openStocksMenuIfNeeded() {
	    if (!btnSubStoreReport.isDisplayed()) {
	        btnReports.click();
	        btnStockss.click();
	    }
	}
	
	public void openSalesMenuIfNeeded()
	{
		if(!btnSalesReport.isDisplayed())
		{
			btnReports.click();
			btnSales.click();	
		}
	}
	
	
}
