package com.mrxiao.cap04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
* 演示JConsole线程监控
* */
public class JConsoleDemo {

    /*
    * 线程死循环演示
    * */
    public static void createBusyThread() {
        Thread thread = new Thread(() -> {
            while (true) {
                ;
            }
        }, "testBusyThread");
        thread.start();
    }

    /*
    * 线程锁等待演示
    * */
    public static void createLockThread(final Object lock) {
        Thread thread = new Thread(() -> {
            synchronized (lock) {
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "testLockThread");
        thread.start();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        createBusyThread();
        br.readLine();
        Object obj = new Object();
        createLockThread(obj);
    }
}
