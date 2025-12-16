 package userManagementTests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.github.javafaker.Faker;

import baseTest.BaseTest;
import commonObjects.SidePages;
import userManagementObjects.RolePage;
import utilities.ExtentTestListener;


@Listeners(ExtentTestListener.class)
public class RoleTest extends BaseTest{
	
	Faker f= new Faker();
	String name=f.name().firstName();
	String editedName=f.name().firstName();
	
	@Test(priority = 1)
	public void verifyAddRoleFunction()
	{
		ExtentTest test=  ExtentTestListener.getTest();
		SidePages sp= new SidePages(driver);
		RolePage up= new RolePage(driver);
		try {
			
			test.info("Navigating to the User management module");
			sp.openUserManagement();
			test.info("Checking the add user role function");
			up.clickRole();
			up.addUserRole();
			up.addRoleName(name);
			up.clickCheckBox();
			up.clickSave();
			
			String actualMessage=up.getRoleCreatedMessage();
			Assert.assertEquals(actualMessage, "Role added successfully.");
			test.pass("Role added successfully");
			
		}
		catch(Exception e)
		{
			test.fail("Failed"+e.getMessage());
			throw e;
		}
		
	}
	
	
	@Test(priority = 2)
	public void checkSearchBoxFunctionality()
	{
		ExtentTest test=  ExtentTestListener.getTest();
		SidePages sp= new SidePages(driver);
		RolePage up= new RolePage(driver);
		try {
			test.info("Navigating to the User management module");
			sp.openUserManagement();
			test.info("Checking the search box funtion in add user role");
			up.searchBoxFunction(name);
			
		}
		catch(Exception e)
		{
			test.fail("Failed"+e.getMessage());
			throw e;
		}
	}
	
	
	
	@Test(priority = 3)
	public void verifyEditRolefunction()
    {
		ExtentTest test=  ExtentTestListener.getTest();
		SidePages sp= new SidePages(driver);
		RolePage up= new RolePage(driver);
		try {
			test.info("Navigating to the User management module");
			sp.openUserManagement();
			test.info("Checking the edit funtion in add user role");
			//up.clickRole();
			up.clickEditfunction();
			up.enterEditName(editedName);
			up.editUpdate();
			String actualMessage=up.getRoleUpdatedMessage();
			Assert.assertEquals(actualMessage, "Role updated successfully.");
			test.pass("Role edit function working successfully.");
			
		}
		catch(Exception e)
		{
			test.fail("Failed"+e.getMessage());
			throw e;
		}
			
	}
	
	@Test(priority = 4)
	public void verifyRoleDeleteFunction()
	{
		ExtentTest test=  ExtentTestListener.getTest();
		SidePages sp= new SidePages(driver);
		RolePage up= new RolePage(driver);
		try {
			test.info("Navigating to the User management module");
			sp.openUserManagement();
			test.info("Checking the delete funtion in add user role");
			//up.clickRole();
			up.searchBoxFunction(editedName);
			up.clickDelete();
			up.confirmDelete();
			String actualMessage=up.getRoleDeletedMessage();
			Assert.assertEquals(actualMessage, "Role deleted successfully.");
			test.pass("Role delete function working successfully.");
			
		}
		catch(Exception e)
		{
			test.fail("Failed"+e.getMessage());
			throw e;
		}
	}
	


}
