package org.landlord.demo01;

import com.alibaba.fastjson.JSON;
import org.landlord.demo01.builder.BikeBuilder;
import org.landlord.demo01.builder.HelloBikeBuilder;
import org.landlord.demo01.director.Director;

public class Client {
    public static void main(String[] args) {
        BikeBuilder helloBikeBuilder = new HelloBikeBuilder();
        Director director = new Director(helloBikeBuilder);
        System.out.println(JSON.toJSON(director.constructBike()));
    }
}
