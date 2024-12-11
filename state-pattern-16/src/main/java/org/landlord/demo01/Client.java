package org.landlord.demo01;

/**
 * @description:
 * @author: landlord
 * @date: 2024/12/11 13:06
 */
public class Client {

    public static void main(String[] args) {

        Context context = new Context();

        State state1 = new ConcreteStateA();
        state1.handle(context);
        System.out.println(context.getCurrentState().toString());

        System.out.println("========================");

        State state2 = new ConcreteStateB();
        state2.handle(context);
        System.out.println(context.getCurrentState().toString());
    }
}
