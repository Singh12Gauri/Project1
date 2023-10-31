package exceptionhandling;

public class WhatisE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int x=10/0;
			
		}
		catch(ArithmeticException e) {
			System.out.println("Catch block code Arithmetic exception");
			System.out.println("Exception is "+e);
		}
		finally
		{
			System.out.println("Finally Block");
		}
		
			System.out.println("After exception");
			
		
	}
	}


