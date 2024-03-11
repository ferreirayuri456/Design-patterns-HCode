package br.com.hcode.lspdemo;

public class MainPáyment {

    public static void main(String[] args) throws Exception {
        //CreditCard card = new CreditCard();
        //DebitCard card = new DebitCard();
        RewardsCard card = new RewardsCard();

        card.validate();
        card.collectPayment();
    }
}
