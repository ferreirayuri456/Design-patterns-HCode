package br.com.hcode.lspdemo;

public class CreditCard extends YuriBankCard{

    @Override
    public void validate() throws Exception{

        //Validação do cartão de crédito
        System.out.println("Verificando comprovação de limite em seu cartão");
        System.out.println("Limite liberado");

    }
}
