package productManagementObjects;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import commonObjects.BasePage;
import utilities.WaitHelper;

public class ProductPage extends BasePage {

	WaitHelper wait = new WaitHelper(driver);

	public ProductPage(WebDriver driver) {
		super(driver);

	}

	// Add stationary


	@FindBy(xpath = "//button[text()='Add Product']")
	private WebElement btnAddProduct;

	@FindBy(css = "#productname")
	private WebElement txtProductname;

	@FindBy(xpath = "(//select[@aria-hidden='true'])[1]")
	private WebElement selectStationery;

	@FindBy(css = ".ql-editor")
	private WebElement txtDescription;

	@FindBy(xpath = "//input[@id='product-images']")
	private WebElement addProductImage;

	@FindBy(xpath = "(//button[@role='combobox' and @data-slot='select-trigger'])[2]")
	private WebElement clickItemCategory;

	@FindBy(xpath = "//div[@data-state='open']//span[text()='stationery']")
	private WebElement selectStationaryType;

	@FindBy(id = "price")
	private WebElement txtPurchaseprice;

	@FindBy(id = "sellingprice")
	private WebElement txtSellingPrice;

	@FindBy(css = "[aria-haspopup='dialog']")
	private WebElement clickStationaryInstitution;

	@FindBy(xpath = "//button[text()='Save']")
	private WebElement btnSave;

	@FindBy(xpath = "(//button[contains(@class,'focus:outline-none')])[2]")
	private WebElement actionButton;

	@FindBy(xpath = "(//div[contains(@role,'menuitem')])[3]")
	private WebElement deleteButton;

	@FindBy(xpath = "//button[text()='OK']")
	private WebElement confirmDeleteButton;

	@FindBy(xpath = "//div[normalize-space()='Edit']")
	private WebElement editButton;

	@FindBy(id = "productname")
	private WebElement editProductName;

	@FindBy(id = "sellingprice")
	private WebElement editSellingPrice;

	@FindBy(id = "price")
	private WebElement editPurchasePrice;

	@FindBy(xpath = "//li[contains(@class,'group toast')]//div//div[text()='Product added successfully.']")
	private WebElement productAddedSuccessMessage;

	@FindBy(xpath = "//li[contains(@class,'group toast')]//div//div[text()='Product deleted successfully.']")
	private WebElement deleteMessage;

	@FindBy(xpath = "//li[contains(@class,'group toast')]//div//div[text()='Successfully logged In']")
	private WebElement loginSuccessMessage;

	@FindBy(xpath = "//li[contains(@class,'group toast')]//div//div[text()='Product updated successfully.']")
	private WebElement productUpdatedSuccessMessage;

//add uniform

	@FindBy(xpath = "//option[text()='Uniform']")
	private WebElement selectUniform;

	@FindBy(xpath = "//input[@id='size-chart-images']")
	private WebElement addSizeChart;

	@FindBy(id = "product_video_url")
	private WebElement addVideoUrl;

	@FindBy(xpath = "//option[text()='Bombay Dyeing']")
	private WebElement selectBrand;

	@FindBy(xpath = "//option[text()='Boys Uniform']")
	private WebElement selectItemType;

	@FindBy(css = "[aria-haspopup='dialog']:nth-of-type(1)")
	private WebElement clickSizeDropdown;

	@FindBy(xpath = "//div[contains(@class,'cursor-pointer')]//span[text()='28']")
	private WebElement selectSize;

	@FindBy(xpath = "//option[text()='Male']")
	private WebElement selectGender;

	@FindBy(xpath = "//option[text()='Core Uniform']")
	private WebElement selectStockCategory;

	@FindBy(xpath = "//option[text()='Middle']")
	private WebElement selectGrade;;

	@FindBy(xpath = "(//button[@aria-haspopup='dialog'])[2]")
	private WebElement clickInstitutionDropdown;

	@FindBy(xpath = "//div[contains(@class,'cursor-pointer')]//span[text()='New Indian Model School, Dubai']")
	private WebElement selectInstitution;

// add book

	@FindBy(xpath = "(//button[@role='combobox'])[1]")
	private WebElement clickCategoryDropdown;

	@FindBy(xpath = "(//select[@aria-hidden='true'])[1]//option[text()='Book']")
	private WebElement selectBook;

	@FindBy(xpath = "//option[text()='Text Book']")
	private WebElement selectBookType;

	@FindBy(xpath = "//option[text()='AL MASAR']")
	private WebElement selectPublisher;

	@FindBy(xpath = "//option[text()='2025']")
	private WebElement editionYear;

	@FindBy(xpath = "//option[text()='Note Book']")
	private WebElement selectBookCategory;
	
	@FindBy(xpath="(//button[contains(@class,'peer')])[2]")
	private WebElement selectCheckBox;
	
	@FindBy(xpath="//button/span[text()='Bulk Action']")
	private WebElement btnBulkAction;
	
	@FindBy(xpath="//button[text()='Exchange/Return']")
	private WebElement selectOption;
	
	@FindBy(xpath="//li[contains(@class,'group toast')]//div//div[text()='Policy updated successfully.']")
	private WebElement policyUpdateMessage;

	// add stationary
	public void addStationaryProduct(String name, String price, String imagePath) {
		//wait.visibilityOf(loginSuccessMessage, 5);
		driver.navigate().refresh();
		Properties p= new Properties();
		btnAddProduct.click();
		txtProductname.sendKeys(name);
		Select select = new Select(selectStationery);
		select.selectByVisibleText("Stationery");
		txtDescription.click();
		txtDescription.sendKeys(name);

		
		addProductImage.sendKeys(imagePath);

		clickItemCategory.click();
		selectStationaryType.click();

		txtPurchaseprice.sendKeys(price);
		txtSellingPrice.sendKeys(price);
		clickStationaryInstitution.click();
		btnSave.click();
	}

	public void deleteProduct() {
		//wait.visibilityOf(productAddedSuccessMessage, 5);
		driver.navigate().refresh();
		actionButton.click();
		deleteButton.click();
		confirmDeleteButton.click();

	}

	public String getDeleteMessage() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		WebElement msg = wait.until(ExpectedConditions.visibilityOf(deleteMessage));
		return msg.getText();
	}

	public String ProductAddedMessage() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		WebElement msg = wait.until(ExpectedConditions.visibilityOf(productAddedSuccessMessage));
		return msg.getText();
	}

	public String loginSuccessMessage() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		WebElement msg = wait.until(ExpectedConditions.visibilityOf(loginSuccessMessage));
		return msg.getText();
	}

	public String productUpdatedSuccessMessage() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		WebElement msg = wait.until(ExpectedConditions.visibilityOf(productUpdatedSuccessMessage));
		return msg.getText();
	}

	public void addUniformProduct(String name, String price,String imagePath,String chartImage) {
		wait.visibilityOf(loginSuccessMessage, 5);
		btnAddProduct.click();
		txtProductname.sendKeys(name);
		Select select = new Select(selectStationery);
		select.selectByVisibleText("Uniform");
		txtDescription.click();
		txtDescription.sendKeys(name);
		addProductImage.sendKeys(imagePath);
		addSizeChart.sendKeys(chartImage);

		addVideoUrl.sendKeys("https://youtube.com/shorts/X5xLb-qrB5w?si=z_fhxBM7U6krFns2");

		selectBrand.click();
		selectItemType.click();
		clickSizeDropdown.click();
		selectSize.click();
		selectGender.click();
		selectStockCategory.click();
		selectGrade.click();

		txtPurchaseprice.sendKeys(price);
		txtSellingPrice.sendKeys(price);
		clickInstitutionDropdown.click();
		selectInstitution.click();
		selectInstitution.click();
		btnSave.click();

	}

	public void editProduct(String name) throws InterruptedException {

		//waitForLoginOrProductAdded();
		driver.navigate().refresh();
		actionButton.click();
		editButton.click();

		wait.elementToBeClickable(editProductName, 5);
		editProductName.click();
		editProductName.sendKeys(Keys.CONTROL + "a");
		editProductName.sendKeys(Keys.DELETE);
		editProductName.sendKeys(name);

		btnSave.click();

	}

	public void waitForLoginOrProductAdded() {

		if (wait.isVisible(loginSuccessMessage, 3)) {
			System.out.println(loginSuccessMessage.getText());
		} else if (wait.isVisible(productAddedSuccessMessage, 3)) {
			System.out.println(productAddedSuccessMessage.getText());
		} else {

		}

	}
	
	public void policyUpdate()
	{
		selectCheckBox.click();
		btnBulkAction.click();
		selectOption.click();
	}
	
	public String getPolicyUpdateMessage()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		WebElement msg = wait.until(ExpectedConditions.visibilityOf(policyUpdateMessage));
		return msg.getText();
	}

}
