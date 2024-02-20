package com.bt.string;

public class StringLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("String length wihout inbulit methods");
		
		String s="Rajesh Kumar";
		//add null to given string to count manually
		s=s.concat("\0");
		//hold the value in to char array
		char[]ch=s.toCharArray();
		
		int count=0,i=0;
		//count value of length using while loop
		while(ch[i]!='\0') {
			count++;//to increment the count value
			i++;//check each char
		}
System.out.println(count);
	}

}
