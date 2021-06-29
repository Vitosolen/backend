package com.vito.backendexample.object;

import lombok.Data;

/**
 * @Description TODO
 * @Date 2021/5/20 16:13
 * @Created by vito
 */
@Data
public class ObjectTest {
    private String key ;
    private String value;

    public ObjectTest(String key, String value) {
        this.key = key;
        this.value = value;
    }
}
