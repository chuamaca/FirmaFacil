package com.dcode.firmafacil;

import com.dcode.firmafacil.Data.DDocumento;
import com.dcode.firmafacil.Data.Tabla_PdfVO;
import com.dcode.firmafacil.Modelo.Documento;
import com.google.gson.Gson;
import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Base64;
import java.util.HashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class FormDocumento extends javax.swing.JPanel {

    boolean editar = false;
//    MDemanda demandaEditar;

    String ruta_archivo = "";
    Tabla_PdfVO tpdf = new Tabla_PdfVO();
    int id = -1;

    public FormDocumento() {
        initComponents();
        InitStyles();
        CargarCLiente();

        CargaCategoria();
    }

    public void CargarCLiente() {
        cmbCliente.addItem("ADECCO PERU SAC");
        cmbCliente.addItem("PEPE PEREZ");
        cmbCliente.addItem("LIMA SAC");
    }

    public void CargaCategoria() {
        cmbCategoria.addItem("NORMAL");
        cmbCategoria.addItem("AVANZADA");
    }

    //Sobreescritura
//    public PlantillaCrud(MDemanda mDemandaEdit) {
//        System.out.println("Inicializando Cuenta CRUD" + mDemandaEdit);
//        initComponents();
//        editar = true;
//        this.demandaEditar = mDemandaEdit;
//        InitStyles();
//      //  Mostrar(mDemandaEdit);
//
//    }
//    public void CargarCuentaBancoCMB() {
//        cmbCuentaBanco.removeAllItems();
//        UtilitariosJDBC utilJdbc = new UtilitariosJDBC();
//        List<Poldat> cuentasList = utilJdbc.SelectCuentasBancosCmb();
//        System.out.println("Cargar Combo: " + cuentasList);
////
////        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>(cuentasList.toArray(new String[0]));
////        cmbCuentaBanco.setModel(model);
//
//        for (Poldat poldat : cuentasList) {
//            System.out.println("Llenando Combo: " + poldat.rtstr1);
//            cmbCuentaBanco.addItem(poldat.rtstr1);
//        }
//    }
//    public void Mostrar(MDemanda objMDemanda) {
//
//        //CargarCuentaBancoCMB();
//
//        System.out.println("Mostrar Cuenta!!!! ");
//
//        DefaultTableModel modelo = new DefaultTableModel();
//        modelo.addColumn("Cliente");
//        modelo.addColumn("FormDocumento");
//        modelo.addColumn("Total");
//        modelo.addColumn("Pago Inicial");
//        modelo.addColumn("D. Cancelada");
//        modelo.addColumn("#N. Cuotas");
//
//        jTableCuentaCabecera.setModel(modelo);
//
//        DDemanda dDemanda = new DDemanda();
//        MDemanda mDemandaList = dDemanda.SelectByDocument(objCuenta);
//        System.out.println(" Traer datos " + cuentaCobrarList);
//
//        String cuentasForTable[] = new String[6];
//
//        /*
//    cliente, numerodocumento, total, pagoinicial, pagos, coutas
//    
//    idMovimiento, ruc, cliente, documento, deudacancelada, saldo, deudatotal, usuario, glosa, numerocuotas, fecharegistro
//         */
//        cuentasForTable[0] = mDemandaList.getCliente();
//        cuentasForTable[1] = mDemandaList.getDocumento();
//        cuentasForTable[2] = "" + mDemandaList.getDeudatotal();
//        cuentasForTable[3] = "";
//        cuentasForTable[4] = "" + mDemandaList.getDeudacancelada();
//        cuentasForTable[5] = "" + mDemandaList.getNumerocuotas();
//
//        double imputDeuda = (mDemandaList.getDeudatotal() - mDemandaList.getDeudacancelada());
//
//        txtDeudaPendiente.setText("" + imputDeuda);
//
//        modelo.addRow(cuentasForTable);
//
//        jTableCuentaCabecera.setModel(modelo);
//
//    }
//    public void MostrarListaCuentaDetalle(CuentaDetalle objCuentaDetalle) {
//
//        System.out.println("Mostrar Cuenta Detalle !!!! ");
//
//        /*
//        numerodocumento, nrocuotadet, ingresodet, saldodet, cuentabancodet, glosadet, fechapagodet
//         */
//        DefaultTableModel modelo = new DefaultTableModel();
//        modelo.addColumn("FormDocumento");
//        modelo.addColumn("#N. Cuota");
//        modelo.addColumn("Pago Realizado");
//        modelo.addColumn("Saldo");
//        modelo.addColumn("Cuenta Banco");
//        modelo.addColumn("Glosa");
//        modelo.addColumn("F.Pago");
//
//        jTableCuentaDetalle.setModel(modelo);
//
//        CuentaDetalleJDBC cuentaDet = new CuentaDetalleJDBC();
//
//        List<domain.CuentaDetalle> cuentaDetalleList = cuentaDet.SelectByDocumentList(objCuentaDetalle);
//
//        String cuentasForTable[] = new String[7];
//
//        for (domain.CuentaDetalle item : cuentaDetalleList) {
//            cuentasForTable[0] = item.getDocumento();
//            cuentasForTable[1] = "" + item.getNrocuotadet();
//            cuentasForTable[2] = "" + item.getIngresodet();
//            cuentasForTable[3] = "" + item.getSaldodet();
//            cuentasForTable[4] = item.getCuentabancodet();
//            cuentasForTable[5] = item.getGlosadet();
//            cuentasForTable[6] = item.getFechapagodet();
//
//            modelo.addRow(cuentasForTable);
//
//        }
//        jTableCuentaDetalle.setModel(modelo);
//
//    }
    private void InitStyles() {

//        if (demandaEditar != null) {
//
//            //Mostrar(cuentaEditar);
//            System.out.println("InitStyles >>> " + demandaEditar);
//
//         //   txtFactura.setText(demandaEditar.getDocumento());
//           // txtDeudaPendiente.setEnabled(false);
//
//       //     String doc = cuentaEditar.getDocumento();
//         //   CuentaDetalle cuentaDet = new CuentaDetalle();
//           // cuentaDet.setDocumento(doc);
//            //MostrarListaCuentaDetalle(cuentaDet);
//
//        }
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
        nameLbl = new javax.swing.JLabel();
        txtIdDocumento = new javax.swing.JTextField();
        apMLbl = new javax.swing.JLabel();
        txtIngresoDet = new javax.swing.JTextField();
        domLbl = new javax.swing.JLabel();
        txtDeudaPendiente = new javax.swing.JTextField();
        phoneLbl = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablePDF = new javax.swing.JTable();
        header1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cmbCliente = new javax.swing.JComboBox<>();
        btnSeleccionarArchivo = new javax.swing.JButton();
        btnGuardarAdjunto = new javax.swing.JButton();
        phoneLbl1 = new javax.swing.JLabel();
        cmbCategoria = new javax.swing.JComboBox<>();
        txtFactura1 = new javax.swing.JTextField();
        btnFirmar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        bg.setBackground(new java.awt.Color(255, 255, 255));

        nameLbl.setText("Documento");

        apMLbl.setText("Tipo Documento");

        domLbl.setText("Nombre");

        txtDeudaPendiente.setToolTipText("");

        phoneLbl.setText("Cliente");

        jTablePDF.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTablePDF.setGridColor(new java.awt.Color(255, 255, 255));
        jTablePDF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePDFMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTablePDF);

        header1.setBackground(new java.awt.Color(25, 118, 210));
        header1.setPreferredSize(new java.awt.Dimension(744, 150));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Registrar Documento [Firma Electronica]");

        javax.swing.GroupLayout header1Layout = new javax.swing.GroupLayout(header1);
        header1.setLayout(header1Layout);
        header1Layout.setHorizontalGroup(
            header1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(header1Layout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        header1Layout.setVerticalGroup(
            header1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(header1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        btnSeleccionarArchivo.setText("Cargar Archivo");
        btnSeleccionarArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarArchivoActionPerformed(evt);
            }
        });

        btnGuardarAdjunto.setBackground(new java.awt.Color(0, 51, 255));
        btnGuardarAdjunto.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnGuardarAdjunto.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarAdjunto.setText("Cargar Documento");
        btnGuardarAdjunto.setBorderPainted(false);
        btnGuardarAdjunto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnGuardarAdjunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarAdjuntoActionPerformed(evt);
            }
        });

        phoneLbl1.setText("Firma Categoria");

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(phoneLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(phoneLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(cmbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(txtIdDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(bgLayout.createSequentialGroup()
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(header1, javax.swing.GroupLayout.DEFAULT_SIZE, 996, Short.MAX_VALUE)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(txtFactura1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtIngresoDet, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(txtDeudaPendiente, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSeleccionarArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnGuardarAdjunto, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22))
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(nameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(apMLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(domLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 503, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2)))
                .addContainerGap())
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(header1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(phoneLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(phoneLbl1, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIdDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(domLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(apMLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(21, 21, 21)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIngresoDet, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDeudaPendiente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSeleccionarArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardarAdjunto, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFactura1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnFirmar.setBackground(new java.awt.Color(18, 90, 173));
        btnFirmar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnFirmar.setForeground(new java.awt.Color(255, 255, 255));
        btnFirmar.setText("Firmar Documento");
        btnFirmar.setBorderPainted(false);
        btnFirmar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnFirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirmarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnFirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(134, 134, 134)
                .addComponent(btnFirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void LimpiarTexto() {
//        txtIngresoDet.setText(null);
        //txtCuentaBanco.setText(null);
//        txtGlosa.setText(null);

    }

    private void btnFirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirmarActionPerformed
        // TODO add your handling code here:
        Gson gson = new Gson();
        Documento doc = new Documento();
        doc.setIdDocumento(Integer.parseInt(txtIdDocumento.getText()));

        DDocumento ddoc = new DDocumento();
        List<Documento> documentos = new ArrayList<>();
        documentos = ddoc.SelectByIdDocumento(doc);

        for (Documento documento : documentos) {
            try {
                Informacion data = new Informacion();
                data.setNombre(documento.getNombreDocumento());
                String decodedString = new String(documento.getArchivoOrigen(), StandardCharsets.UTF_8);
                data.setData(decodedString);

                String json = gson.toJson(data);

                // Crear el objeto HttpClient
                HttpClient client = HttpClient.newHttpClient();

                // Crear el objeto HttpRequest
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create("http://localhost:8080/pki/firma"))
                        .header("Content-Type", "application/json")
                        .POST(BodyPublishers.ofString(json))
                        .build();

                HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

                ApiResponse apiResponse = gson.fromJson(response.body(), ApiResponse.class);
                
                System.out.println("apiResponse:" + apiResponse.estado);

                // 6. Decodificar el Base64 y guardar el archivo PDF si el estado es OK
                if ("OK".equals(apiResponse.estado)) {
                    byte[] pdfData = Base64.getDecoder().decode(apiResponse.data);

                    // 7. Guardar el PDF
                    Path path = Path.of("C:\\output.pdf");

                    Files.write(path, pdfData);
                    System.out.println("Archivo PDF guardado correctamente.");
                } else {
                    System.out.println("Estado no es OK, no se guardará el archivo.");
                }

            } catch (IOException ex) {
                Logger.getLogger(FormDocumento.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InterruptedException ex) {
                Logger.getLogger(FormDocumento.class.getName()).log(Level.SEVERE, null, ex);
            }

        }


    }//GEN-LAST:event_btnFirmarActionPerformed

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

//    public byte[] firmarPdf(byte[] data) throws Exception {
//        try {
//            CertificadoDigital certificado = CertificateStore.getCertificateFromFile(Constante.CERTIFICADO, Constante.CLAVE);
//            data = PadesFirma.firmarPdfAvanzado(data, certificado);
//            return data;
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return null;
//    }

    private void btnSeleccionarArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarArchivoActionPerformed
        seleccionar_pdf();
    }//GEN-LAST:event_btnSeleccionarArchivoActionPerformed

    public int guardar_pdf(String nombredocumento, File ruta) {

        Documento po = new Documento();
        DDocumento ddocumento = new DDocumento();
        po.setNombreDocumento(nombredocumento);
        try {
            byte[] pdf = new byte[(int) ruta.length()];
            InputStream input = new FileInputStream(ruta);
            input.read(pdf);
            po.setArchivoOrigen(pdf);
            System.out.println("Archivo Origen: " + po.getArchivoOrigen());
        } catch (IOException ex) {
            po.setArchivoOrigen(null);
            //System.out.println("Error al agregar archivo pdf "+ex.getMessage());
        }
        int InsertKey = ddocumento.insertDocumento(po);
        System.out.println("Despuest ddocumento.insertDocumento(po):" + InsertKey);

        return InsertKey;
    }

    public void seleccionar_pdf() {
        JFileChooser j = new JFileChooser();
        FileNameExtensionFilter fi = new FileNameExtensionFilter("pdf", "pdf");
        j.setFileFilter(fi);
        int se = j.showOpenDialog(this);
        if (se == 0) {
            this.btnSeleccionarArchivo.setText("" + j.getSelectedFile().getName());
            ruta_archivo = j.getSelectedFile().getAbsolutePath();

            if (ruta_archivo.length() > 0) {
                btnGuardarAdjunto.setEnabled(true);
                System.out.println("this.btnSeleccionarArchivo.enable(true): ");
            }

        } else {
        }
    }

    private void btnGuardarAdjuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarAdjuntoActionPerformed
        File ruta = new File(ruta_archivo);
        if (ruta_archivo.trim().length() != 0) {
            int LlaveKey = guardar_pdf(ruta_archivo.trim(), ruta);
            System.out.println("Despues de guardar_pdf:  ");
            tpdf.visualizar_PdfVO(jTablePDF, LlaveKey);
            ruta_archivo = "";
            this.btnSeleccionarArchivo.setText("");

            this.txtIdDocumento.setText("" + LlaveKey);

        } else {
            JOptionPane.showMessageDialog(null, "Rellenar todo los campos");
        }
    }//GEN-LAST:event_btnGuardarAdjuntoActionPerformed

    private void jTablePDFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePDFMouseClicked
        // TODO add your handling code here:

        int column = jTablePDF.getColumnModel().getColumnIndexAtX(evt.getX());
        int row = evt.getY() / jTablePDF.getRowHeight();

        if (row < jTablePDF.getRowCount() && row >= 0 && column < jTablePDF.getColumnCount() && column >= 0) {
            id = (int) jTablePDF.getValueAt(row, 0);
            Object value = jTablePDF.getValueAt(row, column);
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
                String name = "" + jTablePDF.getValueAt(row, 1);
//                txtname.setText(name);
            }
        }
    }//GEN-LAST:event_jTablePDFMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel apMLbl;
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnFirmar;
    private javax.swing.JButton btnGuardarAdjunto;
    private javax.swing.JButton btnSeleccionarArchivo;
    private javax.swing.JComboBox<String> cmbCategoria;
    private javax.swing.JComboBox<String> cmbCliente;
    private javax.swing.JLabel domLbl;
    private javax.swing.JPanel header1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTablePDF;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JLabel phoneLbl;
    private javax.swing.JLabel phoneLbl1;
    private javax.swing.JTextField txtDeudaPendiente;
    private javax.swing.JTextField txtFactura1;
    private javax.swing.JTextField txtIdDocumento;
    private javax.swing.JTextField txtIngresoDet;
    // End of variables declaration//GEN-END:variables
}
