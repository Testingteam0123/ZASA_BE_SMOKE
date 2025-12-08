package utilities;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitHelper {

	private  WebDriver driver;
	
	public WaitHelper(WebDriver driver) {
		this.driver = driver;
	}
	
	public  void InvisibilityOf(WebElement element, int time)
	{
		  WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(time));
		wait.until(ExpectedConditions.invisibilityOf(element));
	}
	
	public  void visibilityOf(WebElement element, int time)
	{
		  WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(time));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public void elementToBeClickable(WebElement element, int time)
	{
		  WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(time));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public boolean isVisible(WebElement element, int time)
	{
		  
		try {
			WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(time));
			wait.until(ExpectedConditions.visibilityOf(element));
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public void invisiblilityOfElementLocatedBy(By locator, int time)
	{
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(time));
	wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
	}
	
	
	public void visibilityOfAll(List<WebElement> elements, int time) {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
	    wait.until(ExpectedConditions.visibilityOfAllElements(elements));
	}

	public void visibilityOfAllElementsLocatedBy(By locator, int time) {
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(time));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));		
	}
	
		
	public void visibilityOfElementsLocatedBy(By locator, int time) {
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(time));
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));		
		
	}
	
	
}
