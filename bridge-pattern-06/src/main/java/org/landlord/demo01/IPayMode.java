package org.landlord.demo01;

/**
 * @description:
 * @author: landlord
 * @date: 2024/12/10 11:55
 */
public interface IPayMode {

    //安全校验功能，对各种支付模式及逆行风险控制
    boolean security(String uId);
}
