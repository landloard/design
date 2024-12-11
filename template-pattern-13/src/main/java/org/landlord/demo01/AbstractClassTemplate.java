package org.landlord.demo01;

/**
 * @description:
 * @author: landlord
 * @date: 2024/12/10 17:27
 */
public abstract class AbstractClassTemplate {

    void step1(String key) {
        System.out.println("在模板类中 -> 执行步骤1");
        if (step2(key)) {
            step3();
        } else {
            step4();
        }
        step5();
    }


    private boolean step2(String key) {
        System.out.println("在模板类中 -> 执行步骤2");
        if ("x".equals(key)) {
            return true;
        }
        return false;
    }

    abstract void step3();

    abstract void step4();

    void step5() {
        System.out.println("在模板类中 -> 执行步骤5");
    }

    void run(String key) {
        step1(key);
    }
}
