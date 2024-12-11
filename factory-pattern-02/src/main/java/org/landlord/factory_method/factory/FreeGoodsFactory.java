package org.landlord.factory_method.factory;


import org.landlord.factory_method.factory.goods.IFreeGoods;

/**
 * 抽象工厂

 **/
public interface FreeGoodsFactory {

    IFreeGoods getInstance();
}
