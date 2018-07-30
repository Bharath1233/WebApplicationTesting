package com.ArraysExamples;

public class MultiDimensional {

	public static void main(String[] args)
	{
		// dataType ArrayName[][] = new dataType[size][size]
		
		// dataType[][] ArrayName = new dataType[size][size]
		
		String a[][] = new String[2][2];
		
		  a[0][0] = "Selenium";
		 a[0][1] = "Hello";
		 
		 a[1][0]="LoadRunner";
		 a[1][1]="Hii";
		 
		 for(int i=0;i<a.length;i++)
		 {
			 for(int j=0;j<a.length;j++)
			 {
				 System.out.println(a[i][j]);
			 }
		 }
		
		

	}

}
