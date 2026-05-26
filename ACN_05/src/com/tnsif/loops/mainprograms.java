package com.tnsif.loops;

public class mainprograms {

	public static void main(String[] args) {
		//reverse of a string
		String s = "nikhitha";
		System.out.println(s.length());
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print(s.charAt(i)); //0-n
		}
		
		//========================================
		int[] arr = {10,32,4,53,18}; //53
		int max = arr[0];
		for (int j=0;j<=arr.length-1;j++)
		{
			if(arr[j]>=max)
			{
				max=arr[j];
			}
			
		}
		System.out.println("the highest value is:"+max);
		
	}

}
