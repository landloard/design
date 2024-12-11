package org.landlord.demo01;

/**
 * @description:
 * @author: landlord
 * @date: 2024/12/10 14:43
 */
public class Client {
    public static void main(String[] args) {
        //获取工厂对象
        FlyweightFactory factory = new FlyweightFactory();

        //通过工厂对象获取共享的享元对象
        Flyweight a1 = factory.getFlyweight("D");
        a1.operation("a1ExState");

        Flyweight a2 = factory.getFlyweight("D");
        a2.operation("a2ExState");
        System.out.println("a1 == a2 : " + (a1 == a2));

        //通过new的方式创建非共享的享元对象
        UnsharedConcreteFlyweight u1 = new UnsharedConcreteFlyweight("A");
        UnsharedConcreteFlyweight u2 = new UnsharedConcreteFlyweight("A");
        u1.operation("1");
        u2.operation("2");
        System.out.println("u1 == u2 : " + (u1 == u2));
    }
}
