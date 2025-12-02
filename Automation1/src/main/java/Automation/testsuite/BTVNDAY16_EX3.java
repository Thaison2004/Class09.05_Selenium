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

public class BTVNDAY16_EX3 extends CommonBase {
	@BeforeMethod
	public void openWebPage()
	{
		driver = initWebDriver(CT_PageURL.DEMO_AUTOMATION_URL);
	}
	@Test
	public void clickAlertWithOKSuccessfully()
	{
		click(By.xpath("//button[normalize-space(text())='click the button to display an alert box:']"));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.alertIsPresent());
		String actualMessage = driver.switchTo().alert().getText();
		assertEquals(actualMessage, "I am an alert box!");
		driver.switchTo().alert().accept();
	}
	@Test
	public void clickAlertWithOkAndCancel()
	{
		click(By.xpath("//a[normalize-space(text())='Alert with OK & Cancel']"));
		click(By.xpath("//button[@onclick='confirmbox()']"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.alertIsPresent());
		String actualMessage = driver.switchTo().alert().getText();
		assertEquals(actualMessage, "Press a Button !");
		driver.switchTo().alert().accept();
	}
	@Test
	public void clickAlertWithTextBox()
	{
		click(By.xpath("//a[normalize-space(text())='Alert with Textbox']"));
		click(By.xpath("//button[@onclick='promptbox()']"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.alertIsPresent());
		String actualMessage = driver.switchTo().alert().getText();
		assertEquals(actualMessage, "Please enter your name");
		driver.switchTo().alert().accept();
	}
	

}
