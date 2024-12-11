package org.landlord.demo01;

/**
 * @description:
 * @author: landlord
 * @date: 2024/12/10 11:18
 */
public class Decorator extends  Component{
    //维持一个抽象构建对象的引用
    private Component component;

    //注入一个抽象构建类型的对象
    public Decorator(Component component) {
        this.component = component;
    }
    @Override
    public void operation() {

        component.operation();
    }
}
