package org.landlord.demo01;

/**
 * @description:
 * @author: landlord
 * @date: 2024/12/10 17:31
 */
public class ConcreteClassA extends AbstractClassTemplate{
    @Override
    void step3() {
        System.out.println("在子类A中 -> 执行步骤 3");
    }

    @Override
    void step4() {
        System.out.println("在子类A中 -> 执行步骤 4");
    }
}
