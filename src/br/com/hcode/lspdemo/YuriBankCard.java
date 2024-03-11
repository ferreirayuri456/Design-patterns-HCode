package br.com.hcode.lspdemo;

public class YuriBankCard implements IPaymentInstrument{

    @Override
    public void validate() throws Exception {
        //validação básica
    }

    @Override
    public void collectPayment() {
        System.out.println("Pagamento realizado com sucesso");
    }
}
