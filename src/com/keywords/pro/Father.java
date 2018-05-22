package com.keywords.pro;

/**
 * @author gsliu
 * @date 2018-05-22 14:16
 */
public class Father {

    protected void protectedTest(){
        System.out.print("this is father's protected method!\n");
    }

    private void privateFather(){
        System.out.print("this is father's private method!\n");
    }

    public void fatherTest(){
        this.privateFather();
        this.protectedTest();
    }

}
