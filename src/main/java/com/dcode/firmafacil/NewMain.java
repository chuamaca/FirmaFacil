/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.dcode.firmafacil;

import com.dcode.firmafacil.Data.DDocumento;
import com.dcode.firmafacil.Data.DServicio;
import com.dcode.firmafacil.Modelo.Servicio;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Cesar
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.add(6);
        numeros.add(7);
        numeros.add(8);
        numeros.add(9);
        numeros.add(10);
        numeros.add(11);

        for (Iterator<Integer> iterator = numeros.iterator(); iterator.hasNext();) {
            Integer next = iterator.next();

            DServicio dServ = new DServicio();
            Servicio ser = new Servicio();
            ser.setIdServicio(next);

            List<Servicio> servList = new ArrayList<>();

            servList = dServ.SelectServicioByIdServicio(ser);

            String ruta = "D:\\FirmasTest\\"; // Ruta específica en Windows

            // Asegurarse de que la carpeta existe
            File directory = new File(ruta);
            if (!directory.exists()) {
                if (!directory.mkdirs()) {
                    System.out.println("Error: No se pudo crear el directorio.");
                    return; // Salir si no se puede crear el directorio
                }
            }

            for (Servicio servicio : servList) {
                byte[] archivo = servicio.getContenidoDocumento();
                if (archivo != null) {
                    String nombreArchivo = "nombre_del_archivo"; // Define o genera el nombre del archivo
                    try (FileOutputStream fos = new FileOutputStream(ruta + servicio.getIdServicio() + ".pdf")) {
                        fos.write(archivo);
                    } catch (IOException e) {
                        System.out.println("Error al escribir el archivo en la ruta especificada: " + e.getMessage());
                    }
                }
            }

        }

    }

}
