package com.question;

public class Try1 {

	public static void main(String[] args) {
//		test();
		System.out.println("结果： " + new Try1().test());  
	}
	
	static int test(){  
        int i = 1;  
        try {  
            System.out.println("try里面的i : " + i);  
            return i;  
        }finally{  
            System.out.println("进入finally...");  
            ++i;  
            System.out.println("fianlly里面的i : " + i);  
//            return i;  
        }  
    }  

}
