package com.vito.backendexample.basictype;

import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * * @Author: Vito
 * * @Date 2020/10/29 16:09
 * 定义long 变量时，需要在首个数字加上L后缀，避免进行算法运算时丢失精度
 **/
public class BasicTypeDataDemo {
     static final long FILE_EXPIRY = 1000 * 60 * 60 * 480*100L*40000*88000 * 8999*10000*12121L*1212*100;

    public static void main(String[] args) {
//        int a= 1_000;
//        System.out.printf(a+"");
//        check();
//        checkArrayList();
        checkStrReplace();
    }

    public static void check(){
        Boolean a=true;
        int b= Boolean.TRUE.equals(a)?1:0;
        System.out.printf("b:"+b);
    }

    /**
    **@descripe:
    */
    public static void checkArrayList (){
        List<Object> cnNameList=null;
        boolean empty = CollectionUtils.isEmpty(cnNameList);
        System.out.printf("e:"+empty);
    }

    /**
    **@descripe:
    */
    public static void  checkStrReplace (){
        String strA= "abc_masd";
        strA.replaceAll("_","FUCK");
        System.out.printf("s"+strA);
    }
}

