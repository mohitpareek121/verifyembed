package com.insticator.POM;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.genericlib.CommonLibs;
import com.genericlib.Driver;

public class Dashboard extends CommonLibs

{
	@FindBy (xpath="//*[normalize-space(text()) = 'here']")
	private WebElement link;
	
	public void clicklink()
	{
		try {
			
		
		waitForXpathPresent("//*[normalize-space(text()) = 'here']");
		
		link.click();
		
		String win = getTab();
		
		Driver.driver.switchTo().window(win);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
}
