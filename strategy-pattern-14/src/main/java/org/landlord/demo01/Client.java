package org.landlord.demo01;

/**
 * @description:
 * @author: landlord
 * @date: 2024/12/10 17:54
 */
public class Client {
    public static void main(String[] args) {
        ConcreteStrategyA strategyA = new ConcreteStrategyA();
        Context context = new Context(strategyA); //可以在运行时指定类型,通过配置文件+反射机制实现
        context.algorithm();
    }
}
