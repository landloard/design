package org.landlord.demo02;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: landlord
 * @date: 2024/12/10 18:18
 */
public class Client {

    public static void main(String[] args) {
        List<Receipt> receipts = ReceiptBuilder.genReceiptList();

        ReceiptStrategyContext context = new ReceiptStrategyContext();

        ReceiptHandleStrategyFactory.init();
        for (Receipt receipt : receipts) {
            ReceiptHandleStrategy receiptHandleStrategy = ReceiptHandleStrategyFactory.getReceiptHandleStrategy(receipt.getType());
            context.setReceiptHandleStrategy(receiptHandleStrategy);
            context.handleStrategy(receipt);
        }
    }
}
