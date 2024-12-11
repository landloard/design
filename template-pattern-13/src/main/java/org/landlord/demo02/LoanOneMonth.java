package org.landlord.demo02;


public class LoanOneMonth extends Account{

    @Override
    public void calculate() {
        System.out.println("借款周期30天,利率为10%!");
    }
}
