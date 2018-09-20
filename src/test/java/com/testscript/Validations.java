package com.testscript;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.equalTo;
import org.junit.Rule;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.rules.ErrorCollector;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.insticator.POM.CustomizeTabOne;

public class Validations extends CustomizeTabOne 

{
	@FindBy (xpath="(//*[text()='quiz'])[1]")
	protected WebElement quiz;
	
	@FindBy (xpath="(//*[text()='poll'])[1]")
	protected WebElement poll;
	
	@FindBy (xpath="(//*[@data-tip='Quiz'])[1]")
	protected WebElement selectedTab;
	
	@Rule
    public ErrorCollector collector = new ErrorCollector();
	
	@Test
	public void validateEmbed() throws Throwable
	{
		
	int countnw = cardcontainer.size();
	int k=0;
	for(int i=0;i<countnw;i++)
	{
		cardcontainer.get(i).click();	
		for(int j=0;j<Format.size();j++)
		{
			if(!Format.get(j).getAttribute("class").contains("in"))
			{
				k=j;
				break;
			}
		}
	// Quiz question (1-4) - title and answer code verification
	if(selectedTab.getAttribute("class").contains("true"))
	{
		switch (k) 
		{
		case 0: 
			 
				collector.checkThat("What is your name?",equalTo(quesOne.getText()));
				collector.checkThat("John",equalTo(ansOne.getText()));
				collector.checkThat("Mark",equalTo(ansTwo.getText()));
				collector.checkThat("Katherine",equalTo(ansThree.getText()));
				Assertions.assertTrue(correctAnswer.isSelected());
			break;
			
		case 1:
			
			try 
			{ 
				Assertions.assertEquals(quesOne.getText(),"Choose any one Image?"); 
			}
			catch(Throwable e) 
			{ 
				collector.addError(e); 
			}
			try 
			{
				Assertions.assertTrue(correctAnswer2.isSelected());
			}
			catch(Throwable e)
			{
				collector.addError(e);
			}
			
			break;
		
		case 2:
			
			try
			{
				Assertions.assertEquals(quesOne.getText(),"Choose any Text answer?");
			}
			catch(Throwable e)
			{
				collector.addError(e);
			}
			try
			{
				Assertions.assertEquals(a1.getText(),"Hello I am John");
			}
			catch(Throwable e)
			{
				collector.addError(e);
			}
			try
			{
				Assertions.assertEquals(a2.getText(),"Hello I am Mark");
			}
			catch(Throwable e)
			{
				collector.addError(e);
			}
			try
			{
				Assertions.assertEquals(a3.getText(),"This download image");
			}
			catch(Throwable e)
			{
				collector.addError(e);
			}
			try
			{
				Assertions.assertTrue(correctansone.isSelected());
			}
			catch(Throwable e)
			{
				collector.addError(e);
			}
			break;
			
		case 3:
			
			try 
			{
				Assertions.assertEquals(quesOne.getText(),"Choose any White background?");
			}
			catch(Throwable e)
			{
				collector.addError(e);
				
			}
			try
			{
				Assertions.assertEquals(a1.getText(),"ABC");
			}
			catch(Throwable e)
			{
				collector.toString();
				collector.addError(e);
			}
			try
			{
				Assertions.assertEquals(a2.getText(),"XYZ");
			}
			catch(Throwable e)
			{
				collector.addError(e);
			}
			try
			{
				Assertions.assertEquals(a3.getText(),"LMP");
			}
			catch(Throwable e)
			{
				collector.addError(e);
			}
			try
			{
				Assertions.assertTrue(correctansone.isSelected());
			}
			catch(Throwable e)
			{
				collector.addError(e);
			}
			break;
			
		}
	}
	// Poll 1-4 - Title and Answer Verification Code
	else
	{
		switch(k)
		{
		case 0:
			
			try
			{
				Assertions.assertEquals(quesOne.getText(),"Animal name?");
			}
			catch(Throwable e)
			{
				collector.addError(e);
			}
			try 
			{
				Assertions.assertEquals(ansOne.getText(),"AAA");
			}
			catch(Throwable e)
			{
				collector.addError(e);
			}
			try
			{
				Assertions.assertEquals(ansTwo.getText(),"BBB");
			}
			catch(Throwable e)
			{
				collector.addError(e);
			}
			try
			{
				Assertions.assertEquals(ansThree.getText(),"CCC");
			}
			catch(Throwable e)
			{
				collector.addError(e);
			}
			break;
			
		case 1:
			
			try
			{
				Assertions.assertEquals(quesOne.getText(),"Large images?");
			}
			catch(Throwable e)
			{
				collector.addError(e);
			}
			break;
			
		case 2:
			
			try
			{
				Assertions.assertEquals(quesOne.getText(),"Poll questions?");
			}
			catch(Throwable e)
			{
				collector.addError(e);
			}
			try
			{
				Assertions.assertEquals(a1.getText(),"Poll one");
			}
			catch(Throwable e)
			{
				collector.addError(e);
			}
			try
			{
				Assertions.assertEquals(a2.getText(),"Poll two");
			}
			catch(Throwable e)
			{
				collector.addError(e);
			}
			try
			{
				Assertions.assertEquals(a3.getText(),"Poll three");
			}
			catch(Throwable e)
			{
				collector.addError(e);
				//System.out.println(e.getMessage());
			}
			break;
			
		case 3:
			
			try
			{
			Assertions.assertEquals(quesOne.getText(),"Poll emojis?");
			}
			catch(Throwable e)
			{
				collector.addError(e);
				
				//System.out.println(e.getMessage());
			}
			break;
		}	
	}
  }
}
}
	
	

