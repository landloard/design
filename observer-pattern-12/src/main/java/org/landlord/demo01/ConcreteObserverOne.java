package org.landlord.demo01;

/**
 * @description:
 * @author: landlord
 * @date: 2024/12/10 16:34
 */
public class ConcreteObserverOne implements Observer {
    @Override
    public void update() {
        //获取消息通知,执行业务代码
        System.out.println("ConcreteObserverOne 得到通知!");
    }
}
