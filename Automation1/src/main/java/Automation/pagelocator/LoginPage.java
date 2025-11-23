package Automation.pagelocator;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	private WebDriver driver;

	public LoginPage(WebDriver _driver) {
		this.driver = _driver;
	}
	
	public void LoginFunction(String email, String pass)
	{
		WebElement textEmail = driver.findElement(By.id("email"));
		if(textEmail.isDisplayed()== true)
		{
			textEmail.sendKeys(email);			
		}
		
		WebElement textPass = driver.findElement(By.id("password"));
		if(textEmail.isDisplayed()== true)
		{
			textEmail.sendKeys(pass);			
		}
		
		driver.findElement(By.name("signin")).click();
		driver.switchTo().alert().accept();
		//Accept alert if exist
//		driver.switchTo().alert().accept();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	}

}
