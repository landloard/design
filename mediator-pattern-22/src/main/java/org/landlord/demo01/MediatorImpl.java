package org.landlord.demo01;

/**
 * @author: landlord
 * @date: 2024/12/11
 **/
public class MediatorImpl implements Mediator {

    @Override
    public void apply(String key) {
        System.out.println("最终中介者执行操作,key为: " + key);
    }
}
