package com.yyp.referencetest;

import org.junit.Test;

import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;

/**
 * java 引用类型测试
 * 强引用（strong reference）
 * 软引用（soft reference）
 * 弱引用（weak reference)
 * 虚引用（phantom reference）
 */
public class ReferenceTest {


    @Test
    public void weakTest() throws InterruptedException {
        User user = new User();
        user.setName("yyp");

        WeakReference<User> weakReference = new WeakReference<>(user);

        System.out.println("user=" + user);
        System.out.println("weakReference=" + weakReference.get());
        user = null;
        System.out.println("====================================");
        System.out.println("user=" + user);
        System.out.println("weakReference=" + weakReference.get());
        System.out.println("====================================");
        System.gc();
        TimeUnit.SECONDS.sleep(10);
        System.out.println("user=" + user);
        System.out.println("weakReference=" + weakReference.get());
    }

}
