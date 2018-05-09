package com.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AddMoneyThread1 implements Runnable {
	private Account1 account;    // 存入账户
    private double money;       // 存入金额
 
    public AddMoneyThread1(Account1 account, double money) {
        this.account = account;
        this.money = money;
    }
 
    @Override
    public void run() {
        account.deposit(money);
    }

    public static void main(String args[]) {
    	Account1 account = new Account1();
        ExecutorService service = Executors.newFixedThreadPool(100);
 
        for(int i = 1; i <= 100; i++) {
            service.execute(new AddMoneyThread1(account, 1));
        }
 
        service.shutdown();
 
        while(!service.isTerminated()) {}
 
        System.out.println("账户余额: " + account.getBalance());

    }
}
