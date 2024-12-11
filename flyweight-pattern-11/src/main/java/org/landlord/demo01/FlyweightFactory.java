package org.landlord.demo01;

import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: landlord
 * @date: 2024/12/10 14:39
 */
public class FlyweightFactory {

    private Map<String, Flyweight> pool = new HashMap<>();

    public FlyweightFactory() {
        //添加对应的内部状态
        pool.put("A", new ConcreteFlyweight("A"));
        pool.put("B", new ConcreteFlyweight("B"));
        pool.put("C", new ConcreteFlyweight("C"));
    }


    public Flyweight getFlyweight(String key) {
        {
            if (pool.containsKey(key)) {
                System.out.println("===享元池中存在,直接复用,key:" + key);
                return pool.get(key);
            } else {
                //如果对象不存在,先创建一个新的对象添加到享元池中,然后返回
                System.out.println("===享元池中不存在,创建并复用,key:" + key);
                ConcreteFlyweight concreteFlyweight = new ConcreteFlyweight(key);
                pool.put(key, concreteFlyweight);
                return concreteFlyweight;
            }
        }
    }
}
