package org.landlord.demo02;

/**
 * 单例模式 -懒汉式
 */
public class Sigleton_02 {
    //用于存储单一实例的静态对象
    private static Sigleton_02 instance;

    //私有的构造方法
    private Sigleton_02() {
    }

    public static Sigleton_02 getInstance() {
        if (instance == null) {
            instance = new Sigleton_02();
        }
        return instance;
    }
}
