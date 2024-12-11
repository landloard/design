package org.landlord.factory_method.factory.impl;

import org.landlord.factory_method.factory.FreeGoodsFactory;
import org.landlord.factory_method.factory.goods.IFreeGoods;
import org.landlord.factory_method.factory.goods.SmallGiftFreeGoods;


/**
 * 小礼品发放接口-生产工厂

 **/
public class SmallGiftFreeGoodsFactory implements FreeGoodsFactory {
    @Override
    public IFreeGoods getInstance() {

        return new SmallGiftFreeGoods();
    }
}
