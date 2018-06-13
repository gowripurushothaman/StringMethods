package com.String;

public class CompareTo {
	public static void main(String[] args) {
		String s1="good";
		String s2="good";
		String s3="hello";
		String s4="Hello";
		String s5="";
		String s6="ab";
		System.out.println(s1.compareTo(s2));//both are same return 0
		System.out.println(s1.compareTo(s5));//if string compare with null string it return the string length
		System.out.println(s1.compareTo(s3));//if both are different and first<second return negative value(g,h->1 position from g)
		System.out.println(s3.equalsIgnoreCase(s4));//equlas ingnore case is insenstive
		System.out.println(s1.compareTo(s6));//s1>s6 and a->g is 6
	    /*if s1 > s2, it returns positive number  
	    if s1 < s2, it returns negative number  
	    if s1 == s2, it returns 0  */
	}

}
