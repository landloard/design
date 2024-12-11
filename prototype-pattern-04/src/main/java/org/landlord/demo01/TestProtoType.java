package org.landlord.demo01;

import org.junit.Test;

import java.io.*;

/**
 * @description:
 * @author: landlord
 * @date: 2024/12/5 17:38
 */
public class TestProtoType {

    @Test
    public  void test01(){
        ConcretePrototype c1 = new ConcretePrototype();
        ConcretePrototype c2 = new ConcretePrototype();

        System.out.println("对象c1和c2是同一个对象？" + (c1 == c2));

    }

    @Test
    public  void test02(){
        ConcretePrototype c1 = new ConcretePrototype();
        ConcretePrototype c2 = c1.clone();

        System.out.println("对象c1和c2是同一个对象？" + (c1 == c2));

    }

    @Test
    public  void test03(){
        ConcretePrototype c1 = new ConcretePrototype();
        Person p1 = new Person();
        c1.setPerson(p1);

        ConcretePrototype c2 = c1.clone();
        Person p2 = c2.getPerson();
        p2.setName("landlord");

        System.out.println("对象c1和c2是同一个对象？" + (c1 == c2));

        c1.show();
        c2.show();

    }

    @Test
    public  void test04() throws IOException, ClassNotFoundException {
        ConcretePrototype c1 = new ConcretePrototype();
        Person p1 = new Person();
        p1.setName("landlord-01");
        c1.setPerson(p1);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("c.txt"));
        oos.writeObject(c1);
        oos.close();


        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("c.txt"));
        ConcretePrototype c2 = (ConcretePrototype) ois.readObject();
        ois.close();
        Person p2 = c2.getPerson();
        p2.setName("landlord-02");

        System.out.println("对象c1和c2是同一个对象？" + (c1 == c2));

        c1.show();
        c2.show();

    }
}
