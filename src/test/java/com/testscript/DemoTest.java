package com.testscript;

import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

import com.genericlib.Driver;
import com.insticator.POM.Base;
import com.insticator.POM.CustomizeTabOne;
import com.insticator.POM.Dashboard;
import com.insticator.POM.MkResearch;
import com.insticator.POM.Placement;
import com.insticator.POM.WelcomePage;


public class DemoTest extends Base {
	
	@Test
	public void demoTest() throws InterruptedException {

		try {
			
			// Click on [Menu Items] on Welcome Page
			WelcomePage welcome = PageFactory.initElements(Driver.driver, WelcomePage.class);
				
				if (welcome.isClientsIteMenuDisplayed()) 
				{
					
					welcome.clickclientsitemenu();
					
					welcome.allclient();
				}
						
			Dashboard db = PageFactory.initElements(Driver.driver, Dashboard.class);
			db.clicklink();
			
			waitForPageToLoad();

			MkResearch mr = PageFactory.initElements(Driver.driver, MkResearch.class);
			mr.create();
			
			Placement placement = PageFactory.initElements(Driver.driver, Placement.class);
			placement.clickcontent();
			
			
			CustomizeTabOne custom = PageFactory.initElements(Driver.driver, CustomizeTabOne.class);
			custom.QuizQuestion();
			
			Validations vq = PageFactory.initElements(Driver.driver, Validations.class);
			vq.validateEmbed();
			
			//TestRunner run = new TestRunner();
			
		} catch (Throwable e) {
			e.getMessage();
			e.printStackTrace();
			
			}
	}

}
