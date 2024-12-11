package org.landlord.demo02;

/**
 * 绿灯状态类
 *
 * @author: landlord
 * @date: 2024/12/11
 **/
public class Green implements State {

    @Override
    public void switchToGreen(TrafficLight trafficLight) {
        System.out.println("已是绿灯无须切换!");
    }

    @Override
    public void switchToYellow(TrafficLight trafficLight) {
        System.out.println("黄灯亮起...时长:10秒!");
    }

    @Override
    public void switchToRed(TrafficLight trafficLight) {
        System.out.println("绿灯不能切换为红灯!");
    }
}
