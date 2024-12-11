package org.landlord.demo01;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: landlord
 * @date: 2024/12/10 16:35
 */
public class ConcreteSubject  implements Subject{
    //定义集合,存储所有观察者对象
    private List<Observer> observers = new ArrayList<Observer>();

    //注册方法,向观察者集合中增加一个观察者
    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    //注销方法,用于从观察者集合中删除一个观察者
    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    //通知方法
    @Override
    public void notifyObservers() {
        if(!observers.isEmpty()){
            for(Observer observer : observers){
                observer.update();
            }
        }
    }
}
