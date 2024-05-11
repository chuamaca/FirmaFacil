package com.dcode.firmafacil.Data;

import com.dcode.firmafacil.Util.ConexionJDBC;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DCategoria {

   // private static final String SQL_SELECT = "SELECT IdCategoria, Nombre, Descripcion FROM FIRMAFACIL.dbo.Categoria where Estado=1";

    public List<String> ListCategoria() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<String> categorias = new ArrayList<>();

        try {
             conn = ConexionJDBC.getConexion();
            String sql = "SELECT Nombre FROM FIRMAFACIL.dbo.Categoria where Estado=1";
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {
               String categoria = rs.getString("Nombre"); // Aquí se cambia "DemandanteID" por "Nombre"
                categorias.add(categoria);
            }

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            ConexionJDBC.close(rs);
            ConexionJDBC.close(stmt);
            ConexionJDBC.close(conn);
        }

        return categorias;
    }

}
