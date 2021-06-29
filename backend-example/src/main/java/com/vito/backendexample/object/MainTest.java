package com.vito.backendexample.object;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @Description TODO
 * @Date 2021/5/20 16:14
 * @Created by vito
 */
public class MainTest {

    public static void main(String[] args) {
        List<ObjectTest> list = new ArrayList<>();
        list.add(new ObjectTest("1", "1"));
        list.add(new ObjectTest("2", "2"));
        list.add(new ObjectTest("3", "3"));
        List<ObjectTest> a=new ArrayList<>();
        a.addAll(list);
        a.add(new ObjectTest("4", "344"));
        list.forEach(System.out::println);
        a.forEach(System.out::println);
//        Map<String, ObjectTest> objectTestMap = list.stream().collect(Collectors.toMap(ObjectTest::getKey, v -> v));
//        objectTestMap.get("1").setValue("2");
//        objectTestMap.get("2").setValue("3");
//        list.forEach(System.out::println);

        LinkedList linkedList = new LinkedList();
    }

}
