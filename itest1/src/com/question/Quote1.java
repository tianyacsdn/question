package com.question;

public class Quote1 {
	public static void swap(int x, int y) {
        int temp = x;
        x = y;
        y = temp;
    }

	public static void main(String[] args) {
		int a = 5, b = 10;
		swap(a, b);
		System.out.println("a = "+a + "\t b = " +b);
	}

}
