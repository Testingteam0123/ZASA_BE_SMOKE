package settingsTests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import baseTest.BaseTest;
import commonObjects.SidePages;
import utilities.ExtentTestListener;

@Listeners(ExtentTestListener.class)
public class OrderSettingsTest extends BaseTest{

	
	
	@Test
	public void openOrderSettingsPage()
	{
		ExtentTest test= ExtentTestListener.getTest();
		SidePages sp= new SidePages(driver);
		try
		{
		  test.info("Navigating the order setiings page");
		  sp.openOrderSettingsPage();
		  String url=driver.getCurrentUrl();
		  Assert.assertTrue(url.contains("ordersettings"), 
					"Order settings page did not open. URL: " + url);
		  test.pass("Order settings page opened successfully");
		}
		catch(Exception e)
		{
			test.fail("Failed"+e.getMessage());
		}
	}

}
