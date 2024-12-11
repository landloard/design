package org.landlord.demo02;

/**
 * @description:
 * @author: landlord
 * @date: 2024/12/10 16:42
 */
public class MessageEventListerner implements   EventListener {
    @Override
    public void doEvent(EventResult result) {
        System.out.println("发送短信通知用户ID为: " + result.getuId() +
                ",您的摇号结果如下: " + result.getMsg());
    }
}
