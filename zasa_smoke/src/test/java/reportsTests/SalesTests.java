package reportsTests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import baseTest.BaseTest;
import commonObjects.SidePages;
import reportsObjects.stocksPage;
import utilities.ExtentTestListener;

@Listeners(ExtentTestListener.class)
public class SalesTests extends BaseTest{
	
	@Test(priority = 1)
	public void verifyTheSalesReport()
	{
		ExtentTest test= ExtentTestListener.getTest();
		SidePages sidepages=new SidePages(driver);
		stocksPage sp= new stocksPage(driver);
		try {
			test.info("Verifying the Sales Report");
			sidepages.openSalesReport();
			String actualheading=sp.getHeading();
			Assert.assertEquals(actualheading, "Sales Report");
			test.pass("Sales Report is redirecting to Sales Report properly");
		}
		catch(Exception e)
		{
			test.fail("Failed"+e.getMessage());
			throw e;
		}
	}
	
	@Test
	public void verifyTheSalesByCustomer()
	{
		ExtentTest test= ExtentTestListener.getTest();
		SidePages sidepages=new SidePages(driver);
		stocksPage sp= new stocksPage(driver);
		try {
			test.info("Verifying the Sales by customer report");
			sidepages.openSalesByCustomer();
			String actualheading=sp.getHeading();
			Assert.assertEquals(actualheading, "Sales by Customer");
			test.pass("Sales by Customer Report is redirecting to Sales by Customer Report properly");
		}
		catch(Exception e)
		{
			test.fail("Failed"+e.getMessage());
			throw e;
		}
	}
	
	@Test
	public void verifyTheSalesByProduct()
	{
		ExtentTest test= ExtentTestListener.getTest();
		SidePages sidepages=new SidePages(driver);
		stocksPage sp= new stocksPage(driver);
		try {
			test.info("Verifying the Sales by Product report");
			sidepages.openSalesByProduct();
			String actualheading=sp.getHeading();
			Assert.assertEquals(actualheading, "Sales by Product");
			test.pass("Sales by Product Report is redirecting to Sales by Product Report properly");
		}
		catch(Exception e)
		{
			test.fail("Failed"+e.getMessage());
			throw e;
		}
	}
	
	@Test
	public void verifyTheSalesByStudent()
	{
		ExtentTest test= ExtentTestListener.getTest();
		SidePages sidepages=new SidePages(driver);
		stocksPage sp= new stocksPage(driver);
		try {
			test.info("Verifying the Sales by Student report");
			sidepages.openSalesByStudent();
			String actualheading=sp.getHeading();
			Assert.assertEquals(actualheading, "Sales by Student");
			test.pass("Sales by Student Report is redirecting to Sales by Student Report properly");
		}
		catch(Exception e)
		{
			test.fail("Failed"+e.getMessage());
			throw e;
		}
	}
	
	@Test(priority = 2)
	public void verifyTheOnlinePaymentReport()
	{
		ExtentTest test= ExtentTestListener.getTest();
		SidePages sidepages=new SidePages(driver);
		stocksPage sp= new stocksPage(driver);
		try {
			test.info("Verifying the Online Payment Report");
			sidepages.openOnlinePaymentReport();
			String actualheading=sp.getHeading();
			Assert.assertEquals(actualheading, "Online Payment Report");
			test.pass("Online Payment Report is redirecting to Online Payment Report properly");
		}
		catch(Exception e)
		{
			test.fail("Failed"+e.getMessage());
			throw e;
		}
	}
	
	@Test(priority = 3)
	public void verifyTheStatusWiseOrderReport()
	{
		ExtentTest test= ExtentTestListener.getTest();
		SidePages sidepages=new SidePages(driver);
		stocksPage sp= new stocksPage(driver);
		try {
			test.info("Verifying the Status Wise Order Report");
			sidepages.openStatusWiseOrderReport();
			String actualheading=sp.getHeading();
			Assert.assertEquals(actualheading, "Status Wise Order Report");
			test.pass("Status Wise Order Report is redirecting to Status Wise Order Report properly");
		}
		catch(Exception e)
		{
			test.fail("Failed"+e.getMessage());
			throw e;
		}
	}
	
	@Test(priority = 4)
	public void verifyTheClassroomDeliveryReport()
	{
		ExtentTest test= ExtentTestListener.getTest();
		SidePages sidepages=new SidePages(driver);
		stocksPage sp= new stocksPage(driver);
		try {
			test.info("Verifying the Classroom Delivery Report");
			sidepages.openClassroomDeliveryReport();
			String actualheading=sp.getHeading();
			Assert.assertEquals(actualheading, "Classroom Delivery Report");
			test.pass("Classroom Delivery Report is redirecting to Classroom Delivery Report properly");
		}
		catch(Exception e)
		{
			test.fail("Failed"+e.getMessage());
			throw e;
		}
	}
	
	@Test(priority = 5)
	public void verifyTheExchangeReport()
	{
		ExtentTest test= ExtentTestListener.getTest();
		SidePages sidepages=new SidePages(driver);
		stocksPage sp= new stocksPage(driver);
		try {
			test.info("Verifying the Exchange Report");
			sidepages.openExchangeReport();
			String actualheading=sp.getHeading();
			Assert.assertEquals(actualheading, "Exchange Report");
			test.pass("Exchange Report is redirecting to Exchange Report properly");
		}
		catch(Exception e)
		{
			test.fail("Failed"+e.getMessage());
			throw e;
		}
	}
	
	@Test(priority = 6)
	public void verifyTheReturnReport()
	{
		ExtentTest test= ExtentTestListener.getTest();
		SidePages sidepages=new SidePages(driver);
		stocksPage sp= new stocksPage(driver);
		try {
			test.info("Verifying the Return Report");
			sidepages.openReturnReport();
			String actualheading=sp.getHeading();
			Assert.assertEquals(actualheading, "Return Report");
			test.pass("Return Report is redirecting to Return Report properly");
		}
		catch(Exception e)
		{
			test.fail("Failed"+e.getMessage());
			throw e;
		}
	}
	
	@Test(priority = 7)
	public void verifyTheCollectOrderReport()
	{
		ExtentTest test= ExtentTestListener.getTest();
		SidePages sidepages=new SidePages(driver);
		stocksPage sp= new stocksPage(driver);
		try {
			test.info("Verifying the Collect Order Report");
			sidepages.openCollectOrderReport();
			String actualheading=sp.getHeading();
			Assert.assertEquals(actualheading, "Collect Order Report");
			test.pass("Collect Order Report is redirecting to Collect Order Report properly");
		}
		catch(Exception e)
		{
			test.fail("Failed"+e.getMessage());
			throw e;
		}
	}
	
	@Test(priority = 8)
	public void verifyTheCancelOrderReport()
	{
		ExtentTest test= ExtentTestListener.getTest();
		SidePages sidepages=new SidePages(driver);
		stocksPage sp= new stocksPage(driver);
		try {
			test.info("Verifying the Cancel Order Report");
			sidepages.openCancelOrderReport();
			String actualheading=sp.getHeading();
			Assert.assertEquals(actualheading, "Cancel Order Report");
			test.pass("Cancel Order Report is redirecting to Cancel Order Report properly");
		}
		catch(Exception e)
		{
			test.fail("Failed"+e.getMessage());
			throw e;
		}
	}
	
	@Test(priority = 9)
	public void verifyTheCouponReport()
	{
		ExtentTest test= ExtentTestListener.getTest();
		SidePages sidepages=new SidePages(driver);
		stocksPage sp= new stocksPage(driver);
		try {
			test.info("Verifying the Coupon Report");
			sidepages.openCouponReport();
			String actualheading=sp.getHeading();
			Assert.assertEquals(actualheading, "Coupon Report");
			test.pass("Coupon Report is redirecting to Coupon Report properly");
		}
		catch(Exception e)
		{
			test.fail("Failed"+e.getMessage());
			throw e;
		}
	}
	
	@Test(priority = 10)
	public void verifyTheKitReport()
	{
		ExtentTest test= ExtentTestListener.getTest();
		SidePages sidepages=new SidePages(driver);
		stocksPage sp= new stocksPage(driver);
		try {
			test.info("Verifying the Kit Report");
			sidepages.openKitReport();
			String actualheading=sp.getHeading();
			Assert.assertEquals(actualheading, "Kit Report");
			test.pass("Kit Report is redirecting to Kit Report properly");
		}
		catch(Exception e)
		{
			test.fail("Failed"+e.getMessage());
			throw e;
		}
	}

}
