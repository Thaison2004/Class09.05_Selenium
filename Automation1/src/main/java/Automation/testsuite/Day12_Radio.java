package Automation.testsuite;



import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Automation.common.CommonBase;
import Automation.constant.CT_PageURL;

public class Day12_Radio extends CommonBase {
	@Test
	public void clickToRadio()
	{
		driver = initWebDriver(CT_PageURL.DEMOQA_URL);
		// kiem tra gia tri mac dinh isSelected la false
		WebElement maleRadio = driver.findElement(By.id("gender-radio-1"));
		WebElement feMaleRadio = driver.findElement(By.id("gender-radio-2"));
		WebElement otherRadio = driver.findElement(By.id("gender-radio-3"));
		
		boolean male = maleRadio.isSelected();
		// Mong doi, xac nhan rang male chua duoc bam = false
		assertFalse(male);
		// mong doi, xac nhan rang female chua duoc bam = false
		assertFalse(feMaleRadio.isSelected());
		assertFalse(otherRadio.isSelected());
		
		//Click Female
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", feMaleRadio);
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		//feMaleRadio.click();
		assertTrue(feMaleRadio.isSelected());
	}
	
	

}
