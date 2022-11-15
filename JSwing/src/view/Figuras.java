package view;

import java.awt.BorderLayout;
import java.awt.Component;

import jpanels.jpTriangulo;
import panels.jpCirculo;
import panels.jpCuadrado;
import panels.jpPentagono;

public class Figuras extends javax.swing.JFrame {

    public Figuras() {
        initComponents();
        btnFiguras.add(rdnCirculo);
        btnFiguras.add(rdnCuadrado);
        btnFiguras.add(rdnTriangulo);
        btnFiguras.add(rdnPentagono);
        this.setSize(700, 550);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnFiguras = new javax.swing.ButtonGroup();
        jpMenu = new javax.swing.JPanel();
        cboFiguras = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        rdnCuadrado = new javax.swing.JRadioButton();
        rdnCirculo = new javax.swing.JRadioButton();
        rdnTriangulo = new javax.swing.JRadioButton();
        rdnPentagono = new javax.swing.JRadioButton();
        jpFigura = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(700, 550));
        setMinimumSize(new java.awt.Dimension(700, 550));
        setPreferredSize(new java.awt.Dimension(700, 550));

        jpMenu.setBackground(new java.awt.Color(204, 255, 204));
        jpMenu.setMaximumSize(new java.awt.Dimension(700, 50));
        jpMenu.setMinimumSize(new java.awt.Dimension(700, 50));
        jpMenu.setPreferredSize(new java.awt.Dimension(700, 50));

        cboFiguras.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cboFiguras.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Cuadrado", "Circulo", "Triángulo", "Pentágono", "Aquí ps Anghela" }));
        cboFiguras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboFigurasActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Seleccione:");

        rdnCuadrado.setBackground(new java.awt.Color(204, 255, 204));
        rdnCuadrado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rdnCuadrado.setText("Cuadrado");
        rdnCuadrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdnCuadradoActionPerformed(evt);
            }
        });

        rdnCirculo.setBackground(new java.awt.Color(204, 255, 204));
        rdnCirculo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rdnCirculo.setText("Circulo");
        rdnCirculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdnCirculoActionPerformed(evt);
            }
        });

        rdnTriangulo.setBackground(new java.awt.Color(204, 255, 204));
        rdnTriangulo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rdnTriangulo.setText("Triangulo");
        rdnTriangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdnTrianguloActionPerformed(evt);
            }
        });

        rdnPentagono.setBackground(new java.awt.Color(204, 255, 204));
        rdnPentagono.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rdnPentagono.setText("Pentágono");
        rdnPentagono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdnPentagonoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpMenuLayout = new javax.swing.GroupLayout(jpMenu);
        jpMenu.setLayout(jpMenuLayout);
        jpMenuLayout.setHorizontalGroup(
            jpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMenuLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(cboFiguras, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rdnCuadrado)
                .addGap(18, 18, 18)
                .addComponent(rdnCirculo)
                .addGap(13, 13, 13)
                .addComponent(rdnTriangulo)
                .addGap(18, 18, 18)
                .addComponent(rdnPentagono)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jpMenuLayout.setVerticalGroup(
            jpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMenuLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cboFiguras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rdnCuadrado)
                        .addComponent(rdnCirculo)
                        .addComponent(rdnTriangulo)
                        .addComponent(rdnPentagono))
                    .addComponent(jLabel1))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jpFigura.setBackground(new java.awt.Color(255, 204, 204));
        jpFigura.setMaximumSize(new java.awt.Dimension(700, 500));
        jpFigura.setMinimumSize(new java.awt.Dimension(700, 500));
        jpFigura.setPreferredSize(new java.awt.Dimension(700, 500));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/area.jpg"))); // NOI18N

        javax.swing.GroupLayout jpFiguraLayout = new javax.swing.GroupLayout(jpFigura);
        jpFigura.setLayout(jpFiguraLayout);
        jpFiguraLayout.setHorizontalGroup(
            jpFiguraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFiguraLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpFiguraLayout.setVerticalGroup(
            jpFiguraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFiguraLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpFigura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpFigura, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rdnCuadradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdnCuadradoActionPerformed
        jpCuadrado cuadrado = new jpCuadrado();
        cuadrado.setSize(700, 500);
        cuadrado.setLocation(0, 0);
        mostrar(cuadrado);
//        jpFigura.removeAll();
//        jpFigura.add(cuadrado, BorderLayout.CENTER);
//        jpFigura.revalidate();
//        jpFigura.repaint();
    }//GEN-LAST:event_rdnCuadradoActionPerformed

    private void rdnCirculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdnCirculoActionPerformed
        jpCirculo circulo = new jpCirculo();
        circulo.setSize(700, 500);
        circulo.setLocation(0, 0);
        mostrar(circulo);
//        jpFigura.removeAll();
//        jpFigura.add(circulo, BorderLayout.CENTER);
//        jpFigura.revalidate();
//        jpFigura.repaint();
    }//GEN-LAST:event_rdnCirculoActionPerformed

    private void rdnTrianguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdnTrianguloActionPerformed
        jpTriangulo triangulo = new jpTriangulo();
        triangulo.setSize(700, 500);
        triangulo.setLocation(0, 0);
        mostrar(triangulo);
//        jpFigura.removeAll();
//        jpFigura.add(triangulo, BorderLayout.CENTER);
//        jpFigura.revalidate();
//        jpFigura.repaint();
    }//GEN-LAST:event_rdnTrianguloActionPerformed

    private void cboFigurasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboFigurasActionPerformed
        // Estoy tomando el index del combo, empieza en 0
        //System.out.println("Selección-> " + cboFiguras.getSelectedIndex());
        int figura = cboFiguras.getSelectedIndex();
        switch (figura) {
            case 1:
                jpCuadrado cuadrado = new jpCuadrado();
                cuadrado.setSize(700, 500);
                cuadrado.setLocation(0, 0);
                mostrar(cuadrado);
//                jpFigura.removeAll();
//                jpFigura.add(cuadrado, BorderLayout.CENTER);
//                jpFigura.revalidate();
//                jpFigura.repaint();
                break;
            case 2:
                jpCirculo circulo = new jpCirculo();
                circulo.setSize(700, 500);
                circulo.setLocation(0, 0);
                mostrar(circulo);
//                jpFigura.removeAll();
//                jpFigura.add(circulo, BorderLayout.CENTER);
//                jpFigura.revalidate();
//                jpFigura.repaint();
                break;
            case 3:
                jpTriangulo triangulo = new jpTriangulo();
                triangulo.setSize(700, 500);
                triangulo.setLocation(0, 0);
                mostrar(triangulo);
//                jpFigura.removeAll();
//                jpFigura.add(triangulo, BorderLayout.CENTER);
//                jpFigura.revalidate();
//                jpFigura.repaint();
                break;
            case 4:
                jpPentagono pentagono = new jpPentagono();
                pentagono.setSize(700, 500);
                pentagono.setLocation(0, 0);
                mostrar(pentagono);
//                jpFigura.removeAll();
//                jpFigura.add(pentagono, BorderLayout.CENTER);
//                jpFigura.revalidate();
//                jpFigura.repaint();
                break;
        }
    }//GEN-LAST:event_cboFigurasActionPerformed

    private void rdnPentagonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdnPentagonoActionPerformed
        jpPentagono pentagono = new jpPentagono();
        pentagono.setSize(700, 500);
        pentagono.setLocation(0, 0);
        mostrar(pentagono);
//        jpFigura.removeAll();
//        jpFigura.add(pentagono, BorderLayout.CENTER);
//        jpFigura.revalidate();
//        jpFigura.repaint();
    }//GEN-LAST:event_rdnPentagonoActionPerformed

    public void mostrar(Object objeto) {
        jpFigura.removeAll();
        jpFigura.add((Component) objeto, BorderLayout.CENTER);
        jpFigura.revalidate();
        jpFigura.repaint();
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
            java.util.logging.Logger.getLogger(Figuras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Figuras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Figuras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Figuras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Figuras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnFiguras;
    private javax.swing.JComboBox<String> cboFiguras;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jpFigura;
    private javax.swing.JPanel jpMenu;
    private javax.swing.JRadioButton rdnCirculo;
    private javax.swing.JRadioButton rdnCuadrado;
    private javax.swing.JRadioButton rdnPentagono;
    private javax.swing.JRadioButton rdnTriangulo;
    // End of variables declaration//GEN-END:variables
}
