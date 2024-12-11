package org.landlord.demo03;

import org.landlord.demo02.Sigleton_02;

public class Singleton_03 {
    //用于存储单一实例的静态对象
    private static Singleton_03 instance;

    //私有的构造方法
    private Singleton_03() {
    }

    //添加synchronize,保证多线程模式下的单例对象的唯一性
    public static synchronized Singleton_03  getInstance() {
        if (instance == null) {
            instance = new Singleton_03();
        }
        return instance;
    }
}
