package productManagementTests;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;

import com.aventstack.extentreports.ExtentTest;
import com.github.javafaker.Faker;

import baseTest.BaseTest;
import commonObjects.SidePages;
import productManagementObjects.EditionSettings;
import utilities.ExtentTestListener;


@Listeners(ExtentTestListener.class)
public class EditionSettingsTest extends BaseTest{
	
	
	@DataProvider(name="editiondata")
	public Object[][] editionData()
	{
		Object [][] editionData= new Object[1][1];
		Faker f= new Faker();
		for(int i=0;i<1;i++)
		{
		  int editionYear=f.number().numberBetween(1990, 2025);
		  editionData[i][0]=String.valueOf(editionYear);
		
		}
		return editionData;
	}
	
	
	@Test(dataProvider = "editiondata")
	public void verifyAddEditionfunctionality(String editionName)
	{
		ExtentTest test = ExtentTestListener.getTest();
		SidePages sp= new SidePages(driver);
		EditionSettings es= new EditionSettings(driver);
	     
		try {
			test.info("Opening the Product Settings page");
		sp.openProductSettingspage();
		test.info("Adding the Edition year");	
		es.createEdition(editionName);
		
		String expectedMessage=es.getEditionAddedMessage();
		AssertJUnit.assertEquals(expectedMessage, "Edition added successfully.");
		test.pass("Edition year added successfully.");
		}
		catch(Exception e)
		{
			Assert.fail("Failed: " + e.getMessage());
	    	throw e;
		}
	}
	
	@Test(priority = 2)
	public void verifyEditEditionfunctionality()
	{
		ExtentTest test = ExtentTestListener.getTest();
		SidePages sp= new SidePages(driver);
		EditionSettings es= new EditionSettings(driver);
		
		try {
			
			test.info("Opening the Product Settings page");
	       sp.openProductSettingspage();
	       
	       test.info("Editing the Edition year");
			
		es.editEdition("2002");
		String expectedMessage=es.getEditionUpdatedMessage();
		AssertJUnit.assertEquals(expectedMessage, "Edition updated successfully.");
		test.pass("Edition year updated successfully.");
		}
		catch(Exception e)
		{
			Assert.fail("Failed: " + e.getMessage());
	    	throw e;
		}
	}
	
	@Test(priority = 3)
	public void verifyDeleteEditionfunctionality()
	{
		ExtentTest test = ExtentTestListener.getTest();
		SidePages sp= new SidePages(driver);
		EditionSettings es= new EditionSettings(driver);
		
		try
		{
			test.info("Opening the Product Settings page");
	     sp.openProductSettingspage();
	     test.info("Deleting the Edition year");
		es.deleteEdition();
		
		String expectedMessage=es.getEditionDeletedMessage();
		AssertJUnit.assertEquals(expectedMessage, "Edition deleted successfully.");
		test.pass("Edition year deleted successfully.");
		}
		catch(Exception e)
		{
			Assert.fail("Failed: " + e.getMessage());
	    	throw e;
		}
		
	}

}
