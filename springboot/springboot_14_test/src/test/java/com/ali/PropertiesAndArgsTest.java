package com.ali;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(properties = {"test.prop=testValue1"}, args = {"--test.prop=testValue2"})
public class PropertiesAndArgsTest {

    @Value("${test.prop}")
    private String msg;

    @Value("${testcase.book.id}")
    private int id;
    @Test
    void testProperties(){
//        System.out.println(msg);
        System.out.println(id);
    }



}
