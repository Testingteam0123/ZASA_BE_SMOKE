package settingsTests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import baseTest.BaseTest;
import commonObjects.SidePages;
import utilities.ExtentTestListener;

@Listeners(ExtentTestListener.class)
public class DeliveryPartnerTest extends BaseTest{
	
	@Test
	public void openDeliveryPartnerPage()
	{
		ExtentTest test= ExtentTestListener.getTest();
		SidePages sp= new SidePages(driver);
		try
		{
		  test.info("Navigating the Delivery partner page");
		  sp.openDeliveryPartnerPage();
		  String url=driver.getCurrentUrl();
		  Assert.assertTrue(url.contains("deliverypartner"), 
					"Delivery partner page did not open. URL: " + url);
		  test.pass("Delivery partner page opened successfully");
		}
		catch(Exception e)
		{
			test.fail("Failed"+e.getMessage());
		}
	}
}
