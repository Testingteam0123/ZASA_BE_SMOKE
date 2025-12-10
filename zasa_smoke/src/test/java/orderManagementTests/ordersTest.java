package orderManagementTests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import baseTest.BaseTest;
import commonObjects.SidePages;
import orderManagementObjects.orderspage;
import utilities.ExtentTestListener;

@Listeners(ExtentTestListener.class)
public class ordersTest extends BaseTest{
	
	
	@Test(priority = 1)
	public void verifyOrdersearchFunction()
	{
		ExtentTest test = ExtentTestListener.getTest();
		SidePages sp= new SidePages(driver);
		orderspage om= new orderspage(driver);
		try
		{
			test.info("Navigating to the order module");
			sp.openOrdersModule();
			test.info("Entering the orderId in the Search function");
			om.checkSearch(p.getProperty("orderID"));
			test.pass("OrderID entered the search box successfully");
			
			
		}
		catch(Exception e)
		{
			test.fail("Failed"+e.getMessage());
			throw e;
			
		}
		
	}
	
	@Test(priority = 2)
	public void verifyTheViewOrderDeatils()
	{
		ExtentTest test = ExtentTestListener.getTest();
		SidePages sp= new SidePages(driver);
		orderspage om= new orderspage(driver);
		try
		{
			test.info("Navigating to the order module");
			sp.openOrdersModule();
			test.info("Entering the orderId in the Search function");
			 om.clearSearch();
			 
			om.checkSearch(p.getProperty("orderID"));
			test.info("Check the order details in the order");
			om.viewOrder();
			
			String url = driver.getCurrentUrl();
			Assert.assertTrue(url.contains("orderdetails"), 
			    "Order details page did not open. URL: " + url);
			test.pass("Navigated to the order detail page");
			
		}
		catch(Exception e)
		{
			test.fail("Failed"+e.getMessage());
			throw e;
		}
	}
	
   @Test(priority = 3)
   public void verifyAwaitForPayment()
   {
	   ExtentTest test = ExtentTestListener.getTest();
		SidePages sp= new SidePages(driver);
		orderspage om= new orderspage(driver);
		try
		{
			test.info("Navigating to the order module");
			sp.openOrdersModule();
			test.info("verifying the Await for payment page");
			om.awaitForPaymentpage();
			String url = driver.getCurrentUrl();
			Assert.assertTrue(url.contains("pending"), 
			    "Await for Payment Orders page did not open. URL: " + url);
			test.pass("Navigated to the Await for Payment Orders page");
		}
		catch(Exception e)
		{
			test.fail("Failed"+e.getMessage());
			throw e;
		}
   }
   
   @Test(priority = 4)
   public void verifyCancelledPage()
   {
	   ExtentTest test = ExtentTestListener.getTest();
		SidePages sp= new SidePages(driver);
		orderspage om= new orderspage(driver);
		try
		{
			test.info("Navigating to the order module");
			sp.openOrdersModule();
			test.info("verifying the cancelled page");
			om.cancelledpage();
			String url = driver.getCurrentUrl();
			Assert.assertTrue(url.contains("cancelled"), 
			    "Cancelled Orders page did not open. URL: " + url);
			test.pass("Navigated to the Cancelled Orders page");
		}
		catch(Exception e)
		{
			test.fail("Failed"+e.getMessage());
			throw e;
		}
   }

   
   @Test(priority = 5)
   public void verifyBulkSearchFunctionality()
   {
	   ExtentTest test = ExtentTestListener.getTest();
		SidePages sp= new SidePages(driver);
		orderspage om= new orderspage(driver);
		try
		{
			test.info("Navigating to the order module");
			sp.openOrdersModule();
			test.info("Verifying the Bulk search page and entering orderID's");
			om.bulkSearchpage(p.getProperty("orderID"),p.getProperty("orderID2"));
			
			String actualMessage=om.getBulkSearchMessage();
			Assert.assertEquals(actualMessage, "Search completed for 2 item(s)");
			test.pass("Entered the orderID's successfully");
			
		}
		catch(Exception e)
		{
			test.fail("Failed"+e.getMessage());
			throw e;
		}
   }
	
}
