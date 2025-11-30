package Automation.pagelocator;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TEDU_CapNhatMK_Page {

	private WebDriver driver;
	@FindBy(xpath ="//button[@id='onesignal-slidedown-cancel-button']") WebElement btnSubcribe;
	
	@FindBy(xpath = "//a[@title='Đăng Nhập']") WebElement menuLogin;
	
	@FindBy(id="UserName") WebElement textEmail;
	@FindBy(id="PassWord") WebElement textPass;
	@FindBy(xpath ="//button[text()='Đăng Nhập']") WebElement btnLogin;
	
    //Update pass elements
	@FindBy(xpath = "//a[@title='Tài khoản' and @data-toggle='dropdown' ]") WebElement avatar;
	@FindBy(xpath = "//a[@title='Đổi mật khẩu']") WebElement updatePassButton;
	@FindBy(id = "OldPassword") WebElement textOldPass;
	@FindBy(id = "NewPassword") WebElement textNewPass;
	@FindBy(id = "ConfirmPassword") WebElement textNewPassConfirm;
	@FindBy(xpath = "//input[@value='Cập nhật']") WebElement btnUpdate;
	public TEDU_CapNhatMK_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void loginFunction (String email,String pass)
	{
		
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		btnSubcribe.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		menuLogin.click();
		textEmail.sendKeys(email);
		textPass.sendKeys(pass);
		btnLogin.click();
		
			
			btnSubcribe.click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

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
