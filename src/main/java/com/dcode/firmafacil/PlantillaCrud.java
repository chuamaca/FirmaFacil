package com.dcode.firmafacil;





public class PlantillaCrud extends javax.swing.JPanel {

    boolean editar = false;
//    MDemanda demandaEditar;

    public PlantillaCrud() {
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
//        modelo.addColumn("Documento");
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
//        modelo.addColumn("Documento");
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
        jSeparator2 = new javax.swing.JSeparator();
        txtFactura = new javax.swing.JTextField();
        apMLbl = new javax.swing.JLabel();
        txtIngresoDet = new javax.swing.JTextField();
        domLbl = new javax.swing.JLabel();
        txtDeudaPendiente = new javax.swing.JTextField();
        btnGuardarDemanda = new javax.swing.JButton();
        phoneLbl = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableCuentaDetalle = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableCuentaCabecera = new javax.swing.JTable();
        txtGlosa = new javax.swing.JTextField();
        apPLbl = new javax.swing.JLabel();
        header1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cmbCuentaBanco = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));

        bg.setBackground(new java.awt.Color(255, 255, 255));

        nameLbl.setText("Documento");

        apMLbl.setText("Monto Cancelado");

        domLbl.setText("Deuda Pendiente");

        txtDeudaPendiente.setToolTipText("");

        btnGuardarDemanda.setBackground(new java.awt.Color(18, 90, 173));
        btnGuardarDemanda.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnGuardarDemanda.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarDemanda.setText("Registrar");
        btnGuardarDemanda.setBorderPainted(false);
        btnGuardarDemanda.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnGuardarDemanda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarDemandaActionPerformed(evt);
            }
        });

        phoneLbl.setText("Cuenta Banco");

        jTableCuentaDetalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTableCuentaDetalle.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(jTableCuentaDetalle);

        jTableCuentaCabecera.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTableCuentaCabecera.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane3.setViewportView(jTableCuentaCabecera);

        apPLbl.setText("Glosa");

        header1.setBackground(new java.awt.Color(25, 118, 210));
        header1.setPreferredSize(new java.awt.Dimension(744, 150));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Registrar Demanda");

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

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3)
                    .addComponent(header1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 802, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, bgLayout.createSequentialGroup()
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFactura, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                            .addComponent(phoneLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbCuentaBanco, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtIngresoDet, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(apMLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(domLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDeudaPendiente, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(txtGlosa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnGuardarDemanda, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13))
                            .addComponent(apPLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jSeparator2)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(header1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(domLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(apMLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nameLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDeudaPendiente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIngresoDet)
                    .addComponent(txtFactura, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                    .addComponent(apPLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGuardarDemanda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtGlosa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmbCuentaBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void LimpiarTexto() {
        txtIngresoDet.setText(null);
        //txtCuentaBanco.setText(null);
        txtGlosa.setText(null);

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel apMLbl;
    private javax.swing.JLabel apPLbl;
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnGuardarDemanda;
    private javax.swing.JComboBox<String> cmbCuentaBanco;
    private javax.swing.JLabel domLbl;
    private javax.swing.JPanel header1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTableCuentaCabecera;
    private javax.swing.JTable jTableCuentaDetalle;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JLabel phoneLbl;
    private javax.swing.JTextField txtDeudaPendiente;
    private javax.swing.JTextField txtFactura;
    private javax.swing.JTextField txtGlosa;
    private javax.swing.JTextField txtIngresoDet;
    // End of variables declaration//GEN-END:variables
}
