package settingsObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import commonObjects.BasePage;
import utilities.WaitHelper;

public class DiscountCouponPage extends BasePage{

	
	WaitHelper wait = new WaitHelper(driver);
	
	public DiscountCouponPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//button[text()='Add Discount Coupon']")
	WebElement btnAddDiscountCoupon;
	
	@FindBy(xpath="//option[text()='New Indian Model School, Dubai']")
	WebElement InstitutionOption;
	
	@FindBy(xpath="//input[@name='email']")
	WebElement emailField;
	
	@FindBy(xpath="//button[text()='Auto Generate']")
	WebElement couponCode;
	
	@FindBy(xpath="//div[text()='Coupon code generated!']")
	WebElement couponGeneratedMessage;
	
	@FindBy(id="discount_amount")
	WebElement fieldCouponAmount;
	
	
	@FindBy(xpath="//button[text()='Save']")
	WebElement btnSave;
	
	@FindBy(xpath="//div[text()='Discount coupon added successfully.']")
	WebElement couopnCreatedMessage;
	
	
	
	
	public void clickDiscountCoupon()
	{
		btnAddDiscountCoupon.click();	
	}
	
	public void selectInstitution()
	{
		InstitutionOption.click();
	}
	
	public void enterEmail(String email)
	{
		emailField.sendKeys(email);
	}
	
	public void autoGenerateCode()
	{
		couponCode.click();
	}
	
	public void enterCouponAmount(String amount)
	{
		fieldCouponAmount.sendKeys(amount);
	}
	
	public void clickSave()
	{
		btnSave.click();
	}
	
	public String getCouponGeneratedMessage()
	{
		wait.visibilityOf(couponGeneratedMessage, 3);
		return couponGeneratedMessage.getText();
		
	}
	
	public String getCouponCreatedMessage()
	{
		wait.visibilityOf(couopnCreatedMessage, 3);
		return couopnCreatedMessage.getText();
	}
	
	
}
