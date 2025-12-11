package loginPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import commonObjects.BasePage;


public class AdminLoginPage extends BasePage {

	public AdminLoginPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(id = "email")
	private WebElement emailField;

	@FindBy(id = "password")
	private WebElement passField;

	@FindBy(id = "remember")
	private WebElement rememberBox;

	@FindBy(xpath = "//button[text()='Login']")
	private WebElement loginbutton;

	public void loginAdmin(String email,String pass)
	{
		emailField.sendKeys(email);
		passField.sendKeys(pass);
		rememberBox.click();
		loginbutton.click();
	}

}
