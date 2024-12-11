package org.landlord.demo01;

/**
 * @description:
 * @author: landlord
 * @date: 2024/12/10 17:32
 */
public class Client {
    public static void main(String[] args) {
        ConcreteClassA concreteClassA = new ConcreteClassA();
        concreteClassA.run("x");

        System.out.println("=====================================");
        ConcreteClassA concreteClassB = new ConcreteClassA();
        concreteClassB.run("");
    }
}
