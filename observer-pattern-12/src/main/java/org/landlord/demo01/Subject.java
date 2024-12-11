package org.landlord.demo01;

/**
 * @description: 抽象目标类
 * @author: landlord
 * @date: 2024/12/10 16:33
 */
public interface Subject {
    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObservers();
}
