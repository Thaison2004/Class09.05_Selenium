package Automation.testsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Automation.common.CommonBase;
import Automation.constant.CT_PageURL;

public class BTVN_DAY12_DROPDOWN extends CommonBase {

	@Test
    public void selectCountryDropdownlist() {
        
        
        driver = initWebDriver("https://globalsqa.com/demo-site/select-dropdown-menu/");

       
        WebElement countryDropdown = driver.findElement(By.xpath("//option[@value='AFG']/parent::select"));

        Select selectCountry = new Select(countryDropdown);
        int size = selectCountry.getOptions().size();
        System.out.println("Size dropdown country la: " + size);

        //  Afghanistan theo text
        selectCountry.selectByVisibleText("Afghanistan");
        System.out.println("Selected: " + selectCountry.getFirstSelectedOption().getText());

        // theo value (DZA)
        selectCountry.selectByValue("DZA");
        System.out.println("Selected: " + selectCountry.getFirstSelectedOption().getText());

}
}
