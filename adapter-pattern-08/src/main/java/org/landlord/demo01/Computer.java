package org.landlord.demo01;

/**
 * @description:
 * @author: landlord
 * @date: 2024/12/10 13:02
 */
public class Computer {
    public String read(SDCard sdCard){
        if(sdCard == null){
            throw new NullPointerException("sdCard is null");
        }

        return sdCard.readSD();
    }
}
