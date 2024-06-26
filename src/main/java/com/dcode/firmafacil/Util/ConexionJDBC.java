/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dcode.firmafacil.Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Cesar
 */
public class ConexionJDBC {

    public static Connection getConexion() {

       String conexionServer = "jdbc:sqlserver://dcode;"
                + "database=FirmaFacil;"
                + "user=sa;"
                + "password=BANKpower9719;"
                + "loginTimeout=30;"
                + "encrypt=true;"
                + "trustServerCertificate=True;";
        try {
            Connection con = DriverManager.getConnection(conexionServer);
            return con;

        } catch (SQLException ex) {

            System.out.println(ex.toString());
            return null;

        }
    }

    public static void close(ResultSet rs) {

        try {
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }

    }

    public static void close(Statement smtn) {
        try {
            smtn.close();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }

    }

    public static void close(PreparedStatement smtn) {
        try {
            smtn.close();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }

    }

    public static void close(Connection conn) {
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }

    }
}
