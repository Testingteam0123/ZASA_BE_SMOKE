package userManagementTests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.github.javafaker.Faker;

import baseTest.BaseTest;
import commonObjects.SidePages;
import userManagementObjects.InstitutionPage;
import utilities.ExtentTestListener;

@Listeners(ExtentTestListener.class)
public class InstitutionTest extends BaseTest{

	Faker f= new Faker();
    String name= f.name().firstName();
    String editedName=f.name().firstName();
    String code=f.code().asin();
	
	
	@Test
	public void verifyAddInstitution()
	{
		ExtentTest test=  ExtentTestListener.getTest();
		SidePages sp= new SidePages(driver);
		InstitutionPage ip= new InstitutionPage(driver);
		try {
			test.info("Navigating to the User management module");
			sp.openUserManagement();
			test.info("Checking the add institution function");
			ip.clickInstitution();
			ip.addInstitition();
			ip.enterInstitutionName(name);
			ip.enterInstitutionCode(code);
			ip.selectOption();
			//ip.uploadLogo(p.getProperty("uniformImage"));
			ip.clickSave();
			String actualMessage=ip.getinstitutionAddedMessage();
			Assert.assertEquals(actualMessage, "Institution added successfully.");
			test.pass("Institution added successfully.");
			
		}
		catch(Exception e)
		{
			test.fail("Failed"+e.getMessage());
			throw e;
		}
	}
	
	
	@Test(priority = 2)
	public void verifySearchBoxFunctionality()
	{
		ExtentTest test=  ExtentTestListener.getTest();
		SidePages sp= new SidePages(driver);
		InstitutionPage ip= new InstitutionPage(driver);
		try {
			test.info("Navigating to the User management module");
			sp.openUserManagement();
			test.info("Checking the search box funtion in institution");
			ip.institutionSearchBox(name);
			
		}
		catch(Exception e)
		{
			test.fail("Failed"+e.getMessage());
			throw e;
		}
	}
	
	
	
	@Test(priority = 3)
	public void verifyEditInstitudefunction()
    {
		ExtentTest test=  ExtentTestListener.getTest();
		SidePages sp= new SidePages(driver);
		InstitutionPage ip= new InstitutionPage(driver);
		try {
			test.info("Navigating to the User management module");
			sp.openUserManagement();
			test.info("Checking the edit funtion in institution");
			ip.clickEditfunction();
			ip.enterEditName(editedName);
			ip.editUpdate();
			String actualMessage=ip.getInstitutionUpdatedMessage();
			Assert.assertEquals(actualMessage, "Institution updated successfully.");
			test.pass("Institution edit function working successfully.");
			
		}
		catch(Exception e)
		{
			test.fail("Failed"+e.getMessage());
			throw e;
		}
			
	}
	
	@Test(priority = 4)
	public void verifyInstitutionDeleteFunction()
	{
		ExtentTest test=  ExtentTestListener.getTest();
		SidePages sp= new SidePages(driver);
		InstitutionPage ip= new InstitutionPage(driver);
		try {
			test.info("Navigating to the User management module");
			sp.openUserManagement();
			test.info("Checking the delete funtion in Institution");
			//up.clickRole();
			ip.institutionSearchBox(editedName);
			ip.clickDelete();
			ip.confirmButton();
			String actualMessage=ip.getInstitutionDeletedMessage();
			Assert.assertEquals(actualMessage, "Institution deleted successfully.");
			test.pass("Institution delete function working successfully.");
			
		}
		catch(Exception e)
		{
			test.fail("Failed"+e.getMessage());
			throw e;
		}
	}
	
	
}
