package com.practice.programmingelements;

import edu.princeton.cs.algs4.StdOut;

public class LoanPayment {

    public static void main(String[] args) {
        double principal = Double.parseDouble(args[0]);
        double years = Double.parseDouble(args[1]);
        double rate = Double.parseDouble(args[2]);

        double n = years*12;
        double r = (rate/100)/12;

        double payment = (principal*r)/(1-Math.pow(1+r,-1*n));
        double interest_paid = (payment * n) - (principal);

        StdOut.println("Monthly Payment " + Math.ceil(payment));
        StdOut.println("Interest Paid " + interest_paid);
    }
}
