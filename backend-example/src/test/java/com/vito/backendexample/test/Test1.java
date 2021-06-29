package com.vito.backendexample.test;


import com.vito.backendexample.base.absract.AbstracDemo;
import com.vito.backendexample.base.absract.Demo1;
import org.junit.jupiter.api.Test;

/**
 * @Description TODO
 * @Date 2021/5/8 10:37
 * @Created by vito
 */
public class Test1 {

    @Test
    public void abstractdemo(){
        AbstracDemo demo1 = new Demo1();
        demo1.func1();
    }
}
