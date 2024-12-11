package org.landlord.demo01;

/**
 * @description:
 * @author: landlord
 * @date: 2024/12/10 12:02
 */
public class PayFaceMode  implements  IPayMode{
    @Override
    public boolean security(String uId) {
        System.out.println("人脸支付,风控校验-脸部识别");
        return true;
    }
}
