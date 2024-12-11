package org.landlord.demo05;

public class Singleton_05 {
    private static class SingletonHandler{
        private static Singleton_05 instance = new Singleton_05();
    }
    private Singleton_05(){
        if(SingletonHandler.instance != null){
            throw new RuntimeException("不允许非法访问");
        }
    }
    public static Singleton_05 getInstance(){
        return SingletonHandler.instance;
    }
}
