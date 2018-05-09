package com.question;

public class AutoUnboxingTest {

	public static void main(String[] args) {
		Integer a = new Integer(3);
        Integer b = 3;                  // 将3自动装箱成Integer类型
        int c = 3;
        Integer d = 3;
        System.out.println(a == b);     // false 两个引用没有引用同一对象
        System.out.println(a == c);     // true a自动拆箱成int类型再和c比较
        System.out.println(b == d);

        Integer f1 = 100, f2 = 100, f3 = 150, f4 = 150;
        
        System.out.println(f1 == f2);
        System.out.println(f3 == f4);

        System.out.println(Math.round(11.5));
        System.out.println(Math.round(-11.5));
	}

}
