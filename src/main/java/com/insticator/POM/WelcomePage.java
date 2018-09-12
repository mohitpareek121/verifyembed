package com.insticator.POM;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.genericlib.CommonLibs;

public class WelcomePage extends CommonLibs {
	
	// From New Dashboard & Capture ‘Clients & Sites’ dropdown
    
    
    @FindBy (xpath ="//a[text()='Clients & Sites']")
    private WebElement Clientsitemenu;
    
    @FindBy (xpath ="//a[@href='/admin/mockadminasclient']")
    private WebElement Clientsitemenuoption;
    
    // Mock the Clients	dropdown elements captured
    
    @FindBy (xpath ="//*[@aria-labelledby='select2-clientUUIDForMock-container']")
    private WebElement allclientmenu;
    
    @FindBy (xpath ="//ul[@id='select2-clientUUIDForMock-results']/li[3]")
    private WebElement clientfirstoption;

    // Capture Mock Submit button
    
    @FindBy (xpath ="//button[@id='submitMockBtn']")
    private WebElement mocksubmit;
    
   public boolean isClientsIteMenuDisplayed() {
    	
    	try {
    		return Clientsitemenu.isDisplayed();
    		
    	}catch(NoSuchElementException e) {
    		return false;
    	}
    }
    
    public void clickclientsitemenu()
    {
      
	    Clientsitemenu.click();
	    Clientsitemenuoption.click();
	    waitForPageToLoad();
      
    }
    
    public void allclient()
    {
    	allclientmenu.click();
    	clientfirstoption.click();
    	mocksubmit.click();
    	waitForPageToLoad();
    }

}
