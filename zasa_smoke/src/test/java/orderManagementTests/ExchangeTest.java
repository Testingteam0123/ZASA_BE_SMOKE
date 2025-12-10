package orderManagementTests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import baseTest.BaseTest;
import commonObjects.SidePages;
import orderManagementObjects.ExchangePage;
import utilities.ExtentTestListener;

@Listeners(ExtentTestListener.class)
public class ExchangeTest extends BaseTest {

	@Test
	public void verifyBulkSearchInExchange() {
		ExtentTest test = ExtentTestListener.getTest();
		SidePages sp = new SidePages(driver);
		ExchangePage ep= new ExchangePage(driver);
		try {
			test.info("Opening the exchange module");
			sp.openExchangePage();
			test.info("Checking the bulk select functionality");
			ep.clickBulkSearch();
			ep.enterExchangeIDTextArea(p.getProperty("exchangeID"));
			ep.clickSearch();
			String actualMessage=ep.getBulkSearchMessage();
			Assert.assertEquals(actualMessage, "Search completed for 1 item(s)");
			test.pass("Entered the ExchangeID's successfully in the bulk search");
		}
		catch(Exception e)
		{
		   test.fail("Failed"+e.getMessage());
		   throw e;
		}
		
	}
	@Test(priority = 2)
	public void checkTheExchangeDetailPage()
	{
		ExtentTest test = ExtentTestListener.getTest();
		SidePages sp = new SidePages(driver);
		ExchangePage ep= new ExchangePage(driver);
		try {
			test.info("Navigating to the Exchange page");
			sp.openExchangePage();
			test.info("Check the exchange detail page");
			ep.clickExchangeDetailView();
			String url=driver.getCurrentUrl();
			Assert.assertTrue(url.contains("exchangedetails"), "Exchange order page is not opened. URL="+url);
			test.pass("Navigated to the Exchange Orders page");
		}
		catch(Exception e)
		{
			test.fail("Failed"+e.getMessage());
			throw e;
		}
	}

}
