package org.landlord;

import java.util.Set;

/**
 * 具体命令
 * @author spikeCong
 * @date 2022/10/19
 **/
public class OrderCommand implements Command {

    //持有接收者对象
    private Chef receiver;

    private Order order;

    public OrderCommand(Chef receiver, Order order) {
        this.receiver = receiver;
        this.order = order;
    }

    @Override
    public void execute() {
        System.out.println(order.getDiningTable() + "桌的订单: ");
        Set<String> keys = order.getFoodMenu().keySet();
        for (String key : keys) {
            receiver.makeFood(order.getFoodMenu().get(key),key);
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(order.getDiningTable() + "桌的菜已上齐.");
    }
}
