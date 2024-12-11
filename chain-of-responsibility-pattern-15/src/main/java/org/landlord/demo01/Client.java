package org.landlord.demo01;

/**
 * @description:
 * @author: landlord
 * @date: 2024/12/11 13:11
 */
public class Client {

    public static void main(String[] args) {
        RequestData requestData = new RequestData("处理数据：ABCD");

        HandlerA handlerA = new HandlerA();
        HandlerB handlerB = new HandlerB();
        HandlerC handlerC = new HandlerC();
        handlerA.setNext(handlerB);
        handlerB.setNext(handlerC);
        handlerA.handle(requestData);
    }
}
