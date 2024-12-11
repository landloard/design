package org.landlord.demo02;

/**
 * 减法运算
 * @author: landlord
 * @date: 2024/12/11
 **/
public class SubExpression implements Expression {

    private Expression exp1;
    private Expression exp2;

    public SubExpression(Expression exp1, Expression exp2) {
        this.exp1 = exp1;
        this.exp2 = exp2;
    }

    @Override
    public long interpret() {
        return exp1.interpret() - exp2.interpret();
    }
}
