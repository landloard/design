package org.landlord.demo02;

/**
 * @description:
 * @author: landlord
 * @date: 2024/12/10 17:40
 */
public class Client {
    public static void main(String[] args) {
        LoanOneMonth loanOneMonth = new LoanOneMonth();
        loanOneMonth.handle("admin","123456");

        System.out.println("==========================");

        LoanSevenDays loanSevenDays = new LoanSevenDays();
        loanSevenDays.handle("admin","123456");
    }
}
