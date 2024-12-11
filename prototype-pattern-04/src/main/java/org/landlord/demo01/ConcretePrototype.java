package org.landlord.demo01;

import java.io.Serializable;

public class ConcretePrototype implements Cloneable, Serializable {

    private Person person;

    public ConcretePrototype() {
        System.out.println("具体的原型对象创建完成!");
    }

    @Override
    public ConcretePrototype clone() {
        try {
            return (ConcretePrototype) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    void show(){
        System.out.println("姓名: " +person.getName());
    }
}
