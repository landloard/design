package org.landlord.demo01;

/**
 * @description:
 * @author: landlord
 * @date: 2024/12/10 17:53
 */
public class ConcreteStrategyB implements Strategy {
    @Override
    public void algorithm() {
        System.out.println("执行策略B");
    }
}
