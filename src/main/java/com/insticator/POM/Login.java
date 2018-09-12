package com.insticator.POM;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import com.genericlib.CommonLibs;
import com.genericlib.Driver;

public class Login extends CommonLibs {
	
    //Admin Panel variable capturing and storing in a private variable
	
    @FindBy (name = "username")
    private WebElement Username;
  
    @FindBy (name = "password")
    private WebElement Password;
    
    @FindBy (id = "logInButton")
    private WebElement Loginbutton;
    
    
    public void navigateToApplication(String username, String password, String url)
    {
    	try {
      
	      Driver.driver.get(url);
	      maximizePage();
	      Username.sendKeys(username);
	      Password.sendKeys(password);
	      Loginbutton.click();
	      waitForPageToLoad();
    	}
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    
    }
