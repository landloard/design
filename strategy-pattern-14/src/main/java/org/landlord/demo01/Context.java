package org.landlord.demo01;

/**
 * @description:
 * @author: landlord
 * @date: 2024/12/10 17:52
 */
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void algorithm() {
        strategy.algorithm();
    }
}
