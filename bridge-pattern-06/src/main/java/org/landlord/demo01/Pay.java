package org.landlord.demo01;

import java.math.BigDecimal;

/**
 * @description:
 * @author: landlord
 * @date: 2024/12/10 11:58
 */
public  abstract  class   Pay {

    //桥接对象
    protected  IPayMode payMode;

    public  Pay(IPayMode payMode) {
        this.payMode = payMode;
    }

    //划账功能
    public abstract String transfer(String uId, String tradeId, BigDecimal amount);
}
