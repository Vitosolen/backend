package com.vito.backendexample.base.extend;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description TODO
 * @Date 2021/5/8 11:13
 * @Created by vito
 */
public class ExtendDemo1 implements Cloneable{
    protected void say(){
        System.out.println("hello");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    private void doing(){
        System.out.println("doing ");
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        ExtendDemo1 a =new ExtendDemo1();
        System.out.println(a);
        Object clone = a.clone();
        System.out.println(clone);
        System.out.println(3*0.1==0.3);
        List list = new ArrayList();
        list.add(1);
    }
}
