package br.com.hcode.dipdemo;

import br.com.hcode.dipdemo.payment.Payment;

public class MainDip {

    public static void main(String[] args) {
        Payment payment = new Payment();
        payment.pay("250");
    }
}
