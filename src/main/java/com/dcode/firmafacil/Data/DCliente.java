
package com.dcode.firmafacil.Data;

import com.dcode.firmafacil.Util.ConexionJDBC;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class DCliente {
     public List<String> ListCliente() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<String> clientes = new ArrayList<>();

        try {
             conn = ConexionJDBC.getConexion();
            String sql = "SELECT Nombre FROM FIRMAFACIL.dbo.Cliente where Estado=1";
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {
               String cliente = rs.getString("Nombre");
                clientes.add(cliente);
            }

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            ConexionJDBC.close(rs);
            ConexionJDBC.close(stmt);
            ConexionJDBC.close(conn);
        }

        return clientes;}
}
