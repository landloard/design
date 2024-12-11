package org.landlord.demo01;

import java.time.LocalDate;

/**
 * 糖果类
 * @author spikeCong
 * @date 2022/10/18
 **/
public class Candy extends Product implements Acceptable{
    public Candy(String name, LocalDate producedDate, double price) {
        super(name, producedDate, price);
    }

    @Override
    public void accept(Visitor visitor) {
        //accept实现方法中调用访问者并将自己 "this" 传回。
        visitor.visit(this);
    }
}
