package com.insticator.POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Placement 
{
	
	@FindBy(xpath = "(//div[contains(text(),'In-Content Embed')])[2]")
	
	private WebElement embContent;
	
	public void clickcontent() 
	{
		try
		{
			Thread.sleep(2000);
			embContent.click();
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	
	}
}
