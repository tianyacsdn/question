package com.question;

public class Outer {
	class Inner {}

    public static void foo() { 
//    	new Inner();
    	new Outer().new Inner();
    }

    public void bar() { new Inner(); }

    public static void main(String[] args) {
//        new Inner();
    	new Outer().new Inner();

    }
}
