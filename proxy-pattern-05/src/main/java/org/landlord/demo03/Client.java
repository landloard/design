package org.landlord.demo03;

import com.alibaba.fastjson.JSONObject;

import java.util.List;

/**
 * @description:
 * @author: landlord
 * @date: 2024/12/5 21:03
 */
public class Client {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();

        UserServiceImpl userLogProxy = (UserServiceImpl) new UserLogProxy().getLogProxy(userService);

        List<User> userList = userLogProxy.findUserList();

        System.out.println("用户信息："+ JSONObject.toJSON(userList));

    }
}
