package Automation.testsuite;

import static org.testng.Assert.assertTrue;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Automation.common.CommonBase;
import Automation.constant.CT_PageURL;
import Automation.pagelocator.TEDU_CapNhatMK_Page;

public class TEDU_CapNhatMK_Test extends CommonBase {

	@BeforeMethod
	public void openWebPage()
	{
		driver = initWebDriver(CT_PageURL.TEDU_URL);
	}
	@Test
	public void loginSuccessfully()
	{
		TEDU_CapNhatMK_Page tedu = new TEDU_CapNhatMK_Page(driver);
		tedu.loginFunction("duonghuuthaison2309@gmail.com", "thaison2004");
		WebElement avatar = driver.findElement(By.xpath( "//a[@title='Tài khoản' and @data-toggle='dropdown' ]"));
		assertTrue(avatar.isDisplayed());
	}
	@Test
	
	public void updatePasswordSuccessfully()
	{
		loginSuccessfully();
//		driver.switchTo().alert().accept();
		TEDU_CapNhatMK_Page tedu = new TEDU_CapNhatMK_Page(driver);
		tedu .changePassword("thaison2004", "12345678");
		assertTrue(driver.findElement(By.xpath("//div[@class='alert alert-success']")).isDisplayed());
	}
	
}
