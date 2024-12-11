package org.landlord.demo01;



/**
 * @description:
 * @author: landlord
 * @date: 2024/12/11 13:06
 */
public class ConcreteStateA implements State {

    @Override
    public void handle(Context context) {
        System.out.println("进入状态模式A......");
        context.setCurrentState(this);
    }

    @Override
    public String toString() {
        return "当前状态: ConcreteStateA";
    }
}
