package org.landlord.demo02;

/**
 * @description:
 * @author: landlord
 * @date: 2024/12/10 16:53
 */
public abstract class LotteryService {
    private EventManager eventManager;

    public LotteryService() {
        eventManager = new EventManager(EventManager.EventType.MQ,EventManager.EventType.MESSAGE);

        eventManager.subsctibe(EventManager.EventType.MQ,new MQEventListerner());
        eventManager.subsctibe(EventManager.EventType.MESSAGE,new MessageEventListerner());
    }

    public EventResult lotteryAndMsg(String uId){
       EventResult result =  lottery(uId);
       //发送通知
       eventManager.notify(EventManager.EventType.MESSAGE,result);
       eventManager.notify(EventManager.EventType.MQ,result);
       return result;
    }

    public abstract EventResult lottery(String uId);
}
