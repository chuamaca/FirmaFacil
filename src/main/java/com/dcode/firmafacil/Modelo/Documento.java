/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dcode.firmafacil.Modelo;

import java.sql.Date;

/**
 *
 * @author Cesar
 */
public class Documento extends Auditoria {

    public int IdDocumento;
    public int IdCliente;
    public int IdCategoria;
    public byte[] ArchivoOrigen;
    public String TipoDocumento;
    public String NombreDocumento;

    public Documento(int IdDocumento, int IdCliente, int IdCategoria, byte[] ArchivoOrigen, String TipoDocumento, String NombreDocumento, int Estado, int UsuarioCrea, Date FechaCrea, int UsuarioModifica, Date FechaModifica, int UsuarioElimina, Date FechaElimina) {
        super(Estado, UsuarioCrea, FechaCrea, UsuarioModifica, FechaModifica, UsuarioElimina, FechaElimina);
        this.IdDocumento = IdDocumento;
        this.IdCliente = IdCliente;
        this.IdCategoria = IdCategoria;
        this.ArchivoOrigen = ArchivoOrigen;
        this.TipoDocumento = TipoDocumento;
        this.NombreDocumento = NombreDocumento;
    }

    public Documento(int IdDocumento, int IdCliente, int IdCategoria, byte[] ArchivoOrigen, String TipoDocumento, String NombreDocumento) {
        this.IdDocumento = IdDocumento;
        this.IdCliente = IdCliente;
        this.IdCategoria = IdCategoria;
        this.ArchivoOrigen = ArchivoOrigen;
        this.TipoDocumento = TipoDocumento;
        this.NombreDocumento = NombreDocumento;
    }

    public int getIdDocumento() {
        return IdDocumento;
    }

    public void setIdDocumento(int IdDocumento) {
        this.IdDocumento = IdDocumento;
    }

    public int getIdCliente() {
        return IdCliente;
    }

    public void setIdCliente(int IdCliente) {
        this.IdCliente = IdCliente;
    }

    public int getIdCategoria() {
        return IdCategoria;
    }

    public void setIdCategoria(int IdCategoria) {
        this.IdCategoria = IdCategoria;
    }

    public byte[] getArchivoOrigen() {
        return ArchivoOrigen;
    }

    public void setArchivoOrigen(byte[] ArchivoOrigen) {
        this.ArchivoOrigen = ArchivoOrigen;
    }

    public String getTipoDocumento() {
        return TipoDocumento;
    }

    public void setTipoDocumento(String TipoDocumento) {
        this.TipoDocumento = TipoDocumento;
    }

    public String getNombreDocumento() {
        return NombreDocumento;
    }

    public void setNombreDocumento(String NombreDocumento) {
        this.NombreDocumento = NombreDocumento;
    }

}
