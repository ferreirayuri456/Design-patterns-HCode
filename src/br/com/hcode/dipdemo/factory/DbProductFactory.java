package br.com.hcode.dipdemo.factory;

import br.com.hcode.dipdemo.model.Database;
import br.com.hcode.dipdemo.model.IDBProduct;
import br.com.hcode.dipdemo.model.MongoDBProduct;
import br.com.hcode.dipdemo.model.MySQLProduct;

public class DbProductFactory {

    public static IDBProduct create(Database database){
        if (database.equals(Database.MYSQL)){
            return new MySQLProduct();
        }else {
            return new MongoDBProduct();
        }

    }
}
