package quotationManagementTests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import baseTest.BaseTest;
import commonObjects.SidePages;
import quotationManagementObjects.QuotationManagementPage;

import org.testng.Assert;

import utilities.ExtentTestListener;

@Listeners(ExtentTestListener.class)
public class QuotationMangementTest extends BaseTest {

	@Test(priority = 1)
	public void addQuotation() {

		ExtentTest test = ExtentTestListener.getTest();
		SidePages sp = new SidePages(driver);
		QuotationManagementPage qmp = new QuotationManagementPage(driver);
		try {
			test.info("Opening the Quotation and Purchase module");
			sp.openQuotationManagementPage();
			test.info("Adding Quotation to the Quotation Management Module");
			qmp.clickAddQuotation();
			qmp.selectSupplierCordova();
			qmp.selectCategoryUniform();
			qmp.selectProduct();
			qmp.clickAddBtnOfProduct(0);
			qmp.clickAddBtnOfProduct(0);
			qmp.clickAddBtnOfProduct(0);
			qmp.clickSaveBtn();

			String quotationsucessmsg = qmp.getQuotationAddedMessage();

			Assert.assertEquals(quotationsucessmsg, "Quotation added successfully.");
			test.pass("Quotation added successfully.");
		} catch (Exception e) {
			test.fail("Failed" + e.getMessage());
			throw e;
		}

	}
	
	@Test(priority = 3)
	public void checkSearchBarFunction() {
		ExtentTest test = ExtentTestListener.getTest();
		SidePages sp = new SidePages(driver);
		QuotationManagementPage qmp = new QuotationManagementPage(driver);
		try {
			test.info("Opening the Quotation and Purchase module");
			sp.openQuotationManagementPage();
			test.info("Checking the search bar function in Quotation Management");
			String quotation=qmp.getQuotationText();
			qmp.checkSearchBox(quotation);
			test.pass("Search bar function is working successfully.");
		} catch (Exception e) {
			test.fail("Failed" + e.getMessage());
			throw e;
		}

	}
	

	

	@Test(priority = 3)
	public void viewQuotationDetailsFunction() {
		ExtentTest test = ExtentTestListener.getTest();
		SidePages sp = new SidePages(driver);
		QuotationManagementPage qmp = new QuotationManagementPage(driver);
		try {
			test.info("Opening the Quotation and Purchase module");
			sp.openQuotationManagementPage();
			test.info("Checking the quotation details view function");
			qmp.viewQuotationDetails();
			test.pass("Quotation details can be viewed successfully.");
		} catch (Exception e) {
			test.fail("Failed" + e.getMessage());
			throw e;
		}

	}
	
	@Test(priority = 2)
	public void approveQuotation() throws Exception {
		ExtentTest test = ExtentTestListener.getTest();
		SidePages sp = new SidePages(driver);
		QuotationManagementPage qmp = new QuotationManagementPage(driver);
		try {
			test.info("Opening the Quotation and Purchase module");
			sp.openQuotationManagementPage();
			test.info("Approving the Quotation status in Quotation Management Module");
			qmp.approveStatus("Approved");
			String expectedMessage = qmp.getQuotationStatusUpdatedMesssage();
			Assert.assertEquals(expectedMessage, "Quotation status updated successfully.");
			test.pass("Quotation status updated successfully.");

		} catch (Exception e) {
			test.fail("Failed" + e.getMessage());
			throw e;
		}
	}

	@Test(priority = 5)
	public void deleteQuotation() {
		ExtentTest test = ExtentTestListener.getTest();
		SidePages sp = new SidePages(driver);
		QuotationManagementPage qmp = new QuotationManagementPage(driver);
		try {
			test.info("Opening the Quotation and Purchase module");
			sp.openQuotationManagementPage();
			test.info("Deleting the quotation in Quotation Management Module");
			qmp.deleteQuotation();
			String quotationdeletemsg = qmp.getQuotationDeletedMessage();
			Assert.assertEquals(quotationdeletemsg, "Quotation deleted successfully.");
			test.pass("Quotation deleted successfully.");
		} catch (Exception e) {
			test.fail("Failed" + e.getMessage());
			throw e;
		}
	}

}
