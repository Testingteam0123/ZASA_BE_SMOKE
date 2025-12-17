package settingsTests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import baseTest.BaseTest;
import commonObjects.SidePages;
import settingsObjects.DiscountCouponPage;
import utilities.ExtentTestListener;


@Listeners(ExtentTestListener.class)
public class DiscountCouponTest extends BaseTest{
	
	
	
	@Test(priority = 1)
	public void verifyFilterFunctionality()
	{
		ExtentTest test= ExtentTestListener.getTest();
		SidePages sp= new SidePages(driver);
		DiscountCouponPage dp= new DiscountCouponPage(driver);
		try {
			test.info("Opening the Discount coupon page");
			sp.openDiscountCouponPage();
			test.info("Checking the filter function");
			dp.selectFilter();
			test.pass("Filter has been selected successfully.");
		}
		catch(Exception e)
		{
			test.fail("Failed"+e.getMessage());
			throw e;
		}
		
	}
	
	
	@Test(priority = 2)
	public void verifyAddDiscountCouponFunction()
	{
		ExtentTest test= ExtentTestListener.getTest();
		SidePages sp= new SidePages(driver);
		DiscountCouponPage dp= new DiscountCouponPage(driver);
		try
		{
			test.info("Opening the Discount coupon page");
			sp.openDiscountCouponPage();
			test.info("Checking the add coupon functionality");
			dp.clickDiscountCoupon();
			dp.selectInstitution();
			dp.enterEmail(p.getProperty("adminEmail"));
			dp.autoGenerateCode();
			dp.enterCouponAmount("100");
			dp.clickSave();
			
			String actualMessage=dp.getCouponCreatedMessage();
			Assert.assertEquals(actualMessage, "Discount coupon added successfully.");
			
			test.pass("Add coupon function working as successfully");
		}
		catch(Exception e)
		{
			test.fail("Failed"+e.getMessage());
			throw e;
		}
	}
	
	@Test(priority = 3)
	public void verifyTheSearchBarFunction()
	{
		ExtentTest test= ExtentTestListener.getTest();
		SidePages sp= new SidePages(driver);
		DiscountCouponPage dp= new DiscountCouponPage(driver);
		try
		{
			test.info("Opening the Discount coupon page");
			sp.openDiscountCouponPage();
			test.info("Checking the Search Box functionality");
			
			String coupon=dp.getCouponText();
			dp.checkSearchBar(coupon);
			
			test.pass("Search box function is working successfully");
		}
		catch(Exception e)
		{
			test.fail("Failed"+e.getMessage());
			throw e;
		}
	}


}
