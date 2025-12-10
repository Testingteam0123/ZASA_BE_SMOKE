package settingsTests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import baseTest.BaseTest;
import commonObjects.SidePages;
import settingsObjects.RateManagementPage;
import utilities.ExtentTestListener;

@Listeners(ExtentTestListener.class)
public class RateManagementTest extends BaseTest{
	
	@Test(priority = 1)
	public void verifyEnterNewRateFunctionality()
	{
		ExtentTest test= ExtentTestListener.getTest();
		SidePages sp= new SidePages(driver);
		RateManagementPage rp= new RateManagementPage(driver);
		try {
			test.info("Navigatig to the Rate management page");
			sp.openRateManagementPage();
			test.info("Checking the enter new rate function");
			rp.enterNewRate("9");
			String actualMessage=rp.getSavedSuccessMessage();
			Assert.assertEquals(actualMessage, "Product rates updated successfully.");
			test.pass("Product rates updated successfully.");
		}
		catch(Exception e)
		{
			test.fail("Failed"+e.getMessage());
			throw e;
		}
		
	}
	
	@Test(priority = 2)
	public void verifyTheProductInTable() throws Exception
	{
		ExtentTest test= ExtentTestListener.getTest();
		SidePages sp= new SidePages(driver);
		RateManagementPage rp= new RateManagementPage(driver);
		try
		{
			test.info("Navigating to the Rate management page");
			sp.openRateManagementPage();
			test.info("Check the table contains the required product");
			rp.enterSearch(p.getProperty("productName"));
			boolean isProductVisible = rp.checkProduct(p.getProperty("productName"));
			Assert.assertTrue(isProductVisible,"Book category was not found in the table!");
			test.pass("product found out in table successfully");
			
		}
		catch(Exception e)
		{
			test.fail("Failed"+e.getMessage());
			throw e;
		}
	}
	

}
