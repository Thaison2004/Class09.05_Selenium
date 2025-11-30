package Automation.testsuite;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Automation.common.CommonBase;
import Automation.constant.CT_PageURL;
import Automation.pagelocator.LoginPage;

public class LoginTest extends CommonBase {
	
	@BeforeMethod
	public void openWebPage()
	{
		driver = initWebDriver(CT_PageURL.CRMSTAR_URL);
	}
	
	@Test
	public void loginSuccessfully()
	{
		LoginPage login = new LoginPage(driver);
		login.LoginFunction("admin@gmail.com","12345678");
		WebElement textQuanLyND= driver.findElement(By.xpath("//p[text()='Quản lý người dùng']"));
		assertTrue(textQuanLyND.isDisplayed());
	}
	
	@Test
	public void loginFail_IncorrectPass()
	{
		LoginPage login = new LoginPage(driver);
		login.LoginFunction("admin@gmail.com","12345678_0000");
		WebElement error = driver.findElement(By.xpath("//h4[text()='Đăng nhập']"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		assertTrue(error.isDisplayed());
	}
	@Test
	public void loginFail_Incorrectemail()
	{
		LoginPage login = new LoginPage(driver);
		login.LoginFunction("admin123@gmail.com","12345678");
		WebElement errorEmail = driver.findElement(By.xpath("//h4[text()='Đăng nhập']"));
//		driver.switchTo().alert().accept();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		assertTrue(errorEmail.isDisplayed());
		
	}
	@Test
	public void loginFail_IncorrectPassAndEmail()
	{
		LoginPage login = new LoginPage(driver);
		login.LoginFunction("admin123@gmail.com","12345678_0000");
		WebElement errorPassAndEmail = driver.findElement(By.xpath("//h4[text()='Đăng nhập']"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		assertTrue(errorPassAndEmail.isDisplayed());
	}
	
}
