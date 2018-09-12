package com.insticator.POM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.genericlib.CommonLibs;
import com.genericlib.Constants;
import com.genericlib.Driver;

public class MkResearch extends CommonLibs

{
	@FindBy(xpath = "//a[@id='create']")
	private WebElement Create;
	
	@FindBy(xpath = "//div[@class='overlay']")
	private List<WebElement> items;
	
	@FindBy(xpath = "//select/option[2]")
	private WebElement dropdownlist;
	
	@FindBy(xpath ="//input[@name='embedname']")
	private WebElement textbox;
	
	@FindBy(xpath ="//button")
	private WebElement btn;
	
	public void create() {
		try {
			
			WebDriverWait wait = new WebDriverWait(Driver.driver, 30);
			
			while(!Driver.driver.getCurrentUrl().contains("library"))
			{
				wait.until(ExpectedConditions.visibilityOfAllElements(items));				
			}
						
			waitForXpathPresent("//a[@id='create']");
			wait.until(ExpectedConditions.elementToBeClickable(Create)).click();

			waitForPageToLoad();
			
			waitForXpathPresent("//select/option[2]");
			
			dropdownlist.click();
			Thread.sleep(2000);
			textbox.sendKeys(Constants.embedname);
			Thread.sleep(2000);
			btn.click();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
