package productManagementTests;


import org.testng.annotations.Test;

import org.testng.Assert;
import org.testng.annotations.Listeners;

import com.aventstack.extentreports.ExtentTest;
import com.github.javafaker.Faker;

import baseTest.BaseTest;
import commonObjects.SidePages;
import productManagementObjects.StockCategory;
import utilities.ExtentTestListener;

@Listeners(ExtentTestListener.class)
public class StockCategoryTest extends BaseTest{
	
	
	Faker f= new Faker();
	String name=f.funnyName().name();
	String name1=f.funnyName().name();
	String address=f.funnyName().name();
	
	
	@Test(priority = 1)
	public void verifyAddStockfunctionality()
	{
		
		ExtentTest test = ExtentTestListener.getTest();
		SidePages sp= new SidePages(driver);
		StockCategory sc= new StockCategory(driver);
		
		try
		{
			test.info("Opening the Product Settings page");
	       sp.openProductSettingspage();
			
	       test.info("Adding the stock category");
		sc.addStockCategory(name, address);
		String expectedMessage=sc.getStockAddedMessage();
		Assert.assertEquals(expectedMessage, "Stock Category added successfully.");
		test.pass("Stock Category added successfully.");
		}
		catch(Exception e)
		{
			Assert.fail("Failed: " + e.getMessage());
	        throw e;  
		}
	}
	
	@Test(priority = 3)
	public void verifyStockEditfunctionality()
	{
		
		ExtentTest test = ExtentTestListener.getTest();
		SidePages sp= new SidePages(driver);
		StockCategory sc= new StockCategory(driver);
		
		try
		{
			test.info("Opening the Product Settings page");
	       sp.openProductSettingspage();
			
	       test.info("Editing the stock category");
		sc.editStockCategory(name1);
		String expectedMessage=sc.getstockCategoryUpdatedMessage();
		Assert.assertEquals(expectedMessage, "Stock Category updated successfully.");
		test.pass("Stock Category updated successfully.");
		}
		catch(Exception e)
		{
			Assert.fail("Failed: " + e.getMessage());
	        throw e;  
		}
	}
	
	@Test(priority = 2)
	public void verifySearchFunction() {
		ExtentTest test = ExtentTestListener.getTest();
		SidePages sp= new SidePages(driver);
		StockCategory sc= new StockCategory(driver);
		
		try {
			
		test.info("Opening the Product Settings page");
		sp.openProductSettingspage();

		test.info("Check the search box function");
		sc.checkSearchBox(name);
		test.pass("Search box function working successfully.");
		
		}
		catch(Exception e)
		{
			Assert.fail("Failed"+e.getMessage());
			throw e;
		}

	}
	
	@Test(priority = 4)
	public void verifyStatusChangeFunction() {
		ExtentTest test = ExtentTestListener.getTest();
		SidePages sp= new SidePages(driver);
		StockCategory sc= new StockCategory(driver);
		
		try {
			
		test.info("Opening the Product Settings page");
		sp.openProductSettingspage();

		test.info("Checking the Status function");
		sc.checkSearchBox(name1);
		sc.changeStatus();	
		String expectedmessage=sc.getStockCategoryStatusUpdatedMessage();
		Assert.assertEquals(expectedmessage, "Stock Category status updated successfully.");
		test.pass("Stock Category status updated successfully.'");
		
		}
		catch(Exception e)
		{
			Assert.fail("Failed"+e.getMessage());
			throw e;
		}

	}
	
	@Test(priority = 5)
	public void verifyDeleteColor() {
		ExtentTest test = ExtentTestListener.getTest();
		SidePages sp= new SidePages(driver);
		StockCategory sc= new StockCategory(driver);
		try
		{
		test.info("Opening the Product Settings page");
		sp.openProductSettingspage();
		test.info("Deleting the color detail");
		sc.deleteStockCategory();
		String expectedmeessage=sc.getStockCategoryDeletedMessage();
		Assert.assertEquals(expectedmeessage, "Stock Category deleted successfully.");
		test.pass("Stock Category deleted successfully.");
		}
		catch(Exception e)
		{
			Assert.fail("Failed"+e.getMessage());
			throw e;
		}
	}
	

}
