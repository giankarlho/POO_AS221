package view;

public class Menú extends javax.swing.JFrame {

    public Menú() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        lblFondo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenCalculadora = new javax.swing.JMenu();
        jCalculadora = new javax.swing.JMenuItem();
        jMenBingo = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jmitFiguras = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/fondo2.jpg"))); // NOI18N
        lblFondo.setText("jLabel2");

        jMenCalculadora.setText("Calculadora");
        jMenCalculadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenCalculadoraActionPerformed(evt);
            }
        });

        jCalculadora.setText("Calculadora");
        jCalculadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCalculadoraActionPerformed(evt);
            }
        });
        jMenCalculadora.add(jCalculadora);

        jMenuBar1.add(jMenCalculadora);

        jMenBingo.setText("Bingo");
        jMenuBar1.add(jMenBingo);

        jMenu1.setText("Figuras");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jmitFiguras.setText("Figuras");
        jmitFiguras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmitFigurasActionPerformed(evt);
            }
        });
        jMenu1.add(jmitFiguras);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 1281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenCalculadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenCalculadoraActionPerformed
        Calculadora calculadora = new Calculadora();
        calculadora.isVisible();
        calculadora.show();
    }//GEN-LAST:event_jMenCalculadoraActionPerformed

    private void jCalculadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCalculadoraActionPerformed
        Calculadora calculadora = new Calculadora();
        calculadora.isVisible();
        calculadora.show();
    }//GEN-LAST:event_jCalculadoraActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed

    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jmitFigurasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmitFigurasActionPerformed
        Figuras figuras = new Figuras();
        figuras.isVisible();
        figuras.show();
    }//GEN-LAST:event_jmitFigurasActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menú.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menú.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menú.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menú.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menú().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem jCalculadora;
    private javax.swing.JMenu jMenBingo;
    private javax.swing.JMenu jMenCalculadora;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jmitFiguras;
    private javax.swing.JLabel lblFondo;
    // End of variables declaration//GEN-END:variables
}
