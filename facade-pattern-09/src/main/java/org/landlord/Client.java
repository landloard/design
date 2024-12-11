package org.landlord;

import org.landlord.demo01.SmartAppliancesFacade;

/**
 * @description:
 * @author: landlord
 * @date: 2024/12/10 14:03
 */
public class Client {
    public static void main(String[] args) {

        SmartAppliancesFacade facade = new SmartAppliancesFacade();
        facade.say("打开");
        System.out.println("=======================================");
        facade.say("关闭");
    }
}