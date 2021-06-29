package com.vito.backendexample.mutithread;

import java.text.ParseException;

/**
 * * @Author: Vito
 * * @Date 2020/10/29 13:20
 * @Describe : 多线程执行时会导致线程安全问题，因为calender 会对时间进行set
 **/
public class DateUtilUnsafeTest {
    public static class TestSimpleDateFormatThreadSafe extends Thread {
        @Override
        public void run() {
            while(true) {
                try {
                    this.join(1000);
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                    Thread.currentThread().interrupt();
                }
                try {
//                    System.out.println(this.getName()+":"+DateUtil.formatDate(new Date()));
                    System.out.println(this.getName()+":"+DateUtil.parse("2013-05-24 06:02:20"));
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public static void main(String[] args) {
        for(int i = 0; i < 100; i++){
            new TestSimpleDateFormatThreadSafe().start();
        }

    }

}
