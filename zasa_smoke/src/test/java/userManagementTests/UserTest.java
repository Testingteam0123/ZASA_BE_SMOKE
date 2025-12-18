package userManagementTests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.github.javafaker.Faker;

import baseTest.BaseTest;
import commonObjects.SidePages;
import userManagementObjects.UserPage;
import utilities.ExtentTestListener;

@Listeners(ExtentTestListener.class)
public class UserTest extends BaseTest{

	Faker f= new Faker();
	String name=f.name().firstName();
	String email=f.internet().emailAddress();
	
	@Test(priority = 1)
	public void verifyTheAddUserManagementFunction()
	{
		
		ExtentTest test= ExtentTestListener.getTest();
		SidePages sp= new SidePages(driver);
		UserPage up= new UserPage(driver);
		try
		{
			test.info("Opening the User Management module");
			sp.openUserManagement();
			test.info("Checking the Add user Management function");
			up.clickUser();
			up.clickAddUser();
			up.entertextName(name);
			up.entertextEmail(email);
			up.selectUserRoleOptions(p.getProperty("userRole"));
			up.selectInstitutionOptions(p.getProperty("Institution"));
			up.clickSave();
			
			String actualMessage=up.getUserAddedMessage();
			Assert.assertEquals(actualMessage, "User Added Successfully.");
			test.pass("Add User function working Successfully");
			
			
		}
		catch(Exception e)
		{
			test.fail("Failed"+e.getMessage());
			throw e;
		}
		
	}
	
	@Test(priority = 2)
	public void verifyFilterFunction()
	{
		ExtentTest test= ExtentTestListener.getTest();
		SidePages sp= new SidePages(driver);
		UserPage up= new UserPage(driver);
		try
		{
			test.info("Opening the User Management module");
			sp.openUserManagement();
			test.info("Checking the Filter function to select a school");
			up.selectSchool();
			test.pass("Selected a school from the filter option is working Successfully");
			
			
		}
		catch(Exception e)
		{
			test.fail("Failed"+e.getMessage());
			throw e;
		}
	}
	
	
	@Test(priority = 3)
	public void verifySearchBoxFuntion()
	{
		ExtentTest test= ExtentTestListener.getTest();
		SidePages sp= new SidePages(driver);
		UserPage up= new UserPage(driver);
		try
		{
			test.info("Opening the User Management module");
			sp.openUserManagement();
			test.info("Checking the Search box function");
			up.searchUser(name);
			test.pass("Search function is working Successfully");
			
			
		}
		catch(Exception e)
		{
			test.fail("Failed"+e.getMessage());
			throw e;
		}
	}
	
	
	@Test(priority = 4)
	public void verifyEditFuntion()
	{
		ExtentTest test= ExtentTestListener.getTest();
		SidePages sp= new SidePages(driver);
		UserPage up= new UserPage(driver);
		try
		{
			test.info("Opening the User Management module");
			sp.openUserManagement();
			test.info("Checking the Edit user Management function");
			up.editUser(name);
			
			String actualMessage=up.getUpdatedMessage();
			Assert.assertEquals(actualMessage, "User updated successfully.");
			test.pass("User edit function working Successfully");
			
			
		}
		catch(Exception e)
		{
			test.fail("Failed"+e.getMessage());
			throw e;
		}
	}
	
	@Test(priority = 5)
	public void verifyDeleteFunction()
	{
		ExtentTest test= ExtentTestListener.getTest();
		SidePages sp= new SidePages(driver);
		UserPage up= new UserPage(driver);
		try
		{
			test.info("Opening the User Management module");
			sp.openUserManagement();
			test.info("Checking the Delete user Management function");
			up.deleteUser();
			
			String actualMessage=up.getDeletedMessage();
			Assert.assertEquals(actualMessage, "User deleted successfully.");
			test.pass("User delete function working Successfully");
			
			
		}
		catch(Exception e)
		{
			test.fail("Failed"+e.getMessage());
			throw e;
		}
	}
	
	
}
