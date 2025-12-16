package productManagementTests;

import org.testng.annotations.Test;
import org.testng.Assert;

import org.testng.annotations.Listeners;

import com.aventstack.extentreports.ExtentTest;
import com.github.javafaker.Faker;

import baseTest.BaseTest;
import commonObjects.SidePages;
import productManagementObjects.BrandSettings;
import productManagementObjects.ColorSettings;
import utilities.ExtentTestListener;

@Listeners(ExtentTestListener.class)
public class BrandSettingsTest extends BaseTest {

	Faker f = new Faker();
	String name=f.name().firstName();
	String name2=f.name().firstName();
	String email= f.internet().emailAddress();
	String code=f.number().digits(5);
	String fullname=f.name().fullName();
	String phoneno="9" + f.phoneNumber().subscriberNumber(8);
	
	@Test(priority = 1)
	public void verifyAddBrandfunctionality() {
		ExtentTest test = ExtentTestListener.getTest();
		SidePages sp = new SidePages(driver);
		BrandSettings bs = new BrandSettings(driver);
		try {
			test.info("Opening the Product Settings page");
			sp.openProductSettingspage();
			test.info("Check the Adding Brand function details");
			bs.enterBrand(name, email, code, fullname, phoneno);
			String expectedmessage = bs.getBrandAddedMessage();
			Assert.assertEquals(expectedmessage, "Brand added successfully.");
		} catch (Exception e) {
			Assert.fail("Failed" + e.getMessage());
			throw e;
		}
	}
	
	@Test(priority = 2)
	public void verifyTheEditFunctonality()
	{
		ExtentTest test = ExtentTestListener.getTest();
		SidePages sp = new SidePages(driver);
		BrandSettings bs = new BrandSettings(driver);
		try {
			test.info("Opening the Product Settings page");
			sp.openProductSettingspage();
			test.info("Check the edit Brand function");
			bs.editBrand(name2);
			String expectedmessage = bs.getbrandUpdatedMessage();
			Assert.assertEquals(expectedmessage, "Brand updated successfully.");
		} catch (Exception e) {
			Assert.fail("Failed" + e.getMessage());
			throw e;
		}
	}
	
	@Test(priority = 3)
	public void verifyStatusChangeFunction() {
		ExtentTest test = ExtentTestListener.getTest();
		SidePages sp= new SidePages(driver);
		BrandSettings bs = new BrandSettings(driver);
		
		try {
			
		test.info("Opening the Product Settings page");
		sp.openProductSettingspage();

		test.info("Checking the Status function");
		bs.changeStatus();
		String expectedmessage=bs.getBrandStatusUpdatedMessage();
		Assert.assertEquals(expectedmessage, "Brand status updated successfully.");
		test.pass("Brand status updated successfully.");
		
		}
		catch(Exception e)
		{
			Assert.fail("Failed"+e.getMessage());
			throw e;
		}

	}
	
	@Test(priority = 4)
	public void verifySearchBoxFunctonality()
	{
		ExtentTest test = ExtentTestListener.getTest();
		SidePages sp = new SidePages(driver);
		BrandSettings bs = new BrandSettings(driver);
		try {
			test.info("Opening the Product Settings page");
			sp.openProductSettingspage();
			test.info("Check the search box function");
			bs.checkSearchBox(name2);
		    test.pass("The search box is functioning properly");
		} catch (Exception e) {
			Assert.fail("Failed" + e.getMessage());
			throw e;
		}
	}
	
	
	
	@Test(priority = 5)
	public void verifyTheDeleteFunctonality()
	{
		ExtentTest test = ExtentTestListener.getTest();
		SidePages sp = new SidePages(driver);
		BrandSettings bs = new BrandSettings(driver);
		try {
			test.info("Opening the Product Settings page");
			sp.openProductSettingspage();
			test.info("Check the Delete Brand function");
			bs.deleteBrand();
			
			String expectedmessage = bs.getBrandDeletedMessage();
			Assert.assertEquals(expectedmessage, "Brand deleted successfully.");
			test.pass("Brand deleted successfully.");
		} catch (Exception e) {
			Assert.fail("Failed" + e.getMessage());
			throw e;
		}
	}
	
	
	
}
