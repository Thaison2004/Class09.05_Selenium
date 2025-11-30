package Automation.pagelocator;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class LogoutPage_Factory {
	private WebDriver driver;
	@FindBy(id ="dropdownMenuLink") WebElement adminDropdown;
	@FindBy(xpath ="//button[text()='Đăng xuất' and @type='button']")WebElement btnDangXuat;
	@FindBy(xpath ="//button[text()='Đăng xuất' and @type='submit']")WebElement btnconfirmDangXuat;
	public LogoutPage_Factory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void LogoutFunction()
	{
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		adminDropdown.click();
		btnDangXuat.click();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center'});", btnconfirmDangXuat);
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", btnconfirmDangXuat);
		
	}
	
	
}
