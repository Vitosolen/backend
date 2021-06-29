package com.vito.backendexample.basictype;

import java.util.ArrayList;
import java.util.List;

/**
 * * @Author: Vito
 * * @Date 2020/10/30 16:45
 **/
public class FinalTest {

    protected static final List<String> ARRAY_LIST = new ArrayList<>();
    protected static final int a=123;
    protected static final String str="123";
    public static void main(String[] args) {
        ARRAY_LIST.add("1");
        ARRAY_LIST.add("2");
//        a++;
        str.replace("1","213");
        System.out.printf("a:"+a);
        System.out.printf(ARRAY_LIST.toString());
    }
}
