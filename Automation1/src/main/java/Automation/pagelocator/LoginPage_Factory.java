package Automation.pagelocator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.*;

public class LoginPage_Factory {
	private WebDriver driver;
	@FindBy(id = "email") WebElement textEmail;
	@FindBy(id = "password") WebElement textPass;
	@FindBy(name = "signin") WebElement btnDangNhap;
	@FindBy(xpath = "//input[@type='text']") WebElement textEmailVibo;
	@FindBy(xpath = "//input[@type='password']") WebElement textPassVibo;
	@FindBy(xpath = "//button[span[normalize-space(text())='Đăng nhập']]") WebElement btnDangNhapVibo;
	
	
	public LoginPage_Factory(WebDriver driverTest) {
		
		this.driver = driverTest;
		PageFactory.initElements(driverTest, this);
	}
	
	public void LoginFunction(String email, String password)
	{
		textEmail.sendKeys(email);
		textPass.sendKeys(password);
		btnDangNhap.click();
		driver.switchTo().alert().accept();
	}
	public void LoginFunction_BTVN(String email, String password)
	{
		textEmailVibo.sendKeys(email);
		textPassVibo.sendKeys(password);
		btnDangNhapVibo.click();
//		driver.switchTo().alert().accept();
	}
}
