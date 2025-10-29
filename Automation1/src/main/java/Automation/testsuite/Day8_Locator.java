package Automation.testsuite;

import org.openqa.selenium.*;
import org.testng.annotations.Test;

import Automation.common.CommonBase;
import Automation.constant.CT_PageURL;


public class Day8_Locator extends CommonBase {
	
	@Test
	public void getElementById()
	{
		driver = initWebDriver(CT_PageURL.RISE_URL);
		WebElement email = driver.findElement(By.id("email"));
		System.out.println("Email element is:"+email);
		
		WebElement password = driver.findElement(By.name("password"));
		System.out.println("Password element is : "+ password);
	}
	@Test
	public void getElementByLinkText()
	{
		driver = initWebDriver (CT_PageURL.BEPANTOAN_URL);
		WebElement mayHutMuiLink = driver.findElement(By.linkText("Máy Hút Mùi"));
		System.out.println("MayHutMuiLink element is :" + mayHutMuiLink);
		
		WebElement chauVoiLink = driver.findElement(By.partialLinkText("Chậu Vòi"));
		System.out.println("chauVoiLink element is :" + chauVoiLink);
	}
	@Test
	public void getElementByClass_TagName()
	{
		driver = initWebDriver (CT_PageURL.BEPANTOAN_URL);
		WebElement h1 = driver.findElement(By.className("inline-block"));
		System.out.println("h1 is "+ h1);
		
		WebElement h3 = driver.findElement(By.tagName("h3"));
		System.out.println("h3 is "+ h3);
	}
	
	
	
}
