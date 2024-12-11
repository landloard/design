package org.landlord.demo02;

/**
 * 抽象中介者
 * @author: landlord
 * @date: 2024/12/11
 **/
public abstract class Mediator {

    //申明一个联络方法
    public abstract void contact(String message,Person person);
}
