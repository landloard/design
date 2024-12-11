package org.landlord.demo02;

/**
 * @author: landlord
 * @date: 2024/12/11
 **/
public class Client {

    public static void main(String[] args) {

        ExpressionInterpreter e = new ExpressionInterpreter();
        long result = e.interpret("6 2 3 2 4 / - + *");
        System.out.println(result);
    }
}
