package productManagementTests;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.Assert;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.github.javafaker.Faker;

import baseTest.BaseTest;
import commonObjects.SidePages;
import productManagementObjects.ColorSettings;
import productManagementObjects.SizeSettings;
import utilities.ExtentTestListener;

@Listeners(ExtentTestListener.class)
public class SizeSettingsTest extends BaseTest {

	
	Faker f= new Faker();
	int randomSize = f.number().numberBetween(28, 32);
	int randomSize2 = f.number().numberBetween(40, 50);
	String size = String.valueOf(randomSize);
	String size2 = String.valueOf(randomSize2);
	
	

	 @Test(priority = 1)
	public void verifyAddSizefunctionality() {

		ExtentTest test = ExtentTestListener.getTest();
		SidePages sp = new SidePages(driver);
		SizeSettings ss = new SizeSettings(driver);
		try {
			test.info("Opening the Product Settings page");
			sp.openProductSettingspage();
			test.info("Adding the size");
			ss.enterSize(size);
			String expectedMessage = ss.getSizeAddedMessage();
			Assert.assertEquals(expectedMessage, "Size added successfully.");
			test.pass("Size added Successfully.");
		} catch (Exception e) {
			Assert.fail("Failed: " + e.getMessage());
			throw e;
		}

	}

	 @Test(priority = 2)
	public void verifySizeEditFunctionality() {

		ExtentTest test = ExtentTestListener.getTest();
		SidePages sp = new SidePages(driver);
		SizeSettings ss = new SizeSettings(driver);
		
		try
		{
		test.info("Opening the Product Settings page");
		sp.openProductSettingspage();
		test.info("Editing the size");
		ss.editSize(size2);

		String expectedMessage = ss.getSizeUpdatedMessage();
		Assert.assertEquals(expectedMessage, "Size updated successfully.");
		test.pass("Size updated successfully");
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
			SizeSettings ss = new SizeSettings(driver);
			
			try {
				
			test.info("Opening the Product Settings page");
			sp.openProductSettingspage();

			test.info("Checking the Status function");
			ss.changeStatus();
			String expectedmessage=ss.getSizeStatusUpdatedMessage();
			Assert.assertEquals(expectedmessage, "Size status updated successfully.");
			test.pass("Size status updated successfully.");
			
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
			SizeSettings ss = new SizeSettings(driver);
			
			try {
				
			test.info("Opening the Product Settings page");
			sp.openProductSettingspage();

			test.info("Check the search box function");
			ss.checkSearchBox(size2);
			test.pass("Search box function working successfully.");
			
			}
			catch(Exception e)
			{
				Assert.fail("Failed"+e.getMessage());
				throw e;
			}

		}
	 
	@Test(priority = 5)
	public void verifySizeDeleteFunctionality() {

		ExtentTest test = ExtentTestListener.getTest();
		SidePages sp = new SidePages(driver);
		SizeSettings ss = new SizeSettings(driver);
 		
		try {
			test.info("Opening the Product Settings page");
		sp.openProductSettingspage();
		
		test.info("Deleting the size");

		ss.deleteSize();

		String expectedMessage = ss.getSizeDeletedMessage();
		Assert.assertEquals(expectedMessage, "Size deleted successfully.");
		test.pass("Size deleted successfully");
		}
		catch(Exception e)
		{
			Assert.fail("Failed: " + e.getMessage());
			throw e;
		}
	}

}
