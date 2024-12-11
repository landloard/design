package org.landlord.demo01;

import org.junit.jupiter.api.Test;

/**
 * @description: 静态代理
 * @author: landlord
 * @date: 2024/12/5 19:36
 */
public class Client {

    @Test
    public void testStaticProxy(){
        UserDaoImpl userDao = new UserDaoImpl();
        UserDaoProxy userDaoProxy = new UserDaoProxy(userDao);
        userDaoProxy.save();
    }
}
