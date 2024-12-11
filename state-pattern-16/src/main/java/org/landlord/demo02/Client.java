package org.landlord.demo02;

/**
* @author: landlord
* @date: 2024/12/11 
 **/
public class Client {

    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight();
        trafficLight.switchToYellow();
        trafficLight.switchToGreen();
        trafficLight.switchToRed();
    }
}
