/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpanels;

/**
 *
 * @author Monitor
 */
public class jpTriangulo extends javax.swing.JPanel {

    /**
     * Creates new form jpTriangulo
     */
    public jpTriangulo() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlblPerimetro = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jlblArea = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtxtAltura = new javax.swing.JTextField();
        jtxtBase = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(700, 500));
        setMinimumSize(new java.awt.Dimension(700, 500));
        setPreferredSize(new java.awt.Dimension(700, 500));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlblPerimetro.setBackground(new java.awt.Color(255, 255, 255));
        jlblPerimetro.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jlblPerimetro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblPerimetro.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 255, 102), 3, true));
        add(jlblPerimetro, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 120, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Área");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Base");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 340, -1, -1));

        jlblArea.setBackground(new java.awt.Color(255, 255, 255));
        jlblArea.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jlblArea.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblArea.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 255, 102), 3, true));
        add(jlblArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 120, 40));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setText("Perímetro");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, -1));

        jtxtAltura.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jtxtAltura.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtAltura.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jtxtAlturaCaretUpdate(evt);
            }
        });
        add(jtxtAltura, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 270, 110, 40));

        jtxtBase.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jtxtBase.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtBase.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jtxtBaseCaretUpdate(evt);
            }
        });
        add(jtxtBase, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 390, 110, 40));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("Altura");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 230, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/triangulo.png"))); // NOI18N
        add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtAlturaCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jtxtAlturaCaretUpdate
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtAlturaCaretUpdate

    private void jtxtBaseCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jtxtBaseCaretUpdate
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtBaseCaretUpdate


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jlblArea;
    private javax.swing.JLabel jlblPerimetro;
    private javax.swing.JTextField jtxtAltura;
    private javax.swing.JTextField jtxtBase;
    // End of variables declaration//GEN-END:variables
}
