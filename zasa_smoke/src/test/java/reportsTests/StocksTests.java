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
public class StocksTests extends BaseTest{
	
	
	@Test(priority = 1)
	public void verifyTheSubStoreStockReport()
	{
		ExtentTest test= ExtentTestListener.getTest();
		SidePages sidepages=new SidePages(driver);
		stocksPage sp= new stocksPage(driver);
		try
		{
			test.info("Checking the Sub Store Stock Report");
			sidepages.openSubStoreStockReport();
			String actualText=sp.getHeading();
			Assert.assertEquals(actualText, "Sub Store Stock Report");
			test.pass("Sub Store Stock Report is redirecting to Sub Store Stock Report properly");
			
		}
		catch(Exception e)
		{
			test.fail("Failed"+e.getMessage());
			throw e;
		}
	}
	
	@Test(priority = 2)
	public void verifyTheMainStoreStockReport()
	{
		ExtentTest test= ExtentTestListener.getTest();
		SidePages sidepages=new SidePages(driver);
		stocksPage sp= new stocksPage(driver);
		try
		{
			test.info("Checking the Sub Store Stock Report");
			sidepages.openMainStoreStockReport();
			String actualText=sp.getHeading();
			Assert.assertEquals(actualText, "Main Store Stock Report");
			test.pass("Main Store Stock Report is redirecting to Sub Store Stock Report properly");
			
		}
		catch(Exception e)
		{
			test.fail("Failed"+e.getMessage());
			throw e;
		}
	}
	
	@Test(priority = 3)
	public void verifyTheCategoryWiseReport()
	{
		ExtentTest test= ExtentTestListener.getTest();
		SidePages sidepages=new SidePages(driver);
		stocksPage sp= new stocksPage(driver);
		try
		{
			test.info("Checking the Category Wise Report");
			sidepages.openCategoryWiseReport();
			String actualText=sp.getHeading();
			Assert.assertEquals(actualText, "Category Wise Report");
			test.pass("Category Wise Report is redirecting to Sub Store Stock Report properly");
			
		}
		catch(Exception e)
		{
			test.fail("Failed"+e.getMessage());
			throw e;
		}
	}
	
	@Test(priority = 4)
	public void verifyTheStockAllotmentReport()
	{
		ExtentTest test= ExtentTestListener.getTest();
		SidePages sidepages=new SidePages(driver);
		stocksPage sp= new stocksPage(driver);
		try
		{
			test.info("Checking the Stock Allotment Report");
			sidepages.openStockAllotmentReport();
			String actualText=sp.getHeading();
			Assert.assertEquals(actualText, "Stock Allotment Report");
			test.pass("Sub Store Stock Report is redirecting to Sub Store Stock Report properly");
			
		}
		catch(Exception e)
		{
			test.fail("Failed"+e.getMessage());
			throw e;
		}
	}
	
	
	

}
