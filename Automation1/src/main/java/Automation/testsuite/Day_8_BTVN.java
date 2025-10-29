package Automation.testsuite;
import org.openqa.selenium.*;
import org.testng.annotations.Test;

import Automation.common.CommonBase;
import Automation.constant.CT_PageURL;

public class Day_8_BTVN extends CommonBase {
	
	@Test
	public void getElementByName() {
		driver = initWebDriver(CT_PageURL.RISE_URL);
		WebElement name = driver.findElement(By.id("name"));
		System.out.println("Email element is:"+name);
		
		WebElement username = driver.findElement(By.name("name"));
		System.out.println("Password element is : "+ username);
	}
	
	@Test
	public void getElementByAddress() {
		driver = initWebDriver(CT_PageURL.RISE_URL);
		WebElement name = driver.findElement(By.id("address"));
		System.out.println("Email element is:"+name);
		
		WebElement username = driver.findElement(By.name("address"));
		System.out.println("Password element is : "+ username);
	}

	@Test
	public void getElementByEmail() {
		driver = initWebDriver(CT_PageURL.RISE_URL);
		WebElement name = driver.findElement(By.id("email"));
		System.out.println("Email element is:"+name);
		
		WebElement username = driver.findElement(By.name("email"));
		System.out.println("Password element is : "+ username);
	}
	@Test
	public void getElementByPassword() {
		driver = initWebDriver(CT_PageURL.RISE_URL);
		WebElement name = driver.findElement(By.id("password"));
		System.out.println("Email element is:"+name);
		
		WebElement username = driver.findElement(By.name("password"));
		System.out.println("Password element is : "+ username);
	}
}
