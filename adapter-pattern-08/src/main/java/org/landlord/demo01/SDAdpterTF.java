package org.landlord.demo01;

/**
 * @description:
 * @author: landlord
 * @date: 2024/12/10 13:07
 */
public class SDAdpterTF implements SDCard{
    private TFCard tfCard;

    public SDAdpterTF(TFCard tfCard) {
        this.tfCard = tfCard;
    }
    @Override
    public String readSD() {
        return tfCard.readTF();
    }

    @Override
    public void writeSD(String data) {
        tfCard.writeTF(data);
    }
}
