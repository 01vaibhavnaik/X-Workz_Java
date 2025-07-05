package com.xworkz.lamdaExp.runner;

import com.xworkz.lamdaExp.external.Bottel;
import com.xworkz.lamdaExp.internal.Customer;

public class CustomerRunner {
    public static void main(String[] args) {

//        Bottel bottel=(int no)->{  // Lamda Expression
//            System.out.println(""+no);
//            if(no>0) {
//                return true;
//            }
//            return false;
//        };

//        Bottel bottel=(no)->(no>100);  // Lamda Expression
//        Customer customer=new Customer();
//        customer.buy(bottel);

//      To Save No Of Lines
        Customer customer=new Customer();
        customer.buy((no)->(no>10));



    }
}
