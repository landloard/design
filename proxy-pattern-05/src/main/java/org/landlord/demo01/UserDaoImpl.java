package org.landlord.demo01;

/**
 * @description:
 * @author: landlord
 * @date: 2024/12/5 19:33
 */
public class UserDaoImpl implements IuserDao{
    @Override
    public void save() {
        System.out.println("UserDaoImpl===数据保存");
    }
}
