package org.example;

public class Main {
    public static void main(String[] args) {
        DatabaseConnector db1 = DatabaseConnector.getInstance();
        db1.connect();
    }
}