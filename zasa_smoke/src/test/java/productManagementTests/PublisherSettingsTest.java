package productManagementTests;

import org.testng.annotations.Test;

import org.testng.Assert;
import org.testng.annotations.Listeners;

import com.aventstack.extentreports.ExtentTest;
import com.github.javafaker.Faker;

import baseTest.BaseTest;
import commonObjects.SidePages;
import productManagementObjects.ColorSettings;
import productManagementObjects.PublisherSettings;
import utilities.ExtentTestListener;

@Listeners(ExtentTestListener.class)
public class PublisherSettingsTest extends BaseTest{
	
	
	Faker f= new Faker();
	String name=f.name().lastName();
	String name1=f.name().lastName();
	
	@Test(priority = 1)
	public void verifyAddPublisherfunctionality()
	{
		ExtentTest test = ExtentTestListener.getTest();
		SidePages sp= new SidePages(driver);
		PublisherSettings ps= new PublisherSettings(driver);
		try {
		test.info("Opening the Product Settings page");
		sp.openProductSettingspage();
		test.info("Adding the publisher");
		ps.createPublisher(name);
		
		String expectedMessage=ps.getpublisherAddedMessage();
		Assert.assertEquals(expectedMessage, "Publisher added successfully.");
		
		test.pass("Publisher added successfully");
		}
		catch(Exception e)
		{
			Assert.fail("Failed: " + e.getMessage());
			throw e;
		}
	}
	
	@Test(priority =2)
	public void verifyEditPublisherfunctionality()
	{
		ExtentTest test = ExtentTestListener.getTest();
		SidePages sp= new SidePages(driver);
		PublisherSettings ps= new PublisherSettings(driver);
	    try {
	    	test.info("Opening the Product Settings page");
		sp.openProductSettingspage();
		test.info("Editing the publisher name");
		ps.editPublisher(name1);
	    
		
		String expectedMessage=ps.getPublisherUpdatedMessage();
		Assert.assertEquals(expectedMessage, "Publisher updated successfully.");
		test.pass("Publisher updated successfully");
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
		PublisherSettings ps= new PublisherSettings(driver);
		
		try {
			
		test.info("Opening the Product Settings page");
		sp.openProductSettingspage();

		test.info("Checking the Status function");
		ps.changeStatus();
		String expectedmessage=ps.getpublisherStatusUpdatedMessage();
		Assert.assertEquals(expectedmessage, "Publisher status updated successfully.");
		test.pass("Publisher status updated successfully.");
		
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
		PublisherSettings ps= new PublisherSettings(driver);
		
		try {
			
		test.info("Opening the Product Settings page");
		sp.openProductSettingspage();

		test.info("Check the search box function");
		ps.checkSearchBox(name1);
		test.pass("Search box function working successfully.");
		
		}
		catch(Exception e)
		{
			Assert.fail("Failed"+e.getMessage());
			throw e;
		}

	}
	
	
	@Test(priority =5)
	public void verifyDeletePublisherfunctionality()
	{
		ExtentTest test = ExtentTestListener.getTest();
		SidePages sp= new SidePages(driver);
		PublisherSettings ps= new PublisherSettings(driver);
		try {
			test.info("Opening the Product Settings page");
	    sp.openProductSettingspage();
	    test.info("Deleting the publisher name");
		
		ps.deletePublisher();
		String expectedMessage=ps.getPublisherDeletedMessage();
		Assert.assertEquals(expectedMessage, "Publisher deleted successfully.");
		test.pass("Publisher deleted successfully.");
		}
		catch(Exception e)
		{
			Assert.fail("Failed: " + e.getMessage());
	    	throw e;
		}
	}
	
	

}
