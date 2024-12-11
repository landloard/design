package org.landlord.factory_method.controller;


import org.landlord.factory_method.factory.FreeGoodsFactory;
import org.landlord.factory_method.factory.FreeGoodsFactoryMap;
import org.landlord.factory_method.entity.AwardInfo;
import org.landlord.factory_method.entity.ResponseResult;
import org.landlord.factory_method.factory.goods.IFreeGoods;


/**
 * 发放奖品接口
 * @author spikeCong
 * @date 2024/9/7
 **/
public class DeliverController {

    /**
     * 按照类型的不同发放商品
     */
    public ResponseResult awardToUser(AwardInfo awardInfo){

        //根据类型获取工厂
        FreeGoodsFactory goodsFactory = FreeGoodsFactoryMap.getParserFactory(awardInfo.getAwardType());

        //从工厂中获取对应实例
        IFreeGoods freeGoods = goodsFactory.getInstance();

        System.out.println("=====工厂方法模式========");
        ResponseResult result = freeGoods.sendFreeGoods(awardInfo);
        return result;
    }
}
