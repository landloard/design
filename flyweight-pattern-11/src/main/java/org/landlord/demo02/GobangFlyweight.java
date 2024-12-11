package org.landlord.demo02;

/**
 * @description:
 * @author: landlord
 * @date: 2024/12/10 14:55
 */
public abstract class GobangFlyweight {

    public abstract String  getColor();

    public void display() {
        System.out.println("棋子颜色: "+this.getColor());
    };
}
