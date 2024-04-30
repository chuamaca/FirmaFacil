
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
    
      DDocumento dao=null;
    
       public void visualizar_PdfVO(JTable tabla, int idDocumento) {
        tabla.setDefaultRenderer(Object.class, new imgTabla());
        DefaultTableModel dt = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        dt.addColumn("Id");
        dt.addColumn("Tipo Documentos");
        dt.addColumn("Nombre pdf");
        dt.addColumn("Ver Pdf");

        ImageIcon icono = null;
        if (get_Image("/Imagen/32pdf.png") != null) {
            icono = new ImageIcon(get_Image("/Imagen/32pdf.png"));
            System.out.println("Icono: " + icono);
        }

        dao = new DDocumento();
           Documento vo = new Documento();
           
           Documento doc= new Documento();
           doc.IdDocumento=idDocumento;
        List<Documento> list = dao.SelectByNroExpediente(doc);

        if (list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                Object fila[] = new Object[4];
                vo = list.get(i);
                fila[0] = vo.getIdDocumento();
                fila[1] = vo.getTipoDocumento();
                fila[2] = vo.getNombreDocumento();
                if (vo.getArchivoOrigen()!= null) {
                    fila[3] = new JButton(icono);
                } else {
                    fila[3] = new JButton("Vacio");
                }

                dt.addRow(fila);
            }
            tabla.setModel(dt);
            tabla.setRowHeight(32);
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
