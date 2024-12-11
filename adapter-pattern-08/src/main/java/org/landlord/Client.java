package org.landlord;

import org.landlord.demo01.Computer;
import org.landlord.demo01.SDAdpterTF;
import org.landlord.demo01.TFCard;
import org.landlord.demo01.TFCardImpl;
/**
 * @description:
 * @author: landlord
 * @date: 2024/12/10 13:01
 */
public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer();
        TFCard tfCard = new TFCardImpl();

        SDAdpterTF sdAdpterTF = new SDAdpterTF(tfCard);
        System.out.println(computer.read(sdAdpterTF));
    }
}