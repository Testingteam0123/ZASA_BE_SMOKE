package productManagementTests;

import org.testng.annotations.Test;
import org.testng.Assert;

import org.testng.annotations.Listeners;

import com.aventstack.extentreports.ExtentTest;
import com.github.javafaker.Faker;

import baseTest.BaseTest;
import commonObjects.SidePages;
import productManagementObjects.ColorSettings;
import utilities.ExtentTestListener;

@Listeners(ExtentTestListener.class)
public class ColorSettingsTest extends BaseTest {

	
	
	
	Faker f= new Faker();
    String color="#" + f.color().name();
    String color2="#" + f.color().name();
    String code=f.color().hex();

	@Test(priority = 1)
	public void verifyAddColorfunctionality() {

		ExtentTest test = ExtentTestListener.getTest();
		SidePages sp= new SidePages(driver);
		ColorSettings cs = new ColorSettings(driver);
		
		try {
		test.info("Opening the Product Settings page");
		sp.openProductSettingspage();
		test.info("Adding the color details");
		cs.enterColorName(color, code);
		
		String expectedmessage=cs.getColorAddedMessage();
		Assert.assertEquals(expectedmessage, "Color added successfully.");
		test.pass("Color added successfully.");
		
		
		}
		catch(Exception e)
		{
			Assert.fail("Failed: " + e.getMessage());
			throw e;
		}

	}

	@Test(priority = 2)
	public void verifyEditColor() {
		ExtentTest test = ExtentTestListener.getTest();
		SidePages sp= new SidePages(driver);
		ColorSettings cs = new ColorSettings(driver);
		
		try {
			
		test.info("Opening the Product Settings page");
		sp.openProductSettingspage();

		test.info("Editing the color details");
		cs.editColoring(color2, code);
		cs.changeStatus();
		String expectedmessage=cs.getColorUpdatedMessage();
		Assert.assertEquals(expectedmessage, "Color updated successfully.");
		test.pass("Color updated successfully.");
		
		}
		catch(Exception e)
		{
			Assert.fail("Failed"+e.getMessage());
			throw e;
		}

	}
	
	
	@Test(priority = 3)
	public void verifyStatusChangeFunction() {
		ExtentTest test = ExtentTestListener.getTest();
		SidePages sp= new SidePages(driver);
		ColorSettings cs = new ColorSettings(driver);
		
		try {
			
		test.info("Opening the Product Settings page");
		sp.openProductSettingspage();

		test.info("Checking the Status function");
		cs.changeStatus();
		String expectedmessage=cs.getColorStatusUpdatedMessage();
		Assert.assertEquals(expectedmessage, "Colour status updated successfully.");
		test.pass("Colour status updated successfully.");
		
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
		ColorSettings cs = new ColorSettings(driver);
		
		try {
			
		test.info("Opening the Product Settings page");
		sp.openProductSettingspage();

		test.info("Check the search box function");
		cs.checkSearchBox(color2);
		test.pass("Search box function working successfully.");
		
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
		ColorSettings cs = new ColorSettings(driver);
		try
		{
		test.info("Opening the Product Settings page");
		sp.openProductSettingspage();
		test.info("Deleting the color detail");
		cs.deleteColoring();
		String expectedmeessage=cs.getColorDeletedMessage();
		Assert.assertEquals(expectedmeessage, "Colour deleted successfully.");
		test.pass("Colour deleted successfully.");
		}
		catch(Exception e)
		{
			Assert.fail("Failed"+e.getMessage());
			throw e;
		}
	}
	
	
	

}
