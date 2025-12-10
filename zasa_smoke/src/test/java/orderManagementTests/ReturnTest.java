package orderManagementTests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import baseTest.BaseTest;
import commonObjects.SidePages;
import orderManagementObjects.ReturnPage;
import utilities.ExtentTestListener;


@Listeners(ExtentTestListener.class)
public class ReturnTest extends BaseTest{
	
	@Test
	public void verifyBulkSearchInReturn()
	{
		ExtentTest test=ExtentTestListener.getTest();
		SidePages sp=new SidePages(driver);
		ReturnPage rp= new ReturnPage(driver);
		try
		{
			test.info("Navigating to the return page");
			sp.openReturnPage();
			test.info("Checking the bulk search function in return page");
			rp.clickBulkSearch();
			rp.enterReturnIDTextArea(p.getProperty("returnID"));
			rp.clickSearch();
			String actualMessage=rp.getBulkSearchMessage();
			Assert.assertEquals(actualMessage, "Search completed for 1 item(s)");
			test.pass("Entered the OrderID's successfully in the bulk search");
		}
		catch(Exception e)
		{
			test.fail("Failed"+e.getMessage());
			throw e;
		}
	}
	
	@Test
	public void verifyTheReturnDetail()
	{
		ExtentTest test=ExtentTestListener.getTest();
		SidePages sp=new SidePages(driver);
		ReturnPage rp= new ReturnPage(driver);
		try
		{
			test.info("Navigating to the return page");
			sp.openReturnPage();
			test.info("Verifying that we can check the return detail");
			rp.clickReturnDetailView();
			String url=driver.getCurrentUrl();
			Assert.assertTrue(url.contains("returndetails"), "Return order page is not opened. URL="+url);
			test.pass("Navigated to the Return Orders page");
		}
		catch(Exception e)
		{
			test.fail("Failed"+e.getMessage());
			throw e;
		}
	}
	

}
