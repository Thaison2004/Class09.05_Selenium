package Automation.testsuite;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Automation.common.CommonBase;
import Automation.constant.CT_PageURL;
import Automation.pagelocator.LoginPage_Factory;

public class BTVNDAY14 extends CommonBase {
	@BeforeMethod
	public void openWebPage()
	{
		driver = initWebDriver(CT_PageURL.VIBLO_URL );
	}
	
	@Test
	public void loginSucessfullyBTVN()
	{
		LoginPage_Factory login = new LoginPage_Factory(driver);
		login.LoginFunction_BTVN("duonghuuthaison2309@gmail.com", "12345678");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		assertTrue(driver.findElement(By.xpath("//h1[normalize-space()='Chào mừng, Thai Son']")).isDisplayed());
	}
	@Test
	public void loginFailBTVN()
	{
		LoginPage_Factory login = new LoginPage_Factory(driver);
		login.LoginFunction_BTVN("duonghuuthaison2309@gmail.com", "123456789");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		assertTrue(driver.findElement(By.xpath("//span[normalize-space()='Wrong username/email or password']")).isDisplayed());
	}
}
