package br.com.hcode.lspdemo;

public class RewardsCard implements IPaymentInstrument{


    @Override
    public void validate() throws Exception {
        System.out.println("Limite liberado, voce conquistou pontos no cartao rewards");

    }

    @Override
    public void collectPayment() {
        System.out.println("Pontuacao creditada com o Programa Rewards");
    }
}
