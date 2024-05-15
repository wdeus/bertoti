package org.example;

public class DatabaseConnector {

    private static DatabaseConnector instance = null;

    private DatabaseConnector(){
        System.out.println("Conectando ao banco de dados...");
    }

    public static DatabaseConnector getInstance(){
        if (instance == null){
            instance = new DatabaseConnector();
        }
        return instance;
    }

    public void connect(){
        System.out.println("Conexão com o banco OK");
    }
}
