package org.landlord.demo06;

public enum Singleton_06 {
    INSTANCE;

    private Object data;

    private Singleton_06() {}

    public Object getData() { return data; }

    public void setData(Object data) { this.data = data; }

    public static Singleton_06 getInstance() {
        return INSTANCE;
    }
}
