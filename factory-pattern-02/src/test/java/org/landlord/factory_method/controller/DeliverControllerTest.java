package org.landlord.factory_method.controller;


import org.junit.Test;
import org.landlord.factory_method.entity.AwardInfo;

import java.util.HashMap;
import java.util.Map;

public class DeliverControllerTest {

    @Test
    public void  awardToUser() {
        DeliverController deliverController = new DeliverController();

        //1. 发放打折券优惠
        AwardInfo info1 = new AwardInfo();
        info1.setUid("1001");
        info1.setAwardType(1);
        info1.setAwardNumber("DEL12345");

        deliverController.awardToUser(info1);

        //2. 发放优酷会员
        AwardInfo info2 = new AwardInfo();
        info2.setUid("1002");
        info2.setAwardType(2);
        info2.setAwardNumber("DW12345");
        Map<String,String> map = new HashMap<>();
        map.put("phone","13512341234");
        info2.setExtMap(map);

        deliverController.awardToUser(info2);



        //2. 发放小礼品
        AwardInfo info3 = new AwardInfo();
        info3.setUid("1003");
        info3.setAwardType(3);
        info3.setAwardNumber("SM12345");
        Map<String,String> map2 = new HashMap<>();
        map2.put("username","大远");
        map2.put("phone","13512341234");
        map2.put("address","北京天安门");
        info3.setExtMap(map2);


    }
}