package com.String;

public class CharAt {
	public static void main(String[] args) {
		String str="This is beautiful morning";
		char c1=str.charAt(0);
		char c2=str.charAt(5);
		char c3=str.charAt(8);
		System.out.println("0th position of string is "+c1);
		System.out.println("5th position of string is "+c2);
		System.out.println("8th position of string is "+c3);
		System.out.println(str.charAt(10));
	}

}
