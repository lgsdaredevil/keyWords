package com.keywords.pri;

/**
 * @author gsliu
 * @date 2018-05-22 14:10
 */
public class JavaPrivate {

    private void privateTest(){
        System.out.print("this is private method!\n");
    }

    public void getPrivate(){
        this.privateTest();
    }

}
