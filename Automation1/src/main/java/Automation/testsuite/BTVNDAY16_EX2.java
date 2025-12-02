package Automation.testsuite;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Automation.common.CommonBase;
import Automation.constant.CT_PageURL;

public class BTVNDAY16_EX2 extends CommonBase {
	@BeforeMethod
	public void openWebPage()
	{
		driver = initWebDriver(CT_PageURL.SELENIUM_PRACTICE_URL);
	}
	@Test
	public void clickAlertSuccessfully()
	{
		
		click(By.xpath("//button[normalize-space(text())='Try it']"));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		String actualMessage = driver.switchTo().alert().getText();
		assertEquals(actualMessage, "Welcome to Selenium WebDriver Tutorials");
		driver.switchTo().alert().accept();
	}

}
