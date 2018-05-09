package com.question;

public class Reverse1 {

	public static void main(String[] args) {
		String str = "abcdefg";
		method1(str);
		method2(str);
	}
	public static void method1(String str) {
		StringBuffer sb = new StringBuffer();
		String s = sb.append(str).reverse().toString();
		System.out.println(s);
	}
	public static void method2(String str) {
		char[] c = str.toCharArray();
		String s = "";
		for (int i = c.length-1; i >= 0; i--) {
			s += c[i];
		}
		System.out.println(s);
	}
}
