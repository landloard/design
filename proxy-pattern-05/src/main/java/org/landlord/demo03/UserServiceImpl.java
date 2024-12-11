package org.landlord.demo03;

import java.util.Collections;
import java.util.List;


public class UserServiceImpl {

    public List<User> findUserList(){

        return Collections.singletonList(new User("landlord",18));
    }
}
