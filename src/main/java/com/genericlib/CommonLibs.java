package com.genericlib;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonLibs {

	public void waitForPageToLoad()

	{
		Driver.driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
	}

	public void maximizePage()

	{
		Driver.driver.manage().window().maximize();
	}

	public void waitForPageToLoadByThread() throws InterruptedException
	{
		Thread.sleep(2000);
	}

	public void waitForXpathPresent(String wbXpath)

	{
		WebDriverWait wait = new WebDriverWait(Driver.driver, 40);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(wbXpath)));
	}
	
	
	public boolean verifyText(WebElement wb, String expectedText)

	{

		boolean flag = false;

		String actualText = wb.getText();

		if (expectedText.equals(actualText)) {

			flag = true;

			System.out.println(expectedText + " data is verified == PASS");

		} else {

			System.out.println(expectedText + " data is not verified == FAIL");

		}

		return flag;

	}

	public void acceptAlert() {

		Alert alert = Driver.driver.switchTo().alert();

		alert.accept();

	}

	public void cancelAlert() {

		Alert alert = Driver.driver.switchTo().alert();

		alert.dismiss();
	}

	public void switchTabs() {
		String parentwindow = Driver.driver.getWindowHandle();

		Set<String> allwindows = Driver.driver.getWindowHandles();

		for (String child : allwindows) {
			if (!parentwindow.equalsIgnoreCase(child)) {
				Driver.driver.switchTo().window(child);
			}
		}

	}

	public String getTab() {

		ArrayList<String> windowHandles = new ArrayList<String>(Driver.driver.getWindowHandles());

		String window = windowHandles.get(1);
		
		return window;

	}

	public void setListId(WebElement element) {

		Select sel = new Select(element);

		List<WebElement> list = sel.getOptions();

		// if dropdown list is multi select

		if (sel.isMultiple()) {
			int count = list.size();

			for (int i = 0; i < count; i++) {
				sel.selectByIndex(i);

			}
		} else {
			sel.selectByIndex(0);

		}

	}

}
