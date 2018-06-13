package com.String;

public class StringMethods {
	public static void main(String args[]) {
		String s1="ABCDE";
		byte[] s2=s1.getBytes();//getByte()->to get byte values
		for(int i=0;i<s1.length();i++) {
			System.out.println(s2[i]);
		}
		//getchars()
		String s="Hi,how are you?";
		char c[]=new char[3];
		
		s.getChars(3, 6, c, 0);
		System.out.println(c);
		//intern()
		String str1="hello";//string literal
		String str2=new String("hi");//string object
		String str3=str1.intern();//string literal
		System.out.println(str1==str2);//object reference is differnet
		System.out.println(str1==str3);//object reference is same
		}
	
     
}
