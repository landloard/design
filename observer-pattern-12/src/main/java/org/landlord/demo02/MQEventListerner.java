package org.landlord.demo02;

/**
 * @description:
 * @author: landlord
 * @date: 2024/12/10 16:42
 */
public class MQEventListerner implements   EventListener {
    @Override
    public void doEvent(EventResult result) {
        System.out.println("【MQ】发送MQ通知用户ID为: " + result.getuId() +
                ",您的摇号结果如下: " + result.getMsg());
    }
}
