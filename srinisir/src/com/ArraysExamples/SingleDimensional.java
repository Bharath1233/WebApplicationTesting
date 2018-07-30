package com.ArraysExamples;

public class SingleDimensional {

	public static void main(String[] args) 
	{
		/*int i=10;
		i=20;
		System.out.println(i);*/
		
		/*dataType[] ArrayName = new dataType[size]
		dataType ArrayName[] = new dataType[size]*/	

		int a[] = new int[3];
		
		// array index starts with 0
		
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		//a[3]=40;
		
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
	}

}
