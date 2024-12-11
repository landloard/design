package org.landlord.demo02;

/**
 * @description: 回执处理策略接口
 * @author: landlord
 * @date: 2024/12/10 17:57
 */
public interface ReceiptHandleStrategy {

    void handleReceipt(Receipt receipt);
}
