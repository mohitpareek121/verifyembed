package com.testscript;

import org.junit.rules.ErrorCollector;
import org.junit.runner.JUnitCore;		
import org.junit.runner.Result;		
import org.junit.runner.notification.Failure;

	public class TestRunner extends ErrorCollector
	{	
			public static void main (String[] args)
			{
				Result result = JUnitCore.runClasses(DemoTest.class);
			
				for (Failure failure : result.getFailures())
				{							
					 System.out.println(failure.toString());					
				}		
			System.out.println("Result=="+result.wasSuccessful());	
			}
	   }		
	     

