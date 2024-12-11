package org.landlord.demo02;

/**
 * 抽象同事类
 * @author: landlord
 * @date: 2024/12/11
 **/
public abstract class Person {

    protected String name;

    protected Mediator mediator;

    public Person(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }
}
