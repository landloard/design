package org.landlord.demo01;

/**
 * @description:
 * @author: landlord
 * @date: 2024/12/10 13:04
 */
public class TFCardImpl implements TFCard{
    @Override
    public String readTF() {
        String msg = "TF card reading data";
        return msg;
    }

    @Override
    public void writeTF(String msg) {
        System.out.println("TF card write data : " + msg);
    }
}
