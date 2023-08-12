package org.ex;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.IOException;

public class ExceptionDemo {
	public static void main(String[] args)   {
		int age = 20;
		if (age <= 18);{
		System.out.println("eligible to vote");
		}
		{
		 
			try {
				throw new AgeIncorrectException();
			} catch (AgeIncorrectException e) {
			System.out.println("Age invalid");
			}
		}
	
	}
}
