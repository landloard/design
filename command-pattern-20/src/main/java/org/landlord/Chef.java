package org.landlord;

/**
 * 厨师类 -> Receiver角色
 * @author spikeCong
 * @date 2022/10/19
 **/
public class Chef {

    public void makeFood(int num,String foodName){
        System.out.println(num + "份," + foodName);
    }
}
