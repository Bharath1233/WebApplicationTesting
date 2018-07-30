package com.ConditionalStatement;

public class Nested_IfElse_Example {

	public static void main(String[] args) 
	{
		int a=10;
		int b=20;
		int c=30;
		
		if(a>b)
		{
			System.out.println("a is greater:  "+ a);
			
		}
		else
			if(b>c)
			{
				System.out.println("b is greater : "+ b);
			}
			else
			{
				System.out.println("c is greater");
			}

	}

}
