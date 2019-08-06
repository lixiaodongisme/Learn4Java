package com.mrxiao.cap04;

/*
* 演示通过JConsole监控死锁
* */
public class DeadLockDemo implements Runnable{
    int a = 0;
    int b = 0;

    public DeadLockDemo(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void run() {
        synchronized (Integer.valueOf(a)) {
            synchronized (Integer.valueOf(b)) {
                System.out.println(a + b);
            }
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(new DeadLockDemo(1, 2)).start();
            new Thread(new DeadLockDemo(2, 1)).start();
        }
    }
}
