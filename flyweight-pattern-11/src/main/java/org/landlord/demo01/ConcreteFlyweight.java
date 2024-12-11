package org.landlord.demo01;

/**
 * @description:
 * @author: landlord
 * @date: 2024/12/10 14:36
 */
public class ConcreteFlyweight  extends Flyweight{
    //内部状态 intrinsicState作为成员变量,同一个享元对象的内部状态是一致的
    private String intrinsicState;

    public ConcreteFlyweight(String intrinsicState) {
        this.intrinsicState = intrinsicState;
    }

    /**
     * 外部状态在使用时由外部设置,不保存在享元对象中,即使是同一个对象
     * @param extrinsicState  外部状态,每次调用可以传入不同的外部状态
     */
    @Override
    public void operation(String extrinsicState) {
        System.out.println("=== 享元对象内部状态" + intrinsicState +",外部状态:" + extrinsicState);
    }
}
