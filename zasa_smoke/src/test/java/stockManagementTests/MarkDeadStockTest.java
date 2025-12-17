package stockManagementTests;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import baseTest.BaseTest;
import commonObjects.SidePages;
import stockManagementObjects.MarkDeadStockPage;
import stockManagementObjects.StockPage;
import utilities.ExtentTestListener;

@Listeners(ExtentTestListener.class)
public class MarkDeadStockTest extends BaseTest{
	
	@Test(priority = 1)
	public void verifyMarkDeadStock()
	{
		ExtentTest test = ExtentTestListener.getTest();
		SidePages sidePages = new SidePages(driver);
		MarkDeadStockPage mp= new MarkDeadStockPage(driver);
		try
		{
		  test.info("Opening to the stock management module");
		  sidePages.openMarkDeadStock();
		  assertTrue(mp.isMarkDeadTableDisplayed(), "Mark Dead Stock is NOT displayed!");
			System.out.println("Mark Dead Stock is displayed");
			test.pass("Mark Dead Stock is displayed");
		  
		}
		catch(Exception e)
		{
		  test.fail("Failed"+e.getMessage());
		  throw e;
		}
		
	}
	
	@Test(priority = 4)
	public void verifyAddMarkDeadFunctionality()
	{
		ExtentTest test = ExtentTestListener.getTest();
		SidePages sidePages = new SidePages(driver);
		MarkDeadStockPage mp= new MarkDeadStockPage(driver);
		try {
			 test.info("Opening to the stock management module");
			//sidePages.openMarkDeadStock();
			 test.info("Adding the Mark Dead Count");
			 mp.addMarkDead("8");
			 String expectedMesssage=mp.getStockMarkedMessage();
			 Assert.assertEquals(expectedMesssage, "Dead stock marked successfully!");
			 test.pass("Dead stock marked successfully!");
			
		}
		catch(Exception e)
		{
			test.fail("Failed"+e.getMessage());
			throw e;
		}
	}
	
	
	@Test(priority = 5)
	public void verifyStockSummaryHistory()
	{
		ExtentTest test = ExtentTestListener.getTest();
		SidePages sidePages = new SidePages(driver);
		MarkDeadStockPage mp= new MarkDeadStockPage(driver);
		try
		{
			 test.info("Opening to the stock management module");
			//sidePages.openMarkDeadStock();
			 test.info("Verifying the Stock summary history");
			 mp.viewStockHistory();
			 test.pass("Stock summary history displayed successfully");
		}
		catch(Exception e)
		{
			test.fail("Stock summary history displayed successfully");
			throw e;
		}
		
	}
	
	@Test(priority = 2)
	public void verifyFilterFunctionality()
	{
		ExtentTest test = ExtentTestListener.getTest();
		SidePages sidePages = new SidePages(driver);
		MarkDeadStockPage mp= new MarkDeadStockPage(driver);
		try
		{
			 test.info("Opening to the stock management module");
			//sidePages.openMarkDeadStock();
			test.info("Checking the filter function");
			mp.selectBook();
			test.pass("Filter has been selected successfully.");
		}
		catch(Exception e)
		{
			test.fail("Failed"+e.getMessage());
			throw e;
		}
		
	}
	
	
	@Test(priority = 3)
	public void verifyTheProductInTable() throws Exception
	{
		ExtentTest test = ExtentTestListener.getTest();
		SidePages sidePages = new SidePages(driver);
		MarkDeadStockPage mp= new MarkDeadStockPage(driver);
		try
		{
			 test.info("Opening to the stock management module");
			//sidePages.openMarkDeadStock();
			test.info("Checking the Search Box functionality");
			mp.enterSearch(p.getProperty("productName"));
			test.pass("Search box function is working successfully");
			
		}
		catch(Exception e)
		{
			test.fail("Failed"+e.getMessage());
			throw e;
		}
	}

}
