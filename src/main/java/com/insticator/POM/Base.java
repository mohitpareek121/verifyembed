package com.insticator.POM;

import org.junit.Before;
import org.openqa.selenium.support.PageFactory;

import com.genericlib.CommonLibs;
import com.genericlib.Constants;
import com.genericlib.Driver;

public class Base extends CommonLibs {

	@Before
	public void init() {
		try {

			// Initialize driver
			Driver.initDriver();

			// Delete cookies
			Driver.driver.manage().deleteAllCookies();

			// Login to the application
			Login homePage = PageFactory.initElements(Driver.driver, Login.class);
			homePage.navigateToApplication(Constants.username, Constants.password, Constants.url);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/*
	 * @After public void tear() { Driver.destroyDriver(); }
	 */
}