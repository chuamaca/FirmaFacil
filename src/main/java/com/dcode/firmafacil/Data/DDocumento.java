/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dcode.firmafacil.Data;

import com.dcode.firmafacil.Modelo.Documento;
import com.dcode.firmafacil.Util.ConexionJDBC;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cesar
 */
public class DDocumento {

    private static final String SQL_SELECT_BY_DEMANDA = "SELECT NroExpediente, FechaDemanda, DemandanteID, DemandadoID, Ubigeo, Especialidad, Cuantia, IdAnexo, ResumenControversia, ResumenPeticiones, DesignacionArbitro, DeclaracionesCompromiso, Estado, Decision_Final, MotivoAnulacion, SustentoAnulacion, FechaAprobacion, UsuarioAprobador, usuario\n"
            + "FROM Demanda where NroExpediente=?";
    
    private static final String SQL_INSERT = "INSERT INTO FIRMAFACIL.dbo.Documento ( IdCliente, IdCategoria, ArchivoOrigen, TipoDocumento, NombreDocumento, Estado, UsuarioCrea, FechaCrea, UsuarioModifica, FechaModifica, UsuarioElimina, FechaElimina)\n" +
"VALUES( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

      public int insertDocumento(Documento documento) {
        System.out.println("InsertDocumento");

        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        java.util.Date fechaActual = new java.util.Date();
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String fechaCarga = formato.format(fechaActual);

        try {
            conn = ConexionJDBC.getConexion();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setInt(1, documento.getIdCliente());
            stmt.setInt(2, documento.getIdCategoria());
            stmt.setBytes(3, documento.getArchivoOrigen());
            stmt.setString(4, documento.getTipoDocumento());
            stmt.setString(5, documento.getNombreDocumento());
            stmt.setInt(6, documento.getEstado());
            stmt.setInt(7, documento.getUsuarioCrea());
            stmt.setString(8, fechaCarga);
            
            System.out.println("ejecutando query:" + SQL_INSERT);
            rows = stmt.executeUpdate();
            System.out.println("Registros afectados:" + rows);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            //  ConexionJDBC.close(rs);
            ConexionJDBC.close(stmt);
            ConexionJDBC.close(conn);
        }

        return rows;
    }
      
    
    
    
    public List<Documento> SelectByNroExpediente(Documento objDocumento) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Documento mDocumento = null;
        List<Documento> listDocumento = new ArrayList<>();

        try {
            conn = ConexionJDBC.getConexion();
            stmt = conn.prepareStatement(SQL_SELECT_BY_DEMANDA);
            stmt.setInt(1, objDocumento.getIdDocumento());
            rs = stmt.executeQuery();
            while (rs.next()) {

                String NroExpediente = rs.getString("NroExpediente");
                java.sql.Date FechaDemanda = rs.getDate("FechaDemanda");
                String DemandanteID = rs.getString("DemandanteID");
                String DemandadoID = rs.getString("DemandadoID");
                String Ubigeo = rs.getString("Ubigeo");
                String Especialidad = rs.getString("Especialidad");
                Double Cuantia = rs.getDouble("Cuantia");
                int IdAnexo = rs.getInt("IdAnexo");
                String ResumenControversia = rs.getString("ResumenControversia");
                String ResumenPeticiones = rs.getString("ResumenPeticiones");
                String DesignacionArbitro = rs.getString("DesignacionArbitro");
                String DeclaracionesCompromiso = rs.getString("DeclaracionesCompromiso");
                String Estado = rs.getString("Estado");
                String DecisionFinal = rs.getString("Decision_Final");
                String MotivoAnulacion = rs.getString("MotivoAnulacion");
                String SustentoAnulacion = rs.getString("SustentoAnulacion");
                java.sql.Date FechaAprobacion = rs.getDate("FechaAprobacion");
                int UsuarioAprobador = rs.getInt("UsuarioAprobador");
                String usuario = rs.getString("usuario");

                mDocumento = new Documento();
                
               

                listDocumento.add(mDocumento);
            }

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            ConexionJDBC.close(rs);
            ConexionJDBC.close(stmt);
            ConexionJDBC.close(conn);
        }

        return listDocumento;
   }
}
