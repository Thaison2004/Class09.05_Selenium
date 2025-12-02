package Automation.pagelocator;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TEDU_CapNhatMK_Page {

	private WebDriver driver;
	@FindBy(xpath ="//button[normalize-space()='Subscribe']") WebElement btnSubcribe;
	@FindBy(xpath = "//a[@title='Đăng nhập']") WebElement menuLogin;
	@FindBy(id="UserName") WebElement textEmail;
	@FindBy(id="Password") WebElement textPass;
	@FindBy(xpath ="//button[text()='Đăng nhập']") WebElement btnLogin;
	
    //Update pass elements
	@FindBy(xpath = "//a[@title='Tài khoản' and @data-toggle='dropdown' ]") WebElement avatar;
	@FindBy(xpath = "//a[@title='Đổi mật khẩu']") WebElement updatePassButton;
	@FindBy(id = "OldPassword") WebElement textOldPass;
	@FindBy(id = "NewPassword") WebElement textNewPass;
	@FindBy(id = "ConfirmNewPassword") WebElement textNewPassConfirm;
	@FindBy(xpath = "//input[@value='Cập nhật']") WebElement btnUpdate;
	public TEDU_CapNhatMK_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void loginFunction (String email,String pass)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", btnSubcribe);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		menuLogin.click();
		textEmail.sendKeys(email);
		textPass.sendKeys(pass);
		btnLogin.click();
		btnSubcribe.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		

		}
	
	
	public void changePassword(String oldPass, String newPass)
	{
		avatar.click();
		updatePassButton.click();
		textOldPass.sendKeys(oldPass);
		textNewPass.sendKeys(newPass);
		textNewPassConfirm.sendKeys(newPass);
		btnUpdate.click();
	}
}
