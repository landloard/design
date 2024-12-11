package org.landlord.demo02;

/**
 * @description:
 * @author: landlord
 * @date: 2024/12/10 17:03
 */
public class Client {
    public static void main(String[] args) {
        LotteryService ls = new LotteryServiceImpl();
        EventResult result  = ls.lotteryAndMsg("1234567887654322");
        System.out.println(result);
    }
}
