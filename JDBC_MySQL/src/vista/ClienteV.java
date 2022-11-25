package vista;

import controlador.ClienteC;
import javax.swing.table.DefaultTableModel;

public class ClienteV extends javax.swing.JFrame {

    public static String sexo = "M";
    public static int idCliente;
    DefaultTableModel modeloTabla;
    String dato = "";
    int tipo = 1;   //  
    ClienteC controller;

    public ClienteV() {
        initComponents();
        this.setLocationRelativeTo(null);
        controller = new ClienteC();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtCliente = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jpAtributos = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        optMasculino = new javax.swing.JRadioButton();
        optFemenino = new javax.swing.JRadioButton();
        txtNom = new javax.swing.JTextField();
        txtApe = new javax.swing.JTextField();
        txtDNI = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jpComandos = new javax.swing.JPanel();
        btnRegistrar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jrNom = new javax.swing.JRadioButton();
        jrDni = new javax.swing.JRadioButton();
        txtFiltro = new javax.swing.JTextField();
        chkTodos = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jtCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtCliente);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Mantenimiento de Clientes");

        jpAtributos.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setBackground(new java.awt.Color(204, 255, 204));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Nombre (s)");

        jLabel2.setBackground(new java.awt.Color(204, 255, 204));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Apellidos");

        jLabel3.setBackground(new java.awt.Color(204, 255, 204));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Sexo");

        jLabel4.setBackground(new java.awt.Color(204, 255, 204));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("DNI");

        optMasculino.setBackground(new java.awt.Color(204, 255, 204));
        optMasculino.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        optMasculino.setSelected(true);
        optMasculino.setText("Masculino");
        optMasculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optMasculinoActionPerformed(evt);
            }
        });

        optFemenino.setBackground(new java.awt.Color(204, 255, 204));
        optFemenino.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        optFemenino.setText("Femenino");
        optFemenino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optFemeninoActionPerformed(evt);
            }
        });

        txtNom.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtNom.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtApe.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtApe.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtDNI.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDNI.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDNI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDNIKeyTyped(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(204, 255, 204));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Fecha Nacimiento");

        javax.swing.GroupLayout jpAtributosLayout = new javax.swing.GroupLayout(jpAtributos);
        jpAtributos.setLayout(jpAtributosLayout);
        jpAtributosLayout.setHorizontalGroup(
            jpAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpAtributosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpAtributosLayout.createSequentialGroup()
                        .addGroup(jpAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpAtributosLayout.createSequentialGroup()
                                .addGroup(jpAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                                .addGroup(jpAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtApe, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
                                    .addComponent(txtNom, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
                                    .addComponent(txtDNI)))
                            .addGroup(jpAtributosLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpAtributosLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(optMasculino)
                        .addGap(49, 49, 49)
                        .addComponent(optFemenino)
                        .addGap(30, 30, 30))))
            .addGroup(jpAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpAtributosLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1)
                    .addContainerGap(313, Short.MAX_VALUE)))
        );
        jpAtributosLayout.setVerticalGroup(
            jpAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpAtributosLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jpAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApe, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(optFemenino)
                    .addComponent(optMasculino)
                    .addComponent(jLabel3))
                .addGap(61, 61, 61))
            .addGroup(jpAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpAtributosLayout.createSequentialGroup()
                    .addGap(15, 15, 15)
                    .addComponent(jLabel1)
                    .addContainerGap(234, Short.MAX_VALUE)))
        );

        jpComandos.setBackground(new java.awt.Color(255, 204, 153));

        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/guardar.png"))); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.setEnabled(false);
        btnRegistrar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/reportar.png"))); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.setEnabled(false);
        btnModificar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnModificar.setMaximumSize(new java.awt.Dimension(113, 41));
        btnModificar.setMinimumSize(new java.awt.Dimension(113, 41));
        btnModificar.setPreferredSize(new java.awt.Dimension(113, 41));
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/borrar.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setEnabled(false);
        btnEliminar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnEliminar.setMaximumSize(new java.awt.Dimension(113, 41));
        btnEliminar.setMinimumSize(new java.awt.Dimension(113, 41));
        btnEliminar.setPreferredSize(new java.awt.Dimension(113, 41));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/impresora.png"))); // NOI18N
        btnImprimir.setText("Imprimir");
        btnImprimir.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnImprimir.setMaximumSize(new java.awt.Dimension(113, 41));
        btnImprimir.setMinimumSize(new java.awt.Dimension(113, 41));
        btnImprimir.setPreferredSize(new java.awt.Dimension(113, 41));
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/nuevo.png"))); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpComandosLayout = new javax.swing.GroupLayout(jpComandos);
        jpComandos.setLayout(jpComandosLayout);
        jpComandosLayout.setHorizontalGroup(
            jpComandosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpComandosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpComandosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpComandosLayout.setVerticalGroup(
            jpComandosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpComandosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegistrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Total Registros");

        lblTotal.setBackground(new java.awt.Color(204, 255, 204));
        lblTotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTotal.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 51), 1, true));

        lblCodigo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCodigo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));

        jrNom.setText("Nombre");
        jrNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrNomActionPerformed(evt);
            }
        });

        jrDni.setText("DNI");
        jrDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrDniActionPerformed(evt);
            }
        });

        txtFiltro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtFiltro.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFiltro.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtFiltroCaretUpdate(evt);
            }
        });

        chkTodos.setSelected(true);
        chkTodos.setText("Todos");
        chkTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkTodosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chkTodos)
                .addGap(23, 23, 23)
                .addComponent(jrNom)
                .addGap(18, 18, 18)
                .addComponent(jrDni)
                .addGap(47, 47, 47)
                .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrDni)
                    .addComponent(jrNom)
                    .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkTodos))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jpAtributos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jpComandos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(jLabel5)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(lblCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpComandos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpAtributos, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtClienteMouseClicked
        try {
            int fila = jtCliente.getSelectedRow();
            if (fila >= 0) {
                btnModificar.setEnabled(true);
                btnEliminar.setEnabled(true);
                lblCodigo.setText(jtCliente.getValueAt(fila, 0).toString());
                idCliente = Integer.parseInt(jtCliente.getValueAt(fila, 0).toString());
                txtNom.setText(jtCliente.getValueAt(fila, 1).toString());
                txtApe.setText(jtCliente.getValueAt(fila, 2).toString());
                txtDNI.setText(jtCliente.getValueAt(fila, 4).toString());
                if (jtCliente.getValueAt(fila, 3).toString().equals("M")) {
                    optMasculino.setSelected(true);
                    optFemenino.setSelected(false);
                } else {
                    optFemenino.setSelected(true);
                    optMasculino.setSelected(false);
                }
                //                jdFecha.setDate(Date.valueOf(jtCliente.getValueAt(fila, 5).toString()));
            }
        } catch (Exception e) {
            System.out.println("Error en jtCliente " + e.getMessage());
        }
    }//GEN-LAST:event_jtClienteMouseClicked

    private void optMasculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optMasculinoActionPerformed
        if (optMasculino.isSelected() == true) {
            sexo = "M";
        } else {
            sexo = "F";
        }
    }//GEN-LAST:event_optMasculinoActionPerformed

    private void optFemeninoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optFemeninoActionPerformed
        if (optFemenino.isSelected() == true) {
            sexo = "F";
        } else {
            sexo = "M";
        }
    }//GEN-LAST:event_optFemeninoActionPerformed

    private void txtDNIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDNIKeyTyped
        char car = evt.getKeyChar();
        if (car < '0' || car > '9') { // sólo me acepta números del 0 al 9
            evt.consume();
        }
    }//GEN-LAST:event_txtDNIKeyTyped

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed

    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed

    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
//            int opcion = JOptionPane.showConfirmDialog(null, "Desea eliminar el registro", "Eliminación de Registro", JOptionPane.YES_NO_OPTION);

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        try {
//            ReportGenerator report = new ReportGenerator();
//            JasperPrint reportelleno = report.generarReporteSimpleCliente();
//            JasperViewer viewer = new JasperViewer(reportelleno, false);
//            viewer.setVisible(true);
        } catch (Exception e) {
            System.out.println("bntImprimir " + e.getMessage());
        }
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed

    }//GEN-LAST:event_btnNuevoActionPerformed

    private void jrNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrNomActionPerformed
        tipo = 2; // filtro x nombre
        chkTodos.setSelected(false);
        txtFiltro.requestFocus();
        txtFiltro.setEnabled(true);
    }//GEN-LAST:event_jrNomActionPerformed

    private void jrDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrDniActionPerformed
        tipo = 5; // filtrar por DNI
        chkTodos.setSelected(false);
        txtFiltro.requestFocus();
        txtFiltro.setEnabled(true);
    }//GEN-LAST:event_jrDniActionPerformed

    private void txtFiltroCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtFiltroCaretUpdate
        try {
            dato = txtFiltro.getText();
            Cargar_Tabla();
        } catch (Exception ex) {
            System.out.println("Error " + ex.getMessage());
        }
    }//GEN-LAST:event_txtFiltroCaretUpdate

    private void chkTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkTodosActionPerformed
        if (chkTodos.isSelected() == true) {
//            btnGroupFiltro.clearSelection();
            txtFiltro.setText("");
            dato = "";
            tipo = 1; // no filtrar
            txtFiltro.setEnabled(false);
            try {
                Cargar_Tabla();
            } catch (Exception ex) {
                System.out.println("Error " + ex.getMessage());
            }
        } else {

        }
    }//GEN-LAST:event_chkTodosActionPerformed
    private void Cargar_Tabla() throws Exception {
        String columna[] = new String[]{"Nro", "Nombre", "Apellidos", "Sexo", "DNI", "Nacimiento"};
   
        modeloTabla = new DefaultTableModel(null, columna);
        controller.listar(modeloTabla, tipo, dato);
        jtCliente.setModel(modeloTabla);
    }


    private void limpiar() {
        txtApe.setText("");
        txtNom.setText("");
        txtDNI.setText("");
    }

    private void habilitar() {
        txtNom.setEnabled(true);
        txtApe.setEnabled(true);
        txtDNI.setEnabled(true);
    }

    private void deshabilitar() {
        txtNom.setEnabled(false);
        txtApe.setEnabled(false);
        txtDNI.setEnabled(false);
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ClienteV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClienteV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClienteV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClienteV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClienteV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JCheckBox chkTodos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpAtributos;
    private javax.swing.JPanel jpComandos;
    private javax.swing.JRadioButton jrDni;
    private javax.swing.JRadioButton jrNom;
    private javax.swing.JTable jtCliente;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JRadioButton optFemenino;
    private javax.swing.JRadioButton optMasculino;
    public static javax.swing.JTextField txtApe;
    public static javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtFiltro;
    public static javax.swing.JTextField txtNom;
    // End of variables declaration//GEN-END:variables
}
