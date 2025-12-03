package orderManagementTest;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import baseTest.BaseTest;
import commonObjects.SidePages;
import orderManagementObjects.OrderStatusScannerPage;
import utilities.ExtentTestListener;

@Listeners(ExtentTestListener.class)
public class OrderStatusScannerTest extends BaseTest{
	
	@Test
	public void verifyOrderStatusScannerPage()
	{
		  ExtentTest test = ExtentTestListener.getTest();
			SidePages sp= new SidePages(driver);
			OrderStatusScannerPage os=new OrderStatusScannerPage(driver);
			try 
			{
				test.info("Navigating to the Order status scanner page");
				sp.openOrderScannerPage();
				String url=driver.getCurrentUrl();
				Assert.assertTrue(url.contains("orderstatusscanner"), 
						"Order status scanner page did not open. URL: " + url);
					test.pass("Order status scanner page opened successfully");
			}
			catch(Exception e)
			{
				test.fail("Failed"+e.getMessage());
				throw e;
			}
	}

}
