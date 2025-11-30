package Automation.testsuite;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Automation.common.CommonBase;
import Automation.constant.CT_PageURL;

public class Login extends CommonBase {
	@BeforeMethod
	public void openWebPage()
	{
		driver = initWebDriver(CT_PageURL.CRMSTAR_URL);	
	}
	@Test
	public void loginSuccessfully()
	{
		WebElement textEmail = driver.findElement(By.id("email"));
		if(textEmail.isDisplayed()== true)
		{
			textEmail.sendKeys("admin@gmail.com");			
		}
		
		WebElement textPass = driver.findElement(By.id("password"));
		if(textPass.isDisplayed()== true)
		{
			textPass.sendKeys("12345678");			
		}
		
		driver.findElement(By.name("signin")).click();
		//Accept alert
		driver.switchTo().alert().accept();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		WebElement textQuanLyND= driver.findElement(By.xpath("//p[text()='Quản lý người dùng']"));
		
		assertTrue(textQuanLyND.isDisplayed());
		
	}
	@Test
	public void loginFail_IncorrectUsername()
	{
		WebElement textEmail = driver.findElement(By.id("email"));
		if(textEmail.isDisplayed()== true)
		{
			textEmail.sendKeys("admin@gmail.com");			
		}
		
		WebElement textPass = driver.findElement(By.id("password"));
		if(textPass.isDisplayed()== true)
		{
			textPass.sendKeys("12345678");			
		}
		
		driver.findElement(By.name("signin")).click();
		//Accept alert
		driver.switchTo().alert().accept();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		WebElement error = driver.findElement(By.xpath("//h4[text()='Đăng nhập']"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		assertTrue(error.isDisplayed());
	}

}
