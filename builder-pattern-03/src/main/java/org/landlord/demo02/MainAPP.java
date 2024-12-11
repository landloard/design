package org.landlord.demo02;

/**

 **/
public class MainAPP {

    public static void main(String[] args) {

        //使用链式编程设置参数
        RabbitMQClient client = new RabbitMQClient.Builder().setHost("192.168.52.123").setMode(2).setExchange("text-exchange")
                .setPort(5672).setDurable(true).build();

        client.sendMessage("Test");
    }
}
