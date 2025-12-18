package quotationManagementTests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import baseTest.BaseTest;
import commonObjects.SidePages;
import quotationManagementObjects.PurchaseManagementPage;
import quotationManagementObjects.PurchaseReturnPage;

import org.testng.Assert;

import utilities.ExtentTestListener;

@Listeners(ExtentTestListener.class)
public class PurchaseManagementTest extends BaseTest{
	
	@Test(priority=1)
	public void addpurchaseManagementTest()
	{
		ExtentTest test = ExtentTestListener.getTest();
		SidePages sp = new SidePages(driver);
		PurchaseManagementPage pmp= new PurchaseManagementPage(driver);
		try {
		test.info("Opening the Quotation and Purchase module");
		sp.openPurchaseManagementPage();
		test.info("In the Purchase management adding the purchase order");
		pmp.clickAddPurchaseOrder();
		
		pmp.selectPurchaseOrderOption();
		
		String purchaseordersuccessmsg=pmp.getPurchaseOrderAddedMessage();
		Assert.assertEquals(purchaseordersuccessmsg, "Purchase Order added successfully.");
		test.pass("Purchase Order added successfully.");
		}
		catch(Exception e)
		{
			test.fail("Failed"+e.getMessage());
			throw e;
		}
	}
	
	@Test(priority=4)
	public void deletePurchaseOrderTest()
	{
		ExtentTest test = ExtentTestListener.getTest();
		SidePages sp = new SidePages(driver);
		PurchaseManagementPage pmp= new PurchaseManagementPage(driver);
		try {
		test.info("Opening the Quotation and Purchase module");
		sp.openPurchaseManagementPage();
		test.info("In the Purchase management deleting the purchase order");
		pmp.deletePurchaseOrder();
		String purchaseorderdeletemsg=pmp.getPurchaseOrderDeletedMessage();
		Assert.assertEquals(purchaseorderdeletemsg, "Purchase Order deleted successfully.");
		test.pass("Purchase Order deleted successfully.");
		}
		catch(Exception e)
		{
			test.fail("Failed"+e.getMessage());
			throw e;
		}
		
	}
	
	//@Test(priority=3)
	public void approvePurchaseOrderTest()
	{
		ExtentTest test = ExtentTestListener.getTest();
		SidePages sp = new SidePages(driver);
		PurchaseManagementPage pmp= new PurchaseManagementPage(driver);
		try {
		test.info("Opening the Quotation and Purchase module");
		sp.openPurchaseManagementPage();
		test.info("In the Purchase management approving the status of purchase order");
		pmp.changeStatusToApproved("Approved");
		
		String purchaseorderapprovemsg=pmp.getPurchaseStatusUpdatedMessage();
		Assert.assertEquals(purchaseorderapprovemsg, "Purchase status updated successfully.");
		test.pass("Purchase status updated successfully.");
		}
		catch(Exception e)
		{
			test.fail("Failed"+e.getMessage());
			throw e;
		}
	}
	
	@Test(priority = 2)
	public void checkSearchBarFunction() {
		ExtentTest test = ExtentTestListener.getTest();
		SidePages sp = new SidePages(driver);
		PurchaseManagementPage pmp= new PurchaseManagementPage(driver);
		try {
		test.info("Opening the Quotation and Purchase module");
		sp.openPurchaseManagementPage();
			test.info("Checking the search bar function in Purchase Management");
			String purchaseID = pmp.getPurchaseIDText();
			pmp.checkSearchBox(purchaseID);
			test.pass("Search bar function is working successfully.");
		} catch (Exception e) {
			test.fail("Failed" + e.getMessage());
			throw e;
		}

	}
	
	@Test(priority = 3)
	public void checkViewDetailsFunction() {
		ExtentTest test = ExtentTestListener.getTest();
		SidePages sp = new SidePages(driver);
		PurchaseManagementPage pmp= new PurchaseManagementPage(driver);
		try {
		test.info("Opening the Quotation and Purchase module");
		sp.openPurchaseManagementPage();
			test.info("Checking the view details function in Purchase Management");
			
			pmp.viewDetails();
			test.pass("View details function is working successfully.");
		} catch (Exception e) {
			test.fail("Failed" + e.getMessage());
			throw e;
		}

	}
	

}
