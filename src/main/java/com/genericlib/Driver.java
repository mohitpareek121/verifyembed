package com.genericlib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {

	public static WebDriver driver;

	/*
	 * This method will initialize driver object
	 */
	public static WebDriver initDriver()

	{
		if (Constants.browser.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver", "src\\resources\\chromedriver.exe");
			
			
			driver = new ChromeDriver();

		} else if (Constants.browser.equalsIgnoreCase("firefox")) {

			System.setProperty("webdriver.firefox.driver", "src\\resources\\geckodriver.exe");

			driver = new FirefoxDriver();

		}

		else if (Constants.browser.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.Edge.driver",
					"F:\\Eclipse_WorkSpace\\Selenium\\Drivers\\Edge\\MicrosoftWebDriver.exe");

			driver = new EdgeDriver();

		}
		return driver;

	}

	/*
	 * This method will destroy driver object
	 */
	public static void destroyDriver() {
		driver.quit();
	}

}
