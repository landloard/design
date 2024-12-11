package org.landlord.demo02;

/**
 * 数字表达式
 * @author: landlord
 * @date: 2024/12/11
 **/
public class NumExpression implements Expression {

    private long number;

    public NumExpression(long number) {
        this.number = number;
    }

    public NumExpression(String number) {
        this.number = Long.parseLong(number);
    }

    @Override
    public long interpret() {
        return this.number;
    }
}
