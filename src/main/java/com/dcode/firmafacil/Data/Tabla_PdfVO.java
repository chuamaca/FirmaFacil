package com.dcode.firmafacil.Data;

import com.dcode.firmafacil.Modelo.Documento;
import com.dcode.firmafacil.Util.imgTabla;
import java.awt.Image;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Cesar
 */
public class Tabla_PdfVO extends javax.swing.JFrame {

    DDocumento dao = null;

    public void MostrarGrillaArchivoCargado(JTable tabla, int idDocumento) {
        System.out.println("visualizar_PdfVO: " + idDocumento);
        tabla.setDefaultRenderer(Object.class, new imgTabla());
        DefaultTableModel dt = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        
        dt.addColumn("Ruta Origen");
        dt.addColumn("Ver Pdf");
        dt.addColumn("Id");

        ImageIcon icono = null;
        if (get_Image("/Imagen/179483.png") != null) {
            icono = new ImageIcon(get_Image("/Imagen/179483.png"));
            System.out.println("Icono: " + icono);
        }

        dao = new DDocumento();
        Documento vo = new Documento();

        Documento doc = new Documento();
        doc.IdDocumento = idDocumento;
        List<Documento> list = dao.SelectByIdDocumento(doc);

        System.out.println(" List<Documento> list = dao.SelectByIdDocumento(doc): " + list.toString());
        if (list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                Object fila[] = new Object[4];
                vo = list.get(i);
                
                fila[0] = vo.getNombreDocumento();
                if (vo.getArchivoOrigen() != null) {
                    fila[1] = new JButton(icono);
                } else {
                    fila[1] = new JButton("Vacio");
                }
                fila[2] = vo.getIdDocumento();

                dt.addRow(fila);
            }
            tabla.setModel(dt);
           
        }
    }

    public Image get_Image(String ruta) {
        try {
            ImageIcon imageIcon = new ImageIcon(getClass().getResource(ruta));
            Image mainIcon = imageIcon.getImage();
            return mainIcon;
        } catch (Exception e) {
        }
        return null;
    }
}
