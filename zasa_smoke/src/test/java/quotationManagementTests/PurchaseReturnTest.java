package quotationManagementTests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import baseTest.BaseTest;
import commonObjects.SidePages;
import quotationManagementObjects.PurchaseReturnPage;


import org.testng.Assert;

import utilities.ExtentTestListener;

@Listeners(ExtentTestListener.class)
public class PurchaseReturnTest extends BaseTest {

	@Test(priority = 1)
	public void addPurchaseReturnTest() {
		ExtentTest test = ExtentTestListener.getTest();
		SidePages sp = new SidePages(driver);
		PurchaseReturnPage prp = new PurchaseReturnPage(driver);
		try {
			test.info("Opening the Quotation and Purchase module");
			sp.openPurchaseReturnPage();
			test.info("Adding the purchase in the purchase return section");
			prp.clickAddPurchaseReturn();
			prp.selectSupplier();
			prp.selectDate("01/01/2026");
			prp.selectPurchase();
			prp.clickProductSelectedIcon();

			String purchaseReturnMsg = prp.getPurchaseReturnAddedMessage();
			Assert.assertEquals(purchaseReturnMsg, "Purchase Return added Successfully.");
			test.pass("Purchase Return added Successfully.");
		} catch (Exception e) {
			test.fail("Failed" + e.getMessage());
			throw e;
		}

	}

	@Test(priority = 3)
	public void checkSearchBarFunction() {
		ExtentTest test = ExtentTestListener.getTest();
		SidePages sp = new SidePages(driver);
		PurchaseReturnPage prp = new PurchaseReturnPage(driver);
		try {
			test.info("Opening the Quotation and Purchase module");
			sp.openPurchaseReturnPage();
			test.info("Checking the search bar function in Purchase Return");
			String purchaseReturn = prp.getPurchaseReturnText();
			prp.checkSearchBox(purchaseReturn);
			test.pass("Search bar function is working successfully.");
		} catch (Exception e) {
			test.fail("Failed" + e.getMessage());
			throw e;
		}

	}
	
	@Test(priority = 2)
	public void checkPurchaseDetail() {
		ExtentTest test = ExtentTestListener.getTest();
		SidePages sp = new SidePages(driver);
		PurchaseReturnPage prp = new PurchaseReturnPage(driver);
		try {
			test.info("Opening the Quotation and Purchase module");
			sp.openPurchaseReturnPage();
			test.info("Checking the purchase deatils in action function");
			
			prp.viewDetails();
			test.pass("View feature is working successfully.");
		} catch (Exception e) {
			test.fail("Failed" + e.getMessage());
			throw e;
		}

	}

}
