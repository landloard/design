package org.landlord.demo01;

/**
 * @description:
 * @author: landlord
 * @date: 2024/12/10 12:01
 */
public class PayCypher implements IPayMode{
    @Override
    public boolean security(String uId) {
        System.out.println("密码支付,风控校验-环境安全");
        return false;
    }
}
