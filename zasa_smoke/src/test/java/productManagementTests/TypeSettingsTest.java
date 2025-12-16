package productManagementTests;


import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;

import com.aventstack.extentreports.ExtentTest;
import com.github.javafaker.Faker;

import baseTest.BaseTest;
import commonObjects.SidePages;
import productManagementObjects.ColorSettings;
import productManagementObjects.SizeSettings;
import productManagementObjects.TypeSettings;
import utilities.ExtentTestListener;


@Listeners(ExtentTestListener.class)
public class TypeSettingsTest extends BaseTest{
 


	
	Faker f= new Faker();
	String typedata=f.commerce().department();
	String typedata2=f.commerce().department();
	

	@Test
	public void verifyAddTypefunctionality() {
		 
		ExtentTest test = ExtentTestListener.getTest();
		SidePages sp= new SidePages(driver);
		TypeSettings ts = new TypeSettings(driver);
		
		try
		{
			
		test.info("Opening the Product Settings page");
	       sp.openProductSettingspage();
	     
	       test.info("Adding the new type");
		ts.verifyAddNewType(typedata);	
		String expectedMessage=ts.getTypeAddedMessage();
		Assert.assertEquals(expectedMessage, "Type added successfully.");
		
		
		test.pass("Type added successfully");
		}
		catch(Exception e)
		{
			Assert.fail("Failed: " + e.getMessage());
	        throw e; 
		}
	}
	
	@Test(priority = 2)
	public void verifyEditTypefunctionality() {
		ExtentTest test = ExtentTestListener.getTest();
		SidePages sp= new SidePages(driver);
		TypeSettings ts = new TypeSettings(driver);
		
		try
		{
			test.info("Opening the Product Settings page");
        sp.openProductSettingspage();
			
        test.info("Editing the type");
		ts.verifyEditType(typedata2);
		
		String expectedMessage=ts.getTypeUpdatedMessage();
		Assert.assertEquals(expectedMessage, "Type updated successfully.");
		
		test.pass("Type edited successfully");
		}
		catch(Exception e)
		{
			Assert.fail("Failed: " + e.getMessage());
	        throw e; 
		}
		
	}
	
	@Test(priority = 3)
	public void verifyStatusChangeFunction() {
		ExtentTest test = ExtentTestListener.getTest();
		SidePages sp= new SidePages(driver);
		TypeSettings ts = new TypeSettings(driver);
		
		
		try {
			
		test.info("Opening the Product Settings page");
		sp.openProductSettingspage();

		test.info("Checking the Status function");
		ts.changeStatus();
		String expectedmessage=ts.getTypeStatusUpdatedMessage();
		Assert.assertEquals(expectedmessage, "Type status updated successfully.");
		test.pass("Type status updated successfully.");
		
		}
		catch(Exception e)
		{
			Assert.fail("Failed"+e.getMessage());
			throw e;
		}

	}
	
	
	 @Test(priority = 4)
		public void verifySearchFunction() {
			ExtentTest test = ExtentTestListener.getTest();
			SidePages sp= new SidePages(driver);
			TypeSettings ts = new TypeSettings(driver);
			
			try {
				
			test.info("Opening the Product Settings page");
			sp.openProductSettingspage();

			test.info("Check the search box function");
			ts.checkSearchBox(typedata2);
			test.pass("Search box function working successfully.");
			
			}
			catch(Exception e)
			{
				Assert.fail("Failed"+e.getMessage());
				throw e;
			}

		}
	
	
	
	@Test(priority = 5)
	public void verifyDeleteTypefunctionality() {
		
		ExtentTest test = ExtentTestListener.getTest();
		SidePages sp= new SidePages(driver);
		TypeSettings ts = new TypeSettings(driver);
		
		try
		{
			test.info("Opening the Product Settings page");
	    sp.openProductSettingspage();
			
	    test.info("Deleting the type");
		ts.verifyDeleteType();
		String expectedMessage=ts.getTypeDeletedMessage();
		Assert.assertEquals(expectedMessage, "Type deleted successfully.");
		test.pass("Type deleted successfully");
		}
		catch(Exception e)
		{
			Assert.fail("Failed: " + e.getMessage());
	        throw e; 
		}
	}
}
