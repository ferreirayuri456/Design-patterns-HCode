package br.com.hcode.lspdemo;

public interface IPaymentInstrument {

    void validate() throws Exception;
    void collectPayment();
}
