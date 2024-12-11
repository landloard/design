package org.landlord.demo02;

/**
 * @description:
 * @author: landlord
 * @date: 2024/12/10 11:50
 */
public class Client {

    public static void main(String[] args) {
        String info = "name:tom,age:15";
        EncryptionDataDecorator encryptionDataDecorator = new EncryptionDataDecorator(new BaseFileDataLoader("demo.txt"));
        encryptionDataDecorator.write(info);

        String data = encryptionDataDecorator.read();
        System.out.println(data);
    }
}
