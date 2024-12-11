package org.landlord.factory_method.factory.impl;

import org.landlord.factory_method.factory.FreeGoodsFactory;
import org.landlord.factory_method.factory.goods.DiscountFreeGoods;
import org.landlord.factory_method.factory.goods.IFreeGoods;


/**
 * 优惠券发放接口-生产工厂

 **/
public class DiscountFreeGoodsFactory implements FreeGoodsFactory {

    @Override
    public IFreeGoods getInstance() {
        return new DiscountFreeGoods();
    }
}
