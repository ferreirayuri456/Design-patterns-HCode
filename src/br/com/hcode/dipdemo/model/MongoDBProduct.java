package br.com.hcode.dipdemo.model;

//Classe de baixo nível
public class MongoDBProduct implements IDBProduct{

    public String getProductByid(String productId){
        return "MongoDB : Exibindo dados do produto " + productId;
    }
}
