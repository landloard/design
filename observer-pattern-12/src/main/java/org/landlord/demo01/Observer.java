package org.landlord.demo01;

/**
 * @description: 抽象观察者
 * @author: landlord
 * @date: 2024/12/10 16:34
 */
public interface Observer {
    //update方法: 为不同观察者的更新(响应)行为定义相同的接口,不同的观察者对该方法有不同的实现
    public void update();
}
