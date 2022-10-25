package panels;

public class jpCuadrado extends javax.swing.JPanel {

    public jpCuadrado() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlblPerimetro = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jlblArea = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtxtLado = new javax.swing.JTextField();
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
        jLabel4.setText("Lado");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 230, -1, -1));

        jlblArea.setBackground(new java.awt.Color(255, 255, 255));
        jlblArea.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jlblArea.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblArea.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 255, 102), 3, true));
        add(jlblArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 120, 40));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setText("Perímetro");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, -1));

        jtxtLado.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jtxtLado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtLado.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jtxtLadoCaretUpdate(evt);
            }
        });
        add(jtxtLado, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 280, 110, 40));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/cuadrado.png"))); // NOI18N
        add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtLadoCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jtxtLadoCaretUpdate
        if (jtxtLado.getText().length() > 0) {
            double lado = Double.valueOf(jtxtLado.getText());
            lado = Math.round(lado*100.00)/100.00;  
//            String.format("%.2f", n))
            jlblPerimetro.setText(String.valueOf(lado * 4));
//            jlblPerimetro.setText(String.format("%.2f", (lado * 4)));
            jlblArea.setText(String.valueOf(lado * lado));
//            jlblArea.setText(String.format("%.2f", lado * lado));
        } else {
            jlblPerimetro.setText("");
            jlblArea.setText("");
        }
    }//GEN-LAST:event_jtxtLadoCaretUpdate


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jlblArea;
    private javax.swing.JLabel jlblPerimetro;
    private javax.swing.JTextField jtxtLado;
    // End of variables declaration//GEN-END:variables
}
