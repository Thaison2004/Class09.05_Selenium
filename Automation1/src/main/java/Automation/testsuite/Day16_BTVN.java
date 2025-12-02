package Automation.testsuite;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Automation.common.CommonBase;
import Automation.constant.CT_PageURL;
import Automation.pagelocator.LoginPage_Factory;

public class Day16_BTVN extends CommonBase {

		@BeforeMethod
		public void openWebPage()
		{
			driver = initWebDriver(CT_PageURL.CRMSTAR_URL);
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
		public void createKLV()
		{
			loginSucessfully();
			click(By.xpath("//a[normalize-space(text())='Quản lý khu làm việc']"));
			click(By.xpath("//button[normalize-space(text())='Thêm mới']"));
			type(By.name("work_areas_code"),"123");
			type(By.name("name"),"ThaiSon");
			click(By.xpath("//button[normalize-space(text())='Lưu']"));			
		}
}
