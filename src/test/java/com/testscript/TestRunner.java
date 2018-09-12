package com.testscript;

	import org.junit.runner.JUnitCore;		
	import org.junit.runner.Result;		
	import org.junit.runner.notification.Failure;	
	import org.junit.Test;
	public class TestRunner 
	{	
		@Test
		public void runner()
		{
			Result result = JUnitCore.runClasses(Validations.class);					
				
				for (Failure failure : result.getFailures())
				{							
					 System.out.println(failure.toString());					
				}		
			System.out.println("Result=="+result.wasSuccessful());							
	   }		
	}      

