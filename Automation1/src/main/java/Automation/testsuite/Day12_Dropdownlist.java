package Automation.testsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Automation.common.CommonBase;
import Automation.constant.CT_PageURL;

public class Day12_Dropdownlist extends CommonBase {

	@Test
	public void selectDropdownlist() throws InterruptedException
	{
		driver = initWebDriver(CT_PageURL.CODESTAR_URL);
		Thread.sleep(3000);
		Select dropCourse = new Select(driver.findElement(By.id("product_categories_filter")));
		// Kiem tra size
		int size = dropCourse.getOptions().size();
		System.out.println("Size is:" + size);
		
		// chon aws theo cach 1
		dropCourse.selectByVisibleText("AWS");
		String aws = dropCourse.getFirstSelectedOption().getText();
		System.out.println("Text sau khi chon AWS:" + aws);
		
		// chon lap trinh web theo cach 2
		Thread.sleep(5000);
		dropCourse.selectByIndex(3);;
		String laptrinhWeb = dropCourse.getFirstSelectedOption().getText();
		System.err.println ("Text sau khi chon Lap trinh Web: "+ laptrinhWeb);
		
	}
}
