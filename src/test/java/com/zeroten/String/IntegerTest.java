package com.zeroten.String;

import org.junit.Test;

public class IntegerTest {
    @Test
    public void test1(){
        Integer num1 = 127;
        Integer num2 = 127;
        System.out.println(num1 == num2);
        Integer num3 = 128;
        Integer num4 = 128;
        System.out.println(num3 == num4);
        Integer num5 = 127;
        Integer num6 = new Integer(127);
        System.out.println(num5 == num6);
        int num7 = 127;
        Integer num8 = 127;
        System.out.println(num7==num8);
        int num9 = 128;
        Integer num10 = 128;
        System.out.println(num9==num10);
        Double num11 = 127d;
        Double num12 = 127d;
        System.out.println(num11 == num12);
        Double num13 = 128d;
        Double num14 = 128d;
        System.out.println(num13 == num14);
    }


}
