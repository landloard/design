package org.landlord.demo01;

/**
 * 单例模式-饿汉式
 *  *    在类加载期间初始化静态实例,保证实例的创建是线程安全的.
 *  *      特点: 不支持延迟加载实例(懒加载) , 此中方式类加载比较慢，但是获取实例对象比较快
 *  *      问题: 该对象足够大的话，而一直没有使用就会造成内存的浪费
 */
public class Client {

    public static void main(String[] args) {
        Singleton_01 singleton01 = Singleton_01.getInstance();
        Singleton_01 singleton02 = Singleton_01.getInstance();

        System.out.println(singleton01 == singleton02); //true
    }
}
