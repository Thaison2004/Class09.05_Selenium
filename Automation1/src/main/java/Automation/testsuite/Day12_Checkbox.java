package Automation.testsuite;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Automation.common.CommonBase;
import Automation.constant.CT_PageURL;

public class Day12_Checkbox extends CommonBase{
	@BeforeMethod
	public void beforRunTest()
	{
		System.out.println("This method is running");
	}
	
	@Test
	public void checkboxHandle()
	{
		driver = initWebDriver(CT_PageURL.DEMOQA_URL);
		//case1: kiem tra gia tri mac dinh (theo yeu cau REQ), vd: vaotrang web thi cac checkbox chua duoc check
		WebElement sportCheckbox = driver.findElement(By.id("hobbies-checkbox-1"));
		WebElement readCheckbox = driver.findElement(By.id("hobbies-checkbox-2"));
		WebElement musicCheckbox = driver.findElement(By.id("hobbies-checkbox-3"));
		//Mong doi ca 3 check box deu chua check theo REQ
		sportCheckbox.isSelected();
		boolean checkSport = sportCheckbox.isSelected();
		boolean checkReading = readCheckbox.isSelected();
		boolean checkMusic = musicCheckbox.isSelected();
		
		assertFalse(checkMusic);
		assertFalse(checkReading);
		assertFalse(checkSport);
	}
	
	@Test
	public void clickToCheckbox()
	{
		driver = initWebDriver(CT_PageURL.DEMOQA_URL);
		WebElement sportCheckbox = driver.findElement(By.id("hobbies-checkbox-1"));
		WebElement readCheckbox = driver.findElement(By.id("hobbies-checkbox-2"));
		WebElement musicCheckbox = driver.findElement(By.id("hobbies-checkbox-3"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", sportCheckbox);
		
		if(sportCheckbox.isSelected()== false)
		{
			driver.findElement(By.xpath("//label[text()='Sports']")).click();
			//sportCheckbox.click();
			assertTrue(sportCheckbox.isSelected());
		}
		if(readCheckbox.isSelected()== false)
		{
			driver.findElement(By.xpath("//label[text()='Reading']")).click();
			//readCheckbox.click();
			assertTrue(readCheckbox.isSelected());	
		}
		if(musicCheckbox.isSelected() == false)
		{
			driver.findElement(By.xpath("//label[text()='Music']")).click();
			//musicCheckbox.click();
			assertTrue(musicCheckbox.isSelected());
		}
	}
}
