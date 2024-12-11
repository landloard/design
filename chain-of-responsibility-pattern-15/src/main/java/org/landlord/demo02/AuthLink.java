package org.landlord.demo02;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @description:
 * @author: landlord
 * @date: 2024/12/11 13:21
 */
public abstract class AuthLink {
    protected Logger logger = LoggerFactory.getLogger(AuthLink.class);

    protected SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    protected String levelUserId;      //审核人ID
    protected String levelUserName;   //审核人姓名
    protected AuthLink next;          //持有下一个处理类的引用

    public AuthLink(String levelUserId, String levelUserName) {
        this.levelUserId = levelUserId;
        this.levelUserName = levelUserName;
    }

    //获取下一个处理类
    public AuthLink getNext() {
        return next;
    }

    //责任链中添加处理类
    public AuthLink appendNext(AuthLink next) {
        this.next = next;
        return this;
    }

    //抽象审核方法
    public abstract AuthInfo doAuth(String uId, String orderId, Date authDate);
}
