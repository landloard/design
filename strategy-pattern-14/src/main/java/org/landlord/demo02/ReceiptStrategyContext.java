package org.landlord.demo02;

/**
 * @description:
 * @author: landlord
 * @date: 2024/12/10 18:14
 */
public class ReceiptStrategyContext {

    private ReceiptHandleStrategy receiptHandleStrategy;

    public void setReceiptHandleStrategy(ReceiptHandleStrategy receiptHandleStrategy) {
        this.receiptHandleStrategy = receiptHandleStrategy;
    }

    public void handleStrategy (Receipt receipt) {
         receiptHandleStrategy.handleReceipt(receipt);
    }
}
