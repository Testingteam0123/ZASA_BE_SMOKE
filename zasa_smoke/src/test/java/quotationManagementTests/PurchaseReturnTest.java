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
	
	
	@Test
	public void addPurchaseReturnTest()
	{
		ExtentTest test = ExtentTestListener.getTest();
		SidePages sp = new SidePages(driver);
		PurchaseReturnPage prp= new PurchaseReturnPage(driver);
		try {
		test.info("Opening the Quotation and Purchase module");
		sp.openPurchaseReturnPage();
		test.info("Adding the purchase in the purchase return section");
		prp.clickAddPurchaseReturn();
		prp.selectSupplier();
		prp.selectDate("30/11/2025");
		prp.selectPurchase();
		prp.clickProductSelectedIcon();
		
		String purchaseReturnMsg=prp.getPurchaseReturnAddedMessage();
		Assert.assertEquals(purchaseReturnMsg, "Purchase Return added Successfully.");
		test.pass("Purchase Return added Successfully.");
		}
		catch(Exception e)
		{
		  test.fail("Failed"+e.getMessage());
		  throw e;
		}
		 
		
	}

}
