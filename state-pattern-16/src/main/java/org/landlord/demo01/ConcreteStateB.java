package org.landlord.demo01;

/**
 * @description:
 * @author: landlord
 * @date: 2024/12/11 13:06
 */
public class ConcreteStateB implements State{

    @Override
    public void handle(Context context) {
        System.out.println("进入状态模式B......");
        context.setCurrentState(this);
    }

    @Override
    public String toString() {
        return "当前状态: ConcreteStateB";
    }
}
