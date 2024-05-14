/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dcode.firmafacil.Data;

import com.dcode.firmafacil.Modelo.Cliente;
import com.dcode.firmafacil.Modelo.Documento;
import com.dcode.firmafacil.Modelo.Servicio;
import com.dcode.firmafacil.Modelo.ServicioDocumento;
import com.dcode.firmafacil.Util.ConexionJDBC;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cesar
 */
public class DServicio {
    
    private String  SQL_SELECT_BY_CLIENTE="select d.IdDocumento, c.Nombre as 'Empresa', c2.Nombre as 'Categoria' , d.ArchivoOrigen, COALESCE(s.IdServicio , 0) as 'Firmado', \n" +
"s.FechaServicio ,s.FechaVigencia ,u.NombreUsuario \n" +
"from Documento d left join Servicio s \n" +
"on d.IdDocumento =s.IdDocumento \n" +
"inner join Cliente c on d.IdCliente =c.IdCliente \n" +
"inner join Categoria c2 on c2.IdCategoria =d.IdCategoria \n" +
"left join Usuario u on u.IdUsuario =s.IdUsuario\n" +
"where c.IdCliente =?";
    
     private static final String SQL_SERVICIO_SELECT_BY_DOCUMENTO = "SELECT IdDocumento , TipoDocumento , NombreDocumento , ContenidoDocumento FROM FIRMAFACIL.dbo.Servicio WHERE IdDocumento =? AND Estado =1";

    
      public List<ServicioDocumento> SelectDocumentoByCliente(int IdCliente) {

        System.out.println("SelectByNroExpediente: " + IdCliente);

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ServicioDocumento mDocumento = null;
        List<ServicioDocumento> listDocumento = new ArrayList<>();

        try {
            conn = ConexionJDBC.getConexion();
            stmt = conn.prepareStatement(SQL_SELECT_BY_CLIENTE);
            stmt.setInt(1, IdCliente);
            rs = stmt.executeQuery();
            System.out.println("stmt.executeQuery(): ");
            while (rs.next()) {

                int IdDocumento = rs.getInt("IdDocumento");
                String Empresa = rs.getString("Empresa");
                String Categoria = rs.getString("Categoria");
                byte[] archivopdf = rs.getBytes("ArchivoOrigen");
                int Firmado = rs.getInt("Firmado");
                java.sql.Date FechaServicio=rs.getDate("FechaServicio");
                java.sql.Date FechaVigencia=rs.getDate("FechaVigencia");
                String NombreUsuario = rs.getString("NombreUsuario");

                mDocumento = new ServicioDocumento();
                mDocumento.setIdDocumento(IdDocumento);
                mDocumento.setEmpresa(Empresa);
                mDocumento.setCategoria(Categoria);
                mDocumento.setArchivoOrigen(archivopdf);
                mDocumento.setIdServicio(Firmado);
                mDocumento.setFechaServicio(FechaServicio);
                mDocumento.setFechaVigencia(FechaVigencia);
                mDocumento.setUsuarioFirma(NombreUsuario);
                 
                listDocumento.add(mDocumento);
                System.out.println("listDocumento.add(mDocumento): " + listDocumento.toString());
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
      
      
      public List<Servicio> SelectServicioByIdDocumento(Documento objDocumento) {

        System.out.println("SelectServicioByIdDocumento: " + objDocumento);

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Servicio mServicio = null;
        List<Servicio> listServicio = new ArrayList<>();

        try {
            conn = ConexionJDBC.getConexion();
            stmt = conn.prepareStatement(SQL_SERVICIO_SELECT_BY_DOCUMENTO);
            stmt.setInt(1, objDocumento.getIdDocumento());
            rs = stmt.executeQuery();
            System.out.println("stmt.executeQuery(): ");
            while (rs.next()) {

                int IdDocumento = rs.getInt("IdDocumento");
                String TipoDocumento = rs.getString("TipoDocumento");
                String NombreDocumento = rs.getString("NombreDocumento");
                byte[] archivopdf = rs.getBytes("ArchivoOrigen");

                mServicio = new Servicio();
                mServicio.setIdDocumento(IdDocumento);
                mServicio.setTipoDocumento(TipoDocumento);
                mServicio.setNombreDocumento(NombreDocumento);
                mServicio.setContenidoDocumento(archivopdf);

                listServicio.add(mServicio);
                System.out.println("listServicio.add(mServicio): " + listServicio.toString());
            }

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            ConexionJDBC.close(rs);
            ConexionJDBC.close(stmt);
            ConexionJDBC.close(conn);
        }

        return listServicio;
    }
}
