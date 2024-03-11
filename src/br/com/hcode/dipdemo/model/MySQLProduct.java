package br.com.hcode.dipdemo.model;

//Classe de baixo nível
public class MySQLProduct implements IDBProduct{

    public String getProductByid(String productId){
        return "Mysql : Exibindo dados do produto " + productId;
    }
}
