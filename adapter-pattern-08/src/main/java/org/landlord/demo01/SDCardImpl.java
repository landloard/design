package org.landlord.demo01;

/**
 * @description:
 * @author: landlord
 * @date: 2024/12/10 13:04
 */
public class SDCardImpl implements SDCard{
    @Override
    public String readSD() {
        String msg = "sd card reading data";
        return msg;
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("sd card write data : " + msg);
    }
}
