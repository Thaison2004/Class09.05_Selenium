package Automation.common;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.*;

public class CommonBase {
	public static  WebDriver driver;
	public WebDriver initWebDriver(String URL)
	{
		
		System.setProperty("webdriver.firefox.driver", System.getProperty("user.dir") + "\\driver\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
		return driver;
	}
	
	public WebDriver initChromeDriver(String URL) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		
		Map<String, Object> chromePrefs = new HashMap<>();
		chromePrefs.put("credentials_enable_service", false); // Disables the "save password" prompt
		chromePrefs.put("profile.password_manager_enabled", false); // Disables the password manager
		chromePrefs.put("profile.password_manager_leak_detection", false); // Disables the password leak detection warning
		chromeOptions.setExperimentalOption("prefs", chromePrefs);
		
		ChromeDriver driver = new ChromeDriver(chromeOptions);
		driver.get(URL);
		driver.manage().window().maximize();
		return driver;
	}
	
	public WebElement findElement_Ex(By locator) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		return driver.findElement(locator);
	}
	
	FluentWait<WebDriver> wait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(30))
			.pollingEvery(Duration.ofMillis(500)) // Interval between each poll
			.ignoring(NoSuchElementException.class); // Exceptions to ignore
	// 2. fluent Wait
	public WebElement findElement_fluent(By locator)
	{
		
		
		 wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		

		return driver.findElement(locator);
	}
	
	public void click(By locator)
	{
		WebElement element =  findElement_Ex(locator);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30)); 
		wait.until(ExpectedConditions.elementToBeClickable(locator));
		element.click();
	}
	
	public void type(By locator, String value)
	{
		WebElement element = findElement_Ex(locator);
		element.clear();
		element.sendKeys(value);
	}
	
	public void clickByJS(By locator)
	{
		WebElement element = findElement_fluent(locator);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
	}
	
	public boolean isDisplay_fluent(By locator)
	{	try {
		WebElement element = findElement_fluent(locator);
		return element.isDisplayed(); // true
	}
	catch (NoSuchElementException ex1) 
	{
		return false;
	}
	catch (Exception ex)
	{
		return false;
	}
	}
	public void closeDriver()
	{
		if(driver != null)
		driver.close();
	}
}
 