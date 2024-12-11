package org.landlord.demo01;

/**
 * @description:
 * @author: landlord
 * @date: 2024/12/10 14:38
 */
public class UnsharedConcreteFlyweight extends Flyweight{
    private String intrinsicState;

    public UnsharedConcreteFlyweight(String intrinsicState) {
        this.intrinsicState = intrinsicState;
    }

    @Override
    public void operation(String extrinsicState) {
        System.out.println("=== 使用不共享对象,内部状态: " + intrinsicState +",外部状态: " + extrinsicState);
    }
}
