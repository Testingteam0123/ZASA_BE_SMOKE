package productManagementTests;

import org.testng.annotations.Test;
import org.testng.Assert;

import org.testng.annotations.Listeners;

import com.aventstack.extentreports.ExtentTest;

import baseTest.BaseTest;
import commonObjects.SidePages;
import productManagementObjects.WeightManagementPage;
import utilities.ExtentTestListener;

@Listeners(ExtentTestListener.class)
public class AddNewWeightTest extends BaseTest {

	@Test
	public void addNewWeightTest() {

		ExtentTest test = ExtentTestListener.getTest();
		SidePages sp = new SidePages(driver);
		WeightManagementPage weightPage = new WeightManagementPage(driver);
		try {
			test.info("Opening the Weight Management");
			sp.openWeightManagementpage();
			test.info("Adding Weight for the product");
			weightPage.addNewWeight("8");
			String expectedMessage = weightPage.getWeightUpdatedMessage();
			Assert.assertEquals(expectedMessage, "Weights updated successfully!");
		} catch (Exception e) {
			Assert.fail("Failed" + e.getMessage());
			throw e;
			
		}
	}
	
	@Test(priority = 2)
	public void checkTheSearchFunction()
	{
		ExtentTest test = ExtentTestListener.getTest();
		SidePages sp = new SidePages(driver);
		WeightManagementPage weightPage = new WeightManagementPage(driver);
		try {
			test.info("Opening the Weight Management");
			sp.openWeightManagementpage();
			test.info("Check the search function of the weight management module");
			weightPage.getSearchBox(p.getProperty("WeightMangementSearch"));
			test.pass("The Search function working finely");
				
		} catch (Exception e) {
			Assert.fail("Failed" + e.getMessage());
			throw e;
		}
	}
	
	@Test(priority = 3)
	public void checkFilterFunctonality() {

		ExtentTest test = ExtentTestListener.getTest();
		SidePages sp = new SidePages(driver);
		WeightManagementPage weightPage = new WeightManagementPage(driver);
		try {
			test.info("Opening the Weight Management");
			sp.openWeightManagementpage();
			test.info("Check the filter functon");
			weightPage.clickfilterOption();
			weightPage.selectStationary();
			test.pass("Filter function is working properly");
		} catch (Exception e) {
			Assert.fail("Failed" + e.getMessage());
			throw e;
		}
	}
	
	
	

}
