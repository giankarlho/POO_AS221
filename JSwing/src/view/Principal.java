package view;

import java.awt.BorderLayout;
import java.awt.Component;
import panels.Yakenpo;
import panels.jpCirculo;
import panels.jpCuadrado;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        this.setSize(900, 550);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpMenu = new javax.swing.JPanel();
        btnCirculo = new javax.swing.JButton();
        btnCuadrado = new javax.swing.JButton();
        btnYakenpo = new javax.swing.JButton();
        jpPrincipal = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(870, 520));
        setMinimumSize(new java.awt.Dimension(870, 520));
        setPreferredSize(new java.awt.Dimension(870, 520));

        jpMenu.setBackground(new java.awt.Color(153, 204, 255));
        jpMenu.setMaximumSize(new java.awt.Dimension(150, 500));
        jpMenu.setMinimumSize(new java.awt.Dimension(150, 500));
        jpMenu.setPreferredSize(new java.awt.Dimension(150, 500));

        btnCirculo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCirculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/circulo_button_96.png"))); // NOI18N
        btnCirculo.setContentAreaFilled(false);
        btnCirculo.setMaximumSize(new java.awt.Dimension(120, 100));
        btnCirculo.setMinimumSize(new java.awt.Dimension(120, 100));
        btnCirculo.setPreferredSize(new java.awt.Dimension(120, 100));
        btnCirculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCirculoActionPerformed(evt);
            }
        });

        btnCuadrado.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCuadrado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/cuadrado_button_128.png"))); // NOI18N
        btnCuadrado.setContentAreaFilled(false);
        btnCuadrado.setMaximumSize(new java.awt.Dimension(120, 100));
        btnCuadrado.setMinimumSize(new java.awt.Dimension(120, 100));
        btnCuadrado.setPreferredSize(new java.awt.Dimension(120, 100));
        btnCuadrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuadradoActionPerformed(evt);
            }
        });

        btnYakenpo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnYakenpo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/yakenpo_128.jpg"))); // NOI18N
        btnYakenpo.setText("YakenPo");
        btnYakenpo.setContentAreaFilled(false);
        btnYakenpo.setMaximumSize(new java.awt.Dimension(120, 100));
        btnYakenpo.setMinimumSize(new java.awt.Dimension(120, 100));
        btnYakenpo.setPreferredSize(new java.awt.Dimension(120, 100));
        btnYakenpo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYakenpoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpMenuLayout = new javax.swing.GroupLayout(jpMenu);
        jpMenu.setLayout(jpMenuLayout);
        jpMenuLayout.setHorizontalGroup(
            jpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMenuLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCirculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnYakenpo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCuadrado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpMenuLayout.setVerticalGroup(
            jpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpMenuLayout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(btnYakenpo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCirculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCuadrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        jpPrincipal.setBackground(new java.awt.Color(255, 204, 204));
        jpPrincipal.setMaximumSize(new java.awt.Dimension(700, 500));
        jpPrincipal.setMinimumSize(new java.awt.Dimension(700, 500));
        jpPrincipal.setPreferredSize(new java.awt.Dimension(700, 500));

        javax.swing.GroupLayout jpPrincipalLayout = new javax.swing.GroupLayout(jpPrincipal);
        jpPrincipal.setLayout(jpPrincipalLayout);
        jpPrincipalLayout.setHorizontalGroup(
            jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        jpPrincipalLayout.setVerticalGroup(
            jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jpMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jpPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCirculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCirculoActionPerformed
        jpCirculo circulo = new jpCirculo();
        circulo.setSize(700, 500);
        circulo.setLocation(0, 0);
        jpPrincipal.removeAll();
        jpPrincipal.add(circulo, BorderLayout.CENTER);
        jpPrincipal.revalidate();
        jpPrincipal.repaint();

    }//GEN-LAST:event_btnCirculoActionPerformed

    private void btnCuadradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuadradoActionPerformed
        jpCuadrado cuadrado = new jpCuadrado();
        cuadrado.setSize(700, 500);
        cuadrado.setLocation(0, 0);
        jpPrincipal.removeAll();
        jpPrincipal.add(cuadrado, BorderLayout.CENTER);
        jpPrincipal.revalidate();
        jpPrincipal.repaint();
    }//GEN-LAST:event_btnCuadradoActionPerformed

    private void btnYakenpoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYakenpoActionPerformed
        Yakenpo yakenpo = new Yakenpo();
        yakenpo.setSize(700, 500);
        yakenpo.setLocation(0, 0);
        jpPrincipal.removeAll();
        jpPrincipal.add(yakenpo, BorderLayout.CENTER);
        jpPrincipal.revalidate();
        jpPrincipal.repaint();
    }//GEN-LAST:event_btnYakenpoActionPerformed

    public void mostrar(Object object) {
        jpPrincipal.removeAll();
        jpPrincipal.add((Component) object, BorderLayout.CENTER);
        jpPrincipal.revalidate();
        jpPrincipal.repaint();
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCirculo;
    private javax.swing.JButton btnCuadrado;
    private javax.swing.JButton btnYakenpo;
    private javax.swing.JPanel jpMenu;
    private javax.swing.JPanel jpPrincipal;
    // End of variables declaration//GEN-END:variables
}
