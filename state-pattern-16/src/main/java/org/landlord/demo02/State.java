package org.landlord.demo02;

/**
 * 交通灯状态接口
* @author: landlord
* @date: 2024/12/11 
 **/
public interface State {

    void switchToGreen(TrafficLight trafficLight); //切换为绿灯

    void switchToYellow(TrafficLight trafficLight); //切换为黄灯

    void switchToRed(TrafficLight trafficLight); //切换为红灯
}
