package org.landlord.demo02;

import org.junit.jupiter.api.Test;



/**
 * @description: 动态代理
 * @author: landlord
 * @date: 2024/12/5 19:36
 */
public class Client {

    @Test
    public void testProxy(){
        IuserDao target = new UserDaoImpl(); //目标对象

        IuserDao userDaoProxy = (IuserDao) new ProxyFactory(target).getProxyInstance(); // 代理对象

        userDaoProxy.save();

    }
}
