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
        Child child = new Child();
        child.childTest();
        // 父类对象引用子类不可以调用父类的protected方法
        Father father = new Child();
        father.fatherTest();
    }

}
