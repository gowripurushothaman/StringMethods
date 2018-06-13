package com.String;

public class EqualsMethod {
	public static void main(String[] args) {
		String str1="hello";
		String str2="hi";
		String str3="hello";
		String str4="HELLO";
		//boolean equals(String str): Case sensitive comparison
		//boolean equalsIgnoreCase(String str): Case in-sensitive comparison
		System.out.println(str1.equals(str2));//case sensitive comparision
		System.out.println(str2.equals(str3));
		System.out.println(str1.equals(str3));
		System.out.println(str1.equalsIgnoreCase(str4));//case insensitive comparision
		
	}

}
