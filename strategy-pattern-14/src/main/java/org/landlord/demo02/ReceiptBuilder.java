package org.landlord.demo02;

import java.util.ArrayList;
import java.util.List;


public class ReceiptBuilder {

    public static List<Receipt> genReceiptList(){
        //模拟回执信息
        List<Receipt> receiptList = new ArrayList<>();
        receiptList.add(new Receipt("MT1101回执","MT1011"));
        receiptList.add(new Receipt("MT2101回执","MT2101"));
        return receiptList;
    }

}
