package panels;

public class jpPentagono extends javax.swing.JPanel {

  
    public jpPentagono() {
        initComponents();
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlblArea = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtxtLado = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jlblPerimetro = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(700, 500));
        setMinimumSize(new java.awt.Dimension(700, 500));
        setPreferredSize(new java.awt.Dimension(700, 500));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlblArea.setBackground(new java.awt.Color(255, 255, 255));
        jlblArea.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jlblArea.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblArea.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 255, 102), 3, true));
        add(jlblArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 120, 40));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setText("Perímetro");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Lado");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 230, -1, -1));

        jtxtLado.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jtxtLado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtLado.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jtxtLadoCaretUpdate(evt);
            }
        });
        add(jtxtLado, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 280, 110, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Área");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, -1));

        jlblPerimetro.setBackground(new java.awt.Color(255, 255, 255));
        jlblPerimetro.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jlblPerimetro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblPerimetro.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 255, 102), 3, true));
        add(jlblPerimetro, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 120, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/pentagono.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtLadoCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jtxtLadoCaretUpdate
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtLadoCaretUpdate


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jlblArea;
    private javax.swing.JLabel jlblPerimetro;
    private javax.swing.JTextField jtxtLado;
    // End of variables declaration//GEN-END:variables
}
