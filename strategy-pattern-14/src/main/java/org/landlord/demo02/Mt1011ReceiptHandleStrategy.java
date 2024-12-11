package org.landlord.demo02;


public class Mt1011ReceiptHandleStrategy implements ReceiptHandleStrategy {

    @Override
    public void handleReceipt(Receipt receipt) {
        System.out.println("解析报文MT1011: " + receipt.getMessage());
    }
}
