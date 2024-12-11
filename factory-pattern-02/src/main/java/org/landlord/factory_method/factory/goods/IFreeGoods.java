package org.landlord.factory_method.factory.goods;

import org.landlord.factory_method.entity.AwardInfo;
import org.landlord.factory_method.entity.ResponseResult;

/**
 * 免费商品接口

 **/
public interface IFreeGoods {

    //发放赠品
    ResponseResult sendFreeGoods(AwardInfo awardInfo);
}
