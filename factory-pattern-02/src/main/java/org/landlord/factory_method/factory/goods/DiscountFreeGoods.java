package org.landlord.factory_method.factory.goods;

import org.landlord.factory_method.entity.AwardInfo;
import org.landlord.factory_method.entity.ResponseResult;

/**
 * 模拟打折券服务

 **/
public class DiscountFreeGoods implements IFreeGoods {

    @Override
    public ResponseResult sendFreeGoods(AwardInfo awardInfo) {

        System.out.println("向用户发放打折券一张: " + awardInfo.getUid() + " , " + awardInfo.getAwardNumber());
        return new ResponseResult("200","打折券发放成功!");
    }

}
