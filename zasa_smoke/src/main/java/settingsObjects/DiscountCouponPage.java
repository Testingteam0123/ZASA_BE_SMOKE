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
	private WebElement btnAddDiscountCoupon;
	
	@FindBy(xpath="//option[text()='New Indian Model School, Dubai']")
	private WebElement InstitutionOption;
	
	@FindBy(xpath="//input[@name='email']")
	private WebElement emailField;
	
	@FindBy(xpath="//button[text()='Auto Generate']")
	private WebElement couponCode;
	
	@FindBy(xpath="//div[text()='Coupon code generated!']")
	private WebElement couponGeneratedMessage;
	
	@FindBy(id="discount_amount")
	private WebElement fieldCouponAmount;
	
	
	@FindBy(xpath="//button[text()='Save']")
	private WebElement btnSave;
	
	@FindBy(xpath="//div[text()='Discount coupon added successfully.']")
	private WebElement couopnCreatedMessage;
	
	
	@FindBy(css="[class='font-mono uppercase font-medium']")
	private WebElement couponText;
	
	@FindBy(xpath="//input[@placeholder='Search by Coupon Code']")
	private WebElement searchBar;
	
	@FindBy(xpath="//button//span[text()='Filter']")
	private WebElement filterBtn;
	
	@FindBy(xpath="(//input[@class='accent-[#966AC3]'])[3]")
	private WebElement selectOption;
	
	
	
	
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
	
	
	public String getCouponText()
	{
		wait.visibilityOf(couponText, 3);
		return couponText.getText();
	}
	
	public void checkSearchBar(String coupon)
	{
		searchBar.sendKeys(coupon);
	}
	
	public void selectFilter()
	{
		filterBtn.click();	
		selectOption.click();
	}
	
}
