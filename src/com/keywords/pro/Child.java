package com.keywords.pro;

/**
 * @author gsliu
 * @date 2018-05-22 14:18
 */
public class Child extends Father {

    public void childTest(){
        System.out.print("this is child's method\n");
        super.protectedTest();
    }

}
