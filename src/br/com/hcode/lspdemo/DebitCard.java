package br.com.hcode.lspdemo;

public class DebitCard extends YuriBankCard{

    @Override
    public void validate() throws Exception{
        System.out.println("Realizando saldo");
        System.out.println("Saldo liberado");
    }
}
