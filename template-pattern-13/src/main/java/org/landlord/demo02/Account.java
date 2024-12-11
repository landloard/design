package org.landlord.demo02;

/**
 * @description:
 * @author: landlord
 * @date: 2024/12/10 17:34
 */
public abstract class Account {

    //step1 具体方法-验证用户信息是否正确
    public boolean validate(String username, String password) {
        System.out.println("账号: " + username + ",密码: " + password);
        if (username.equalsIgnoreCase("admin") &&
                password.equals("123456")) {
            return true;
        } else {
            return false;
        }
    }

    //step2 抽象方法-计算利息
    public abstract void calculate() ;

    //step3 具体方法-显示利息
    public void display(){
        System.out.println("显示利息！");
    }

    //模板方法
    public  void handle(String account, String password) {
        if (!validate(account, password)) {
            System.out.println("账户或密码错误!!");
            return;
        }
        calculate();
        display();
    };
}
