package view;

import services.CalculadoraS;

public class Calculadora extends javax.swing.JFrame {

    char operador = 0;
    double nro1 = 0.0, resultado = 0.0;
    
    public Calculadora() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jlblResultado = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jbtnPrimo = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jbtnSumar = new javax.swing.JButton();
        jbtnRestar = new javax.swing.JButton();
        jbtnMultiplicar = new javax.swing.JButton();
        jbtnResiduo = new javax.swing.JButton();
        jbtnDividir = new javax.swing.JButton();
        jbtnIgual = new javax.swing.JButton();
        jbtnLimpiar = new javax.swing.JButton();
        jbtnBorrar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jbtn0 = new javax.swing.JButton();
        jbtn1 = new javax.swing.JButton();
        jbtn2 = new javax.swing.JButton();
        jbtn3 = new javax.swing.JButton();
        jbtn4 = new javax.swing.JButton();
        jbtn5 = new javax.swing.JButton();
        jbtn6 = new javax.swing.JButton();
        jbtn7 = new javax.swing.JButton();
        jbtn8 = new javax.swing.JButton();
        jbtn9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        jlblResultado.setBackground(new java.awt.Color(255, 255, 255));
        jlblResultado.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jlblResultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblResultado.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 51, 51), 1, true));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(jlblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        jlblResultado.getAccessibleContext().setAccessibleName("jlblResultado");

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));

        jbtnPrimo.setText("Primo");
        jbtnPrimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPrimoActionPerformed(evt);
            }
        });

        jButton2.setText("Factorial");

        jButton3.setText("Fibonacci");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbtnPrimo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnPrimo)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(72, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 204, 204));

        jbtnSumar.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        jbtnSumar.setText("+");
        jbtnSumar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnSumar.setMaximumSize(new java.awt.Dimension(100, 250));
        jbtnSumar.setMinimumSize(new java.awt.Dimension(100, 150));
        jbtnSumar.setPreferredSize(new java.awt.Dimension(100, 150));
        jbtnSumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSumarActionPerformed(evt);
            }
        });

        jbtnRestar.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        jbtnRestar.setText("-");
        jbtnRestar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnRestar.setMaximumSize(new java.awt.Dimension(100, 100));
        jbtnRestar.setMinimumSize(new java.awt.Dimension(100, 100));
        jbtnRestar.setPreferredSize(new java.awt.Dimension(100, 100));
        jbtnRestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRestarActionPerformed(evt);
            }
        });

        jbtnMultiplicar.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        jbtnMultiplicar.setText("*");
        jbtnMultiplicar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnMultiplicar.setMaximumSize(new java.awt.Dimension(100, 100));
        jbtnMultiplicar.setMinimumSize(new java.awt.Dimension(100, 100));
        jbtnMultiplicar.setPreferredSize(new java.awt.Dimension(100, 100));
        jbtnMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnMultiplicarActionPerformed(evt);
            }
        });

        jbtnResiduo.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        jbtnResiduo.setText("%");
        jbtnResiduo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnResiduo.setMaximumSize(new java.awt.Dimension(100, 100));
        jbtnResiduo.setMinimumSize(new java.awt.Dimension(100, 100));
        jbtnResiduo.setPreferredSize(new java.awt.Dimension(100, 100));
        jbtnResiduo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnResiduoActionPerformed(evt);
            }
        });

        jbtnDividir.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        jbtnDividir.setText("/");
        jbtnDividir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnDividir.setMaximumSize(new java.awt.Dimension(100, 100));
        jbtnDividir.setMinimumSize(new java.awt.Dimension(100, 100));
        jbtnDividir.setPreferredSize(new java.awt.Dimension(100, 100));
        jbtnDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDividirActionPerformed(evt);
            }
        });

        jbtnIgual.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        jbtnIgual.setText("=");
        jbtnIgual.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnIgual.setMaximumSize(new java.awt.Dimension(100, 100));
        jbtnIgual.setMinimumSize(new java.awt.Dimension(100, 100));
        jbtnIgual.setPreferredSize(new java.awt.Dimension(100, 100));
        jbtnIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnIgualActionPerformed(evt);
            }
        });

        jbtnLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        jbtnLimpiar.setText("C");
        jbtnLimpiar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnLimpiar.setMaximumSize(new java.awt.Dimension(100, 100));
        jbtnLimpiar.setMinimumSize(new java.awt.Dimension(100, 100));
        jbtnLimpiar.setPreferredSize(new java.awt.Dimension(100, 100));
        jbtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLimpiarActionPerformed(evt);
            }
        });

        jbtnBorrar.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        jbtnBorrar.setText("<-");
        jbtnBorrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnBorrar.setMaximumSize(new java.awt.Dimension(100, 100));
        jbtnBorrar.setMinimumSize(new java.awt.Dimension(100, 100));
        jbtnBorrar.setPreferredSize(new java.awt.Dimension(100, 100));
        jbtnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBorrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jbtnResiduo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnRestar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnSumar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbtnMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnIgual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnDividir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jbtnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbtnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnSumar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnRestar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnResiduo, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(189, 189, 189))
        );

        jPanel4.setBackground(new java.awt.Color(204, 255, 255));

        jbtn0.setBackground(new java.awt.Color(255, 102, 102));
        jbtn0.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jbtn0.setForeground(new java.awt.Color(255, 255, 255));
        jbtn0.setText("0");
        jbtn0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn0ActionPerformed(evt);
            }
        });

        jbtn1.setBackground(new java.awt.Color(255, 102, 102));
        jbtn1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jbtn1.setForeground(new java.awt.Color(255, 255, 255));
        jbtn1.setText("1");
        jbtn1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn1ActionPerformed(evt);
            }
        });

        jbtn2.setBackground(new java.awt.Color(255, 102, 102));
        jbtn2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jbtn2.setForeground(new java.awt.Color(255, 255, 255));
        jbtn2.setText("2");
        jbtn2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn2ActionPerformed(evt);
            }
        });

        jbtn3.setBackground(new java.awt.Color(255, 102, 102));
        jbtn3.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jbtn3.setForeground(new java.awt.Color(255, 255, 255));
        jbtn3.setText("3");
        jbtn3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn3ActionPerformed(evt);
            }
        });

        jbtn4.setBackground(new java.awt.Color(255, 102, 102));
        jbtn4.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jbtn4.setForeground(new java.awt.Color(255, 255, 255));
        jbtn4.setText("4");
        jbtn4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn4ActionPerformed(evt);
            }
        });

        jbtn5.setBackground(new java.awt.Color(255, 102, 102));
        jbtn5.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jbtn5.setForeground(new java.awt.Color(255, 255, 255));
        jbtn5.setText("5");
        jbtn5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn5ActionPerformed(evt);
            }
        });

        jbtn6.setBackground(new java.awt.Color(255, 102, 102));
        jbtn6.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jbtn6.setForeground(new java.awt.Color(255, 255, 255));
        jbtn6.setText("6");
        jbtn6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn6ActionPerformed(evt);
            }
        });

        jbtn7.setBackground(new java.awt.Color(255, 102, 102));
        jbtn7.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jbtn7.setForeground(new java.awt.Color(255, 255, 255));
        jbtn7.setText("7");
        jbtn7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn7ActionPerformed(evt);
            }
        });

        jbtn8.setBackground(new java.awt.Color(255, 102, 102));
        jbtn8.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jbtn8.setForeground(new java.awt.Color(255, 255, 255));
        jbtn8.setText("8");
        jbtn8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn8ActionPerformed(evt);
            }
        });

        jbtn9.setBackground(new java.awt.Color(255, 102, 102));
        jbtn9.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jbtn9.setForeground(new java.awt.Color(255, 255, 255));
        jbtn9.setText("9");
        jbtn9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtn7)
                    .addComponent(jbtn4)
                    .addComponent(jbtn1))
                .addGap(10, 10, 10)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtn0)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbtn8)
                            .addComponent(jbtn5)
                            .addComponent(jbtn2))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbtn9)
                            .addComponent(jbtn6)
                            .addComponent(jbtn3))))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbtn8)
                        .addComponent(jbtn7))
                    .addComponent(jbtn9))
                .addGap(10, 10, 10)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtn4)
                    .addComponent(jbtn5)
                    .addComponent(jbtn6))
                .addGap(10, 10, 10)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtn1)
                    .addComponent(jbtn2)
                    .addComponent(jbtn3))
                .addGap(10, 10, 10)
                .addComponent(jbtn0)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn0ActionPerformed
        jlblResultado.setText(jlblResultado.getText() + jbtn0.getText());
    }//GEN-LAST:event_jbtn0ActionPerformed

    private void jbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn1ActionPerformed
        jlblResultado.setText(jlblResultado.getText() + jbtn1.getText());
    }//GEN-LAST:event_jbtn1ActionPerformed

    private void jbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn2ActionPerformed
        jlblResultado.setText(jlblResultado.getText() + jbtn2.getText());
    }//GEN-LAST:event_jbtn2ActionPerformed

    private void jbtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn3ActionPerformed
        jlblResultado.setText(jlblResultado.getText() + jbtn3.getText());
    }//GEN-LAST:event_jbtn3ActionPerformed

    private void jbtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn4ActionPerformed
        jlblResultado.setText(jlblResultado.getText() + jbtn4.getText());
    }//GEN-LAST:event_jbtn4ActionPerformed

    private void jbtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn5ActionPerformed
        jlblResultado.setText(jlblResultado.getText() + jbtn5.getText());
    }//GEN-LAST:event_jbtn5ActionPerformed

    private void jbtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn6ActionPerformed
        jlblResultado.setText(jlblResultado.getText() + jbtn6.getText());
    }//GEN-LAST:event_jbtn6ActionPerformed

    private void jbtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn7ActionPerformed
        jlblResultado.setText(jlblResultado.getText() + jbtn7.getText());
    }//GEN-LAST:event_jbtn7ActionPerformed

    private void jbtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn8ActionPerformed
        jlblResultado.setText(jlblResultado.getText() + jbtn8.getText());
    }//GEN-LAST:event_jbtn8ActionPerformed

    private void jbtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn9ActionPerformed
        jlblResultado.setText(jlblResultado.getText() + jbtn9.getText());
    }//GEN-LAST:event_jbtn9ActionPerformed

    private void jbtnSumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSumarActionPerformed
        operador = '+';
    }//GEN-LAST:event_jbtnSumarActionPerformed

    private void jbtnMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnMultiplicarActionPerformed
        operador = '*';
    }//GEN-LAST:event_jbtnMultiplicarActionPerformed

    private void jbtnRestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRestarActionPerformed
        operador = '-';
    }//GEN-LAST:event_jbtnRestarActionPerformed

    private void jbtnDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDividirActionPerformed
        operador = '/';
    }//GEN-LAST:event_jbtnDividirActionPerformed

    private void jbtnResiduoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnResiduoActionPerformed
        operador = '%';
    }//GEN-LAST:event_jbtnResiduoActionPerformed

    private void jbtnIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnIgualActionPerformed
        
    }//GEN-LAST:event_jbtnIgualActionPerformed

    private void jbtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLimpiarActionPerformed
        jlblResultado.setText("");
    }//GEN-LAST:event_jbtnLimpiarActionPerformed

    private void jbtnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBorrarActionPerformed
         int cantidad = jlblResultado.getText().length() - 1;
         jlblResultado.setText(jlblResultado.getText().substring(0, cantidad));
    }//GEN-LAST:event_jbtnBorrarActionPerformed

    private void jbtnPrimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPrimoActionPerformed
        CalculadoraS calculadora = new CalculadoraS();
        jlblResultado.setText(calculadora.esPrimo(Integer.parseInt(jlblResultado.getText())));
    }//GEN-LAST:event_jbtnPrimoActionPerformed

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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton jbtn0;
    private javax.swing.JButton jbtn1;
    private javax.swing.JButton jbtn2;
    private javax.swing.JButton jbtn3;
    private javax.swing.JButton jbtn4;
    private javax.swing.JButton jbtn5;
    private javax.swing.JButton jbtn6;
    private javax.swing.JButton jbtn7;
    private javax.swing.JButton jbtn8;
    private javax.swing.JButton jbtn9;
    private javax.swing.JButton jbtnBorrar;
    private javax.swing.JButton jbtnDividir;
    private javax.swing.JButton jbtnIgual;
    private javax.swing.JButton jbtnLimpiar;
    private javax.swing.JButton jbtnMultiplicar;
    private javax.swing.JButton jbtnPrimo;
    private javax.swing.JButton jbtnResiduo;
    private javax.swing.JButton jbtnRestar;
    private javax.swing.JButton jbtnSumar;
    private javax.swing.JLabel jlblResultado;
    // End of variables declaration//GEN-END:variables
}
