package orderManagementTests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import baseTest.BaseTest;
import commonObjects.SidePages;
import utilities.ExtentTestListener;

@Listeners(ExtentTestListener.class)
public class ScanToPackTest extends BaseTest{
	
	@Test
	public void openScanToPack()
	{
		 ExtentTest test = ExtentTestListener.getTest();
			SidePages sp= new SidePages(driver);
			try 
			{
				test.info("Navigating to the scan to pack page");
				sp.openScanToPack();
				String url=driver.getCurrentUrl();
				Assert.assertTrue(url.contains("productScanner"), 
						"Scan to pack page did not open. URL: " + url);
					test.pass("Scan to pack page opened successfully");
			}
			catch(Exception e)
			{
				test.fail("Failed"+e.getMessage());
				throw e;
			}
	}

}
