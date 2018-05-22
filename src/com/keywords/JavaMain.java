package com.keywords;

import com.keywords.pri.JavaPrivate;
import com.keywords.pro.Child;
import com.keywords.pro.Father;
import com.keywords.pub.JavaPublic;

/**
 * @author gsliu
 * @date 2018-05-22 14:11
 */
public class JavaMain {

    public static void main(String[] args){
        JavaPublic javaPublic = new JavaPublic();
        javaPublic.publicTest();
        JavaPrivate javaPrivate = new JavaPrivate();
        javaPrivate.getPrivate();
        Child father = new Child();
        father.childTest();
    }

}
