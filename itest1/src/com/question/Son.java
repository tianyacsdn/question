package com.question;

public class Son extends Super {
	public void e() {
		System.out.println("eeeee");
	}
	public static void main(String args[]) {
        Super s = new Super();
        Son son = new Son();
//        Super.a();//B错误，因a为私有的类方法，外类不可访问
        Super.b();//b为公有类方法，外类可用 类名.方法名 访问
        s.c();//c为公有实例方法，外类可用 实例名.方法名 访问
//        s.d();//A错误，因d为私有实例方法，外类不可访问
//        s.e();//C错误，实例方法不可直接调用其他类的类方法
    }

}
