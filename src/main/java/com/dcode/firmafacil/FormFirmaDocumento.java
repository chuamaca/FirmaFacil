package com.dcode.firmafacil;

import com.dcode.firmafacil.Data.DDocumento;
import com.dcode.firmafacil.Data.DServicio;
import com.dcode.firmafacil.Data.Tabla_PdfVO;
import com.dcode.firmafacil.Modelo.Documento;
import com.dcode.firmafacil.Modelo.Servicio;
import com.google.gson.Gson;
import java.awt.Desktop;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import org.icepdf.ri.common.*;

public class FormFirmaDocumento extends javax.swing.JPanel {

    boolean editar = false;
//    MDemanda demandaEditar;

    Documento documentoObj = null;
    int id = -1;
    int idServClick = -1;

    public FormFirmaDocumento() {
        initComponents();
        InitStyles();
        // CargarCuentaBancoCMB();
    }

    public FormFirmaDocumento(Documento documento) {
        initComponents();
        InitStyles();
        editar = true;
        this.documentoObj = documento;

        int keyDocumento = documentoObj.getIdDocumento();

        VisualizarDocumento(keyDocumento);

    }

    private void InitStyles() {
    }

    private void VisualizarDocumento(int idDocumento) {

        Tabla_PdfVO tpdfDocumento = new Tabla_PdfVO();
        tpdfDocumento.MostrarGrillaArchivoCargado(jTablePDFDocument, idDocumento);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        btnFirmarDocumento = new javax.swing.JButton();
        header1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablePDFService = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTablePDFDocument = new javax.swing.JTable();
        txtLugar = new javax.swing.JTextField();
        txtIdDocumento = new javax.swing.JTextField();
        apMLbl = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        bg.setBackground(new java.awt.Color(255, 255, 255));

        btnFirmarDocumento.setBackground(new java.awt.Color(18, 90, 173));
        btnFirmarDocumento.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnFirmarDocumento.setForeground(new java.awt.Color(255, 255, 255));
        btnFirmarDocumento.setText("Firmar Documento");
        btnFirmarDocumento.setBorderPainted(false);
        btnFirmarDocumento.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnFirmarDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirmarDocumentoActionPerformed(evt);
            }
        });

        header1.setBackground(new java.awt.Color(25, 118, 210));
        header1.setPreferredSize(new java.awt.Dimension(744, 150));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Firmar Documento");

        javax.swing.GroupLayout header1Layout = new javax.swing.GroupLayout(header1);
        header1.setLayout(header1Layout);
        header1Layout.setHorizontalGroup(
            header1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(header1Layout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(255, Short.MAX_VALUE))
        );
        header1Layout.setVerticalGroup(
            header1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(header1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jTablePDFService.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTablePDFService.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTablePDFService.setGridColor(new java.awt.Color(255, 255, 255));
        jTablePDFService.setShowGrid(true);
        jTablePDFService.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePDFServiceMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTablePDFService);

        jTablePDFDocument.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTablePDFDocument.setGridColor(new java.awt.Color(255, 255, 255));
        jTablePDFDocument.setShowGrid(true);
        jTablePDFDocument.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePDFDocumentMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTablePDFDocument);

        txtLugar.setToolTipText("");

        txtIdDocumento.setToolTipText("");

        apMLbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        apMLbl.setText("Lugar");

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(header1, javax.swing.GroupLayout.DEFAULT_SIZE, 802, Short.MAX_VALUE)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(txtIdDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(apMLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(bgLayout.createSequentialGroup()
                                        .addComponent(txtLugar, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnFirmarDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(bgLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 796, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(header1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95)
                .addComponent(apMLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLugar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFirmarDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(390, Short.MAX_VALUE))
            .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(bgLayout.createSequentialGroup()
                    .addGap(68, 68, 68)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(538, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void VisualizarServicio(int idServicio) {
        Tabla_PdfVO tpdfServicio = new Tabla_PdfVO();
        tpdfServicio.MostrarGrillaArchivoFirmado(jTablePDFService, idServicio);
    }


    private void btnFirmarDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirmarDocumentoActionPerformed
        // TODO add your handling code here:

        Gson gson = new Gson();
        Documento docus = new Documento();
        docus.setIdDocumento(documentoObj.getIdDocumento());

        DDocumento ddoc = new DDocumento();
        Documento listadocumento = new Documento();
        listadocumento = ddoc.SelectByIdDocumentoObject(docus);

        try {

            Informacion data = new Informacion();
            data.setNombre(listadocumento.getNombreDocumento());
            String base64String = Base64.getEncoder().encodeToString(listadocumento.getArchivoOrigen());
            data.setData(base64String);

            String json = gson.toJson(data);
            System.out.println("json: " + json);
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("http://localhost:8080/pki/firma"))
                    .header("Content-Type", "application/json")
                    .POST(HttpRequest.BodyPublishers.ofString(json))
                    .build();

            System.out.println("request: " + request);
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            ApiResponse apiResponse = gson.fromJson(response.body(), ApiResponse.class);

            System.out.println("apiResponse:" + apiResponse.data);
            if ("OK".equals(apiResponse.estado)) {

                byte[] pdfData = Base64.getDecoder().decode(apiResponse.data);

                Path path = Path.of("D:\\ArchivoFirmado_" + documentoObj.getIdDocumento() + ".pdf");
                System.out.println("Patch::  " + path);
                Files.write(path, pdfData);

                if (pdfData != null) {
                    System.out.println("archivoDestinoPdf Null:   " + pdfData);
                    Servicio objServicio = new Servicio();

                    objServicio.setIdDocumento(documentoObj.getIdDocumento());
                    objServicio.setContenidoDocumento(pdfData);
                    objServicio.setTipoDocumento("PDF");
                    objServicio.setNombreDocumento(documentoObj.getNombreDocumento());
                    objServicio.setLugar(txtLugar.getText());

                    DServicio dServicio = new DServicio();
                    int inserkey = dServicio.insertServicio(objServicio);

                    if (inserkey > 0) {
                        System.out.println("Servicio Insertado para Ver: " + inserkey);
                        
                        VisualizarServicio(inserkey);

                    }
                }

                // 7. Guardar el PDF
            } else {
                System.out.println("Estado no es OK, no se guardará el archivo.");
            }

        } catch (IOException ex) {
            Logger.getLogger(FormDocumento.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(FormDocumento.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnFirmarDocumentoActionPerformed

    private void jTablePDFServiceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePDFServiceMouseClicked
        // TODO add your handling code here:

        int column = jTablePDFService.getColumnModel().getColumnIndexAtX(evt.getX());
        int row = evt.getY() / jTablePDFService.getRowHeight();
        
        
        
        if (row < jTablePDFService.getRowCount() && row >= 0 && column < jTablePDFService.getColumnCount() && column >= 0) {
            idServClick = (int) jTablePDFService.getValueAt(row, 1);

            System.out.println("jTablePDFServiceMouseClicked idServClick:  " + idServClick);
            Object value = jTablePDFService.getValueAt(row, column);
            System.out.println("jTablePDFServiceMouseClicked value: " + value);
            if (value instanceof JButton) {
                ((JButton) value).doClick();
                JButton boton = (JButton) value;

                if (boton.getText().equals("Vacio")) {
                    JOptionPane.showMessageDialog(null, "No hay archivo");
                } else {
                    DServicio dServicio = new DServicio();
                    System.out.println("ejecutar_archivoPDFServicio: " + idServClick);
                    
                    dServicio.ejecutar_archivoPDFServicio(idServClick);
                    
                    try {
                        Desktop.getDesktop().open(new File("newDocumentoFirmado.pdf"));
                    } catch (Exception ex) {
                    }
                }

            } else {
                String name = "" + jTablePDFService.getValueAt(row, 1);
                //                txtname.setText(name);
            }
        }
    }//GEN-LAST:event_jTablePDFServiceMouseClicked

    private void jTablePDFDocumentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePDFDocumentMouseClicked
        // TODO add your handling code here:

        int column = jTablePDFDocument.getColumnModel().getColumnIndexAtX(evt.getX());
        int row = evt.getY() / jTablePDFDocument.getRowHeight();

        if (row < jTablePDFDocument.getRowCount() && row >= 0 && column < jTablePDFDocument.getColumnCount() && column >= 0) {
            id = (int) jTablePDFDocument.getValueAt(row, 2);
            Object value = jTablePDFDocument.getValueAt(row, column);
            if (value instanceof JButton) {
                ((JButton) value).doClick();
                JButton boton = (JButton) value;

                if (boton.getText().equals("Vacio")) {
                    JOptionPane.showMessageDialog(null, "No hay archivo");
                } else {
                    DDocumento pd = new DDocumento();
                    System.out.println("ejecutar_archivoPDF: " + id);
                    pd.ejecutar_archivoPDF(id);
                    try {
                        Desktop.getDesktop().open(new File("new.pdf"));
                    } catch (Exception ex) {
                    }
                }

            } else {
                String name = "" + jTablePDFDocument.getValueAt(row, 1);
                //                txtname.setText(name);
            }
        }
    }//GEN-LAST:event_jTablePDFDocumentMouseClicked

    private static class ApiResponse {

        String estado;
        String data;
    }

    public class Informacion {

        private String data;
        private String nombre;

        public Informacion(String data, String nombre) {
            this.data = data;
            this.nombre = nombre;
        }

        public Informacion() {
        }

        public String getData() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

    }

    private void VisualizarPdf(byte[] base64EncodedPDF) {

        System.out.println("VisualizarPdf:: " + base64EncodedPDF);

        try {

            // Crear InputStream desde bytes
            ByteArrayInputStream inputStream = new ByteArrayInputStream(base64EncodedPDF);

            // Configurar el controlador de IcePDF
            SwingController controller = new SwingController();

            // Construir el panel del visor con el controlador
            SwingViewBuilder factory = new SwingViewBuilder(controller);
            JPanel viewerComponentPanel = factory.buildViewerPanel();

            // Cargar el documento desde el InputStream
            controller.openDocument(inputStream, "PDF Document", null);

            // Configurar el JScrollPane y añadir el panel del visor
            JScrollPane jScrollPanePdfView = new JScrollPane(viewerComponentPanel);
            jScrollPanePdfView.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
            jScrollPanePdfView.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

            // Configurar y mostrar el JFrame
            JFrame frame = new JFrame("Visualizador de PDF en JScrollPane");
            frame.getContentPane().add(jScrollPanePdfView);
            frame.setSize(800, 600);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);

            // Asegurar que el InputStream se cierra al cerrar la aplicación
            frame.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                    try {
                        inputStream.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    System.exit(0);
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al cargar el PDF: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel apMLbl;
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnFirmarDocumento;
    private javax.swing.JPanel header1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTablePDFDocument;
    private javax.swing.JTable jTablePDFService;
    private javax.swing.JTextField txtIdDocumento;
    private javax.swing.JTextField txtLugar;
    // End of variables declaration//GEN-END:variables
}
