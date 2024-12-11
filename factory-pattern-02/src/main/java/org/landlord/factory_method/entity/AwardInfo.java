package org.landlord.factory_method.entity;

import java.util.Map;

/**
 * 获奖信息对应实体类
 * @author spikeCong
 * @date 2024/9/7
 **/
public class AwardInfo {

    private String uid; //用户唯一ID

    private Integer awardType; //奖品类型: 1 打折券 ,2 优酷会员,3 小礼品

    private String awardNumber; //奖品编号

    private String awardAddress; //获奖者收获地址信息

    Map<String, String> extMap; //额外信息

    public Map<String, String> getExtMap() {
        return extMap;
    }

    public void setExtMap(Map<String, String> extMap) {
        this.extMap = extMap;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public Integer getAwardType() {
        return awardType;
    }

    public void setAwardType(Integer awardType) {
        this.awardType = awardType;
    }

    public String getAwardNumber() {
        return awardNumber;
    }

    public void setAwardNumber(String awardNumber) {
        this.awardNumber = awardNumber;
    }

    public String getAwardAddress() {
        return awardAddress;
    }

    public void setAwardAddress(String awardAddress) {
        this.awardAddress = awardAddress;
    }
}
