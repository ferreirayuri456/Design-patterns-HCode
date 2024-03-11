package br.com.hcode.dipdemo.payment;

import br.com.hcode.dipdemo.factory.DbProductFactory;
import br.com.hcode.dipdemo.model.Database;
import br.com.hcode.dipdemo.model.IDBProduct;

//Classe de alto nível
public class Payment {

    public void pay(String productId){
        //Se eu quiser alterar o meu banco de dados teria que fazer alguns ifs
        //A solução é criar uma interface e implementa-la
        //MySQLProduct mySQLProduct = new MySQLProduct();
        IDBProduct idbProduct = DbProductFactory.create(Database.MONGODB);
        String product = idbProduct.getProductByid(productId);
        System.out.println(product);
    }
}
