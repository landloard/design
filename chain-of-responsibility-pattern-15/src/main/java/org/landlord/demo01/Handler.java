package org.landlord.demo01;

/**
 * @description:
 * @author: landlord
 * @date: 2024/12/11 13:06
 */
public abstract class Handler {
    protected Handler next = null;

    public void setNext(Handler next) {
        this.next = next;
    }

    public abstract void handle(RequestData requestData);
}
