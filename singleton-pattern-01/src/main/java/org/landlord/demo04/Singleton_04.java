package org.landlord.demo04;

public class Singleton_04 {
    //使用 volatile保证变量的可见性
    private volatile static Singleton_04 instance = null;

    private Singleton_04(){
    }

    //对外提供静态方法获取对象
    public static Singleton_04 getInstance(){
        //第一次判断,如果instance不为null,不进入抢锁阶段,直接返回实例
        if(instance == null){
            synchronized (Singleton_04.class){
                //抢到锁之后再次进行判断是否为null
                if(instance == null){
                    instance = new Singleton_04();
                }
            }
        }

        return instance;
    }
}
