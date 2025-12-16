package productManagementTests;

import org.testng.annotations.Test;
import org.testng.Assert;

import org.testng.annotations.Listeners;

import com.aventstack.extentreports.ExtentTest;
import com.github.javafaker.Faker;

import baseTest.BaseTest;
import commonObjects.SidePages;
import productManagementObjects.EditionSettings;
import utilities.ExtentTestListener;


@Listeners(ExtentTestListener.class)
public class EditionSettingsTest extends BaseTest{
	
	Faker f= new Faker();
	int editionYear=f.number().numberBetween(1990, 2025);
	int editionYear2=f.number().numberBetween(1980,1989);
	  String year=String.valueOf(editionYear);
	  String year1=String.valueOf(editionYear2);
	  
	
	
	@Test(priority = 1)
	public void verifyAddEditionfunctionality()
	{
		ExtentTest test = ExtentTestListener.getTest();
		SidePages sp= new SidePages(driver);
		EditionSettings es= new EditionSettings(driver);
	     
		try {
			test.info("Opening the Product Settings page");
		sp.openProductSettingspage();
		test.info("Adding the Edition year");	
		es.createEdition(year);
		
		String expectedMessage=es.getEditionAddedMessage();
		Assert.assertEquals(expectedMessage, "Edition added successfully.");
		test.pass("Edition year added successfully.");
		}
		catch(Exception e)
		{
			Assert.fail("Failed: " + e.getMessage());
	    	throw e;
		}
	}
	
	@Test(priority = 2)
	public void verifyEditEditionfunctionality()
	{
		ExtentTest test = ExtentTestListener.getTest();
		SidePages sp= new SidePages(driver);
		EditionSettings es= new EditionSettings(driver);
		
		try {
			
			test.info("Opening the Product Settings page");
	       sp.openProductSettingspage();
	       
	       test.info("Editing the Edition year");
			
		es.editEdition(year1);
		String expectedMessage=es.getEditionUpdatedMessage();
		Assert.assertEquals(expectedMessage, "Edition updated successfully.");
		test.pass("Edition year updated successfully.");
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
		EditionSettings es= new EditionSettings(driver);
		
		try {
			
		test.info("Opening the Product Settings page");
		sp.openProductSettingspage();

		test.info("Checking the Status function");
		es.changeStatus();
		String expectedmessage=es.getEditionStatusUpdatedMessage();
		Assert.assertEquals(expectedmessage, "Edition status updated successfully.");
		test.pass("Edition status updated successfully.");
		
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
		EditionSettings es= new EditionSettings(driver);
		
		try {
			
		test.info("Opening the Product Settings page");
		sp.openProductSettingspage();

		test.info("Check the search box function");
		es.checkSearchBox(year1);
		test.pass("Search box function working successfully.");
		
		}
		catch(Exception e)
		{
			Assert.fail("Failed"+e.getMessage());
			throw e;
		}

	}
	
	
	
	
	@Test(priority = 5)
	public void verifyDeleteEditionfunctionality()
	{
		ExtentTest test = ExtentTestListener.getTest();
		SidePages sp= new SidePages(driver);
		EditionSettings es= new EditionSettings(driver);
		
		try
		{
			test.info("Opening the Product Settings page");
	     sp.openProductSettingspage();
	     test.info("Deleting the Edition year");
		es.deleteEdition();
		
		String expectedMessage=es.getEditionDeletedMessage();
		Assert.assertEquals(expectedMessage, "Edition deleted successfully.");
		test.pass("Edition year deleted successfully.");
		}
		catch(Exception e)
		{
			Assert.fail("Failed: " + e.getMessage());
	    	throw e;
		}
		
	}

}
