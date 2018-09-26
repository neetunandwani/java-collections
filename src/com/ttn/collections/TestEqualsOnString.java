package com.ttn.collections;

public class TestEqualsOnString {

    public void test(){
        String s1 = "TTN";
        String s2 = new String("TTN");

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));


        s2 = "TTN";

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        s1 = new String("TTN");
        s2 = new String("TTN");

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }
}
