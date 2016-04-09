package com.company;

public class Main {

    public static void main(String[] args) {
	OverloadDemo ob =new OverloadDemo();

        double result;


        ob.test();
        ob.test(10);
        ob.test(10,20);
        result=ob.test(123.125);
        System.out.println("Result of ob.test(123.125)"+result);
    }
}
