package com.vito.backendexample.log;

import lombok.extern.slf4j.Slf4j;

/**
 * * @Author: Vito
 * * @Date 2020/10/30 16:23
 **/
@Slf4j
public class LogTest {
    public static void main(String[] args) {
        try {
            int a=8/3;
            log.info("api:{simple-file-upload},test:{}",a);
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
