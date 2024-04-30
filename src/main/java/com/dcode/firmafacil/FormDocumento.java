package com.dcode.firmafacil;

import com.dcode.firmafacil.Data.DDocumento;
import com.dcode.firmafacil.Data.Tabla_PdfVO;
import com.dcode.firmafacil.Modelo.Documento;
import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
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
        // CargarCuentaBancoCMB();
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
        txtIdExpdiente = new javax.swing.JTextField();
        apMLbl = new javax.swing.JLabel();
        txtIngresoDet = new javax.swing.JTextField();
        domLbl = new javax.swing.JLabel();
        txtDeudaPendiente = new javax.swing.JTextField();
        phoneLbl = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablePDF = new javax.swing.JTable();
        header1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cmbCuentaBanco = new javax.swing.JComboBox<>();
        btnSeleccionarArchivo = new javax.swing.JButton();
        btnGuardarAdjunto = new javax.swing.JButton();
        phoneLbl1 = new javax.swing.JLabel();
        cmbCuentaBanco1 = new javax.swing.JComboBox<>();
        txtFactura1 = new javax.swing.JTextField();
        btnGuardarDemanda = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        bg.setBackground(new java.awt.Color(255, 255, 255));

        nameLbl.setText("Documento");

        txtIdExpdiente.setText("100");

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
                    .addComponent(cmbCuentaBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(phoneLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(cmbCuentaBanco1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(txtIdExpdiente, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                        .addComponent(cmbCuentaBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(phoneLbl1, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbCuentaBanco1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIdExpdiente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
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

        btnGuardarDemanda.setBackground(new java.awt.Color(18, 90, 173));
        btnGuardarDemanda.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnGuardarDemanda.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarDemanda.setText("Firmar Documento");
        btnGuardarDemanda.setBorderPainted(false);
        btnGuardarDemanda.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnGuardarDemanda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarDemandaActionPerformed(evt);
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
                        .addComponent(btnGuardarDemanda, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(134, 134, 134)
                .addComponent(btnGuardarDemanda, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void LimpiarTexto() {
//        txtIngresoDet.setText(null);
        //txtCuentaBanco.setText(null);
//        txtGlosa.setText(null);

    }

    private void btnGuardarDemandaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarDemandaActionPerformed
        // TODO add your handling code here:

//        int fila = 0;
//        int total = 0;
//        for (int i = 0; i < jTableCuentaDetalle.getRowCount(); i++) {
//            fila = Integer.parseInt(jTableCuentaDetalle.getValueAt(i, 1).toString());
//
//            total += fila;
//        }
//        int contador;
//
//        if (total == 0) {
//            contador = 1;
//        } else {
//            contador = jTableCuentaDetalle.getRowCount() + 1;
//        }
        //double calcularSaldo = 0;
        //  String numdoc = cuentaEditar.getDocumento();
        // MDemanda objCd = new MDemanda();
//        objCd.setNrocuotadet(contador);
//        objCd.setIngresodet(Double.parseDouble(txtIngresoDet.getText()));
//        objCd.setSaldodet(calcularSaldo);
//        //objCd.setCuentabancodet(txtCuentaBanco.getText());
//        objCd.setCuentabancodet((String) cmbCuentaBanco.getSelectedItem());
//        System.out.println("Combo getName" + (String) cmbCuentaBanco.getSelectedItem());
//        objCd.setGlosadet(txtGlosa.getText());
//        objCd.setIdmovimiento(idmovimiento);
//        objCd.setDocumento(numdoc);
//        System.out.println("objCuentaDetalle   >>>> " + objCd);
//
//        double ingresoDeuda = Double.parseDouble(txtIngresoDet.getText());
//        double deudaPendiente = Double.parseDouble(txtDeudaPendiente.getText());
//        if (ingresoDeuda > deudaPendiente) {
//
//            JOptionPane.showMessageDialog(null, "El Pago Supera la Deuda");
//
//        } else {
//
//            DDemanda dDemanda = new DDemanda();
//            if (editar == true) {
//                System.out.println("Ediatr Cuenta Detallle ::: " + editar);
//                int rtaInsert = dDemanda.insertDemanda(objCd);
//                System.out.println("Insert Cuenta Detalle:  " + rtaInsert);
//                if (rtaInsert == 1) {
//
//                 //   MostrarListaCuentaDetalle(objCd);
//                   // Mostrar(cuentaEditar);
//                    //LimpiarTexto();
//                }
//
//            }
//        }

        /*
        LineaCredito obj = new LineaCredito();
        obj.setNombre_cliente(txtcliente.getText());
        obj.setRuc_cliente(txtRUC.getText());
        obj.setDias_credito(Integer.parseInt(txtdiascredito.getText()));
        obj.setMonto_maximo(Double.parseDouble(txtMontoMaximo.getText()));
        obj.setMoneda(txtMoneda.getText());
        obj.setUsuario_registro("chuamanic");
        obj.setRiesgo_crediticio(editar ? lineaCreditoEditar.getRiesgo_crediticio() : "medio");
        

        System.out.println("Valores: >>>>>" + obj);

        LineaCreditoJDBC lineaCreditoJDBC = new LineaCreditoJDBC();
        if (editar == false) {
            int rta = lineaCreditoJDBC.insertLineaCredito(obj);

            if (rta == 1) {
                Dashboard.ShowJPanel(new LineaCreditoLista());
                JOptionPane.showMessageDialog(null, "Se Agrego correctamente");
            }
        } else {
            obj.setIdlc(lineaCreditoEditar.getIdlc());

            int rta = lineaCreditoJDBC.updateLineaCredito(obj);

            if (rta == 1) {
                Dashboard.ShowJPanel(new LineaCreditoLista());
                JOptionPane.showMessageDialog(null, "Se Modifico correctamente");
            }
        }
         */

    }//GEN-LAST:event_btnGuardarDemandaActionPerformed

    private void btnSeleccionarArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarArchivoActionPerformed
        seleccionar_pdf();
    }//GEN-LAST:event_btnSeleccionarArchivoActionPerformed

    public  int guardar_pdf(String nombredocumento, File ruta) {

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
            int LlaveKey= guardar_pdf(ruta_archivo.trim(), ruta);
            System.out.println("Despues de guardar_pdf:  ");
            tpdf.visualizar_PdfVO(jTablePDF, LlaveKey);
            ruta_archivo = "";
            this.btnSeleccionarArchivo.setText("");

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
    private javax.swing.JButton btnGuardarAdjunto;
    private javax.swing.JButton btnGuardarDemanda;
    private javax.swing.JButton btnSeleccionarArchivo;
    private javax.swing.JComboBox<String> cmbCuentaBanco;
    private javax.swing.JComboBox<String> cmbCuentaBanco1;
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
    private javax.swing.JTextField txtIdExpdiente;
    private javax.swing.JTextField txtIngresoDet;
    // End of variables declaration//GEN-END:variables
}
