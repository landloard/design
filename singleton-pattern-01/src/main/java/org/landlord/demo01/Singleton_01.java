package org.landlord.demo01;

/**
 * 单例模式-饿汉式
 *  *    在类加载期间初始化静态实例,保证实例的创建是线程安全的.
 *  *      特点: 不支持延迟加载实例(懒加载) , 此中方式类加载比较慢，但是获取实例对象比较快
 *  *      问题: 该对象足够大的话，而一直没有使用就会造成内存的浪费
 */
public class Singleton_01 {

    // 1、私有构造方法
    private  Singleton_01 (){

    }

    //2、在本类中创建对象
    private static Singleton_01 instance = new Singleton_01();

    //3. 提供一个公共的访问方式,供外部访问 获取到单例对象
    public static Singleton_01 getInstance() {
        return instance;
    }
}
