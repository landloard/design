package org.landlord.demo02;

public class Client {
    public static void main(String[] args) {
        Sigleton_02 instance01 = Sigleton_02.getInstance();
        Sigleton_02 instance02 = Sigleton_02.getInstance();

        System.out.println(instance01 == instance02);
    }
}
