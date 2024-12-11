package org.landlord.demo01;

/**
 * 抽象组件类
 * @author: landlord
 * @date: 2024/12/11
 **/
public abstract class Colleague {

    private Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    public Mediator getMediator() {
        return mediator;
    }

    public abstract void exec(String key);
}
