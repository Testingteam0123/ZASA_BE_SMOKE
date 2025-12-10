package orderManagementTests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import baseTest.BaseTest;
import commonObjects.SidePages;
import orderManagementObjects.CustomerPage;
import utilities.ExtentTestListener;

@Listeners(ExtentTestListener.class)
public class CustomerTest extends BaseTest{
	
	//@Test
	public void checkTheSearchFunctionality()
	{
		ExtentTest test = ExtentTestListener.getTest();
		SidePages sp = new SidePages(driver);
		CustomerPage cp= new CustomerPage(driver);
		try
		{
			test.info("Navigating to the customer page");
			sp.openCustomerPage();
			test.info("Checking the serach functionality of the customer page");
			cp.enterName(p.getProperty("customer"));
			test.pass("Search functionality is working fine");
		}
		catch(Exception e)
		{
			test.fail("Failed"+e.getMessage());
			throw e;
		}
	}
	
	@Test
	public void verifyTheSearchCustomerFunction()
	{
		ExtentTest test = ExtentTestListener.getTest();
		SidePages sp = new SidePages(driver);
		CustomerPage cp= new CustomerPage(driver);
		try
		{
			test.info("Navigating to the customer page");
			sp.openCustomerPage();
			test.info("Checking the search customer function");
			cp.enterCusomerDetails(p.getProperty("admissionNO"));
			String actualmessage=cp.getSearchMessage();
			Assert.assertEquals(actualmessage, "Found 1 student(s)");
			test.pass("Search customer function working successfully");
		}
		catch(Exception e)
		{
			test.fail("Failed"+e.getMessage());
			throw e;
		}
	}

}
