package org.landlord.demo02;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: landlord
 * @date: 2024/12/10 17:59
 */
public class ReceiptHandleStrategyFactory {
    public ReceiptHandleStrategyFactory() {
    }

    private static Map<String, ReceiptHandleStrategy> strategyMap;

    public static void init() {
        strategyMap = new HashMap<String, ReceiptHandleStrategy>();

        SAXReader reader = new SAXReader();
        String file = "D:\\Users\\wangw\\IdeaProjects\\design\\strategy-pattern-14\\src\\main\\resources\\config.xml";

        try {
            Document document = reader.read(file);

            Node node = document.selectSingleNode("/config/className");
            String className = node.getText();
            Class clazz = Class.forName(className);
            ReceiptHandleStrategy instance = (ReceiptHandleStrategy) clazz.newInstance();
            strategyMap.put("MT1011", instance);

            Node node2 = document.selectSingleNode("/config/className[2]");
            String className2 = node2.getText();
            Class clazz2 = Class.forName(className2);
            ReceiptHandleStrategy instance2 = (ReceiptHandleStrategy) clazz2.newInstance();
            strategyMap.put("MT2101", instance2);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    //根据回执类型获取对应策略类对象
    public static ReceiptHandleStrategy getReceiptHandleStrategy(String receiptType) {

        return strategyMap.get(receiptType);
    }

}
