package org.landlord.demo01;

/**
 * @description:
 * @author: landlord
 * @date: 2024/12/11 13:08
 */
public class HandlerC extends Handler {

    @Override
    public void handle(RequestData requestData) {
        System.out.println("HandlerC 执行代码逻辑! 处理: " + requestData.getData());
        requestData.setData(requestData.getData().replace("C", ""));

        if (next != null) {
            next.handle(requestData);
        } else {
            System.out.println("执行中止!");
        }
    }
}
