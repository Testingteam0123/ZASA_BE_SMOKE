package settingsTest;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import baseTest.BaseTest;
import commonObjects.SidePages;
import utilities.ExtentTestListener;

@Listeners(ExtentTestListener.class)
public class EmailSettingsTest extends BaseTest{
	
	
	@Test
	public void openEmailSettingsPage()
	{
		ExtentTest test= ExtentTestListener.getTest();
		SidePages sp= new SidePages(driver);
		try
		{
		  test.info("Navigating the Email setiings page");
		  sp.openEmailSettingsPage();
		  String url=driver.getCurrentUrl();
		  Assert.assertTrue(url.contains("emailsettings"), 
					"Email settings page did not open. URL: " + url);
		  test.pass("Email settings page opened successfully");
		}
		catch(Exception e)
		{
			test.fail("Failed"+e.getMessage());
		}
	}

}
