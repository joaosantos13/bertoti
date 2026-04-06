package com.thehecklers.sburrestdemo;

import java.sql.Connection;
import java.sql.DriverManager;

public class Database {

    private static final String URL = "jdbc:sqlite:meubanco.db";

    public static Connection connect() throws Exception {
        return DriverManager.getConnection(URL);
    }
}