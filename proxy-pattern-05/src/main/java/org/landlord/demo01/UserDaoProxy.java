package org.landlord.demo01;

/**
 * @description:
 * @author: landlord
 * @date: 2024/12/5 19:34
 */
public class UserDaoProxy implements IuserDao{
    IuserDao target = null; ;

    public UserDaoProxy(IuserDao userDao) {
        this.target = userDao;
    }

    @Override
    public void save() {
        target.save();
    }
}
