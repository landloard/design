package org.landlord.factory_method.factory;

import org.landlord.factory_method.factory.impl.DiscountFreeGoodsFactory;
import org.landlord.factory_method.factory.impl.SmallGiftFreeGoodsFactory;
import org.landlord.factory_method.factory.impl.YouKuMemberFreeGoodsFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * 用简单方法模式实现: 工厂的工厂,作用是不需要每次创建新的工厂对象
 **/
public class FreeGoodsFactoryMap {

    private static final Map<Integer,FreeGoodsFactory> cachedFactories = new HashMap<>();

    static{
        cachedFactories.put(1, new DiscountFreeGoodsFactory());
        cachedFactories.put(2, new SmallGiftFreeGoodsFactory());
        cachedFactories.put(3, new YouKuMemberFreeGoodsFactory());
    }

    public static FreeGoodsFactory getParserFactory(Integer type){
        return cachedFactories.get(type);
    }
}
