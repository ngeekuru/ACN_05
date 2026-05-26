package com.tnsif.day1;

public class elifcond {

	public static void main(String[] args) {
		int marks=28;
		//100-80 - A,50-79-B,35-49-C,<35-Fail
		if(marks>=80 && marks<=100)  //100-80
		{
			System.out.println("A grade");
		}else if(marks>=50 && marks<=79)
		{
			System.out.println("B grade");
		}
		else if(marks>=35 && marks<=49)
		{
			System.out.println("C grade");
		}
		else {
			System.out.println("Fail");
		}
		
	}

}
