package com.zeroten.String;

import org.junit.Test;

public class StringTest {

    @Test
    public void test字符串内存使用(){
        String str1 = "hello";
        String str2 = "hello";
        System.out.println(str1 == str2);
        String str3 = "hello world";
        String str4 = str1+ " world";
        System.out.println(str3 == str4);
        String str5 = "hello";
        String str6 = "hello";
        System.out.println(str5 == str6);
        String str7 = str6.intern();
        System.out.println(str1==str7);
    }






}
