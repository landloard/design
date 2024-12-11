package org.landlord.demo01;

/**
 * @description:
 * @author: landlord
 * @date: 2024/12/10 11:17
 */
public class ConcreteDecorator extends Decorator{

    public ConcreteDecorator(Component component) {
        super(component);
    }
    
    public void operation() {
        super.operation();  //原有业务方法
        addedBehavior();    //新增业务方法
    }

    private void addedBehavior() {

    }

}
