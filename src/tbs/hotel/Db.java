/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tbs.hotel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class Db {
    private static Connection koneksi;

    public static Connection getConnection() {
    try {
        if (koneksi == null || koneksi.isClosed()) {
            String url = "jdbc:mysql://localhost:3306/Sulfana2";
            String user = "root";
            String pass = "";
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            koneksi = DriverManager.getConnection(url, user, pass);
        }
    } catch (SQLException e) {
        System.out.println("Error membuat koneksi: " + e.getMessage());
    }
    return koneksi;
}

}