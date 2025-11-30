package Automation.testsuite;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Automation.common.CommonBase;
import Automation.constant.CT_PageURL;
import Automation.pagelocator.LoginPage;
import Automation.pagelocator.LoginPage_Factory;
import Automation.pagelocator.LogoutPage_Factory;

public class Day14_Test extends CommonBase {
	@BeforeMethod
	public void openWebPage()
	{
		driver = initWebDriver(CT_PageURL.CRMSTAR_URL );
	}
	
	@Test
	public void loginSucessfully()
	{
		LoginPage_Factory login = new LoginPage_Factory(driver);
		login.LoginFunction("admin@gmail.com", "12345678");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		assertTrue(driver.findElement(By.xpath("//p[text()='Quản lý người dùng']")).isDisplayed());
	}
	@Test
	public void logoutSuccessfully()
	{
		loginSucessfully();
		LogoutPage_Factory logout = new LogoutPage_Factory(driver);
		logout.LogoutFunction();
		assertTrue(driver.findElement(By.xpath("//h4[text()='Đăng nhập']")).isDisplayed());
	}
}
