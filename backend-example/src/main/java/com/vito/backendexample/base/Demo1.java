package com.vito.backendexample.base;

/**
 * @Description TODO
 * @Date 2021/5/8 10:31
 * @Created by vito
 */
public interface Demo1 {


    default void test(){
        System.out.println("123");
    }
}
