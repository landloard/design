package org.landlord.demo02;

import java.util.Date;

/**
 * @description:
 * @author: landlord
 * @date: 2024/12/10 16:59
 */
public class LotteryServiceImpl extends LotteryService {
   private DrawHouseService houseService = new DrawHouseService();

    @Override
    public EventResult lottery(String uId) {
        String lots = houseService.lots(uId);
        return new EventResult(uId,lots,new Date());
    }
}
