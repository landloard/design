package org.landlord.demo02;

import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: landlord
 * @date: 2024/12/10 14:58
 */
public class GobangFactory {
    private static Map<String,GobangFlyweight> pool;

    private GobangFactory() {
        pool = new HashMap<String,GobangFlyweight>();
        GobangFlyweight black = new BlackGobang(); //黑子
        GobangFlyweight white = new WhiteGobang(); //白子
        pool.put("b",black);
        pool.put("w",white);
    }

    public static final GobangFactory getInstance() {
        return SingletonHolder.INSTANCE;
    }

    //静态内部类-单例
    private static class SingletonHolder{
        private static final GobangFactory INSTANCE = new GobangFactory();
    }

    public GobangFlyweight getGobang(String key){
        return pool.get(key);
    }

}
