package panels;


public class jpCirculo extends javax.swing.JPanel {

    public jpCirculo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtxtRadio = new javax.swing.JTextField();
        jlblArea = new javax.swing.JLabel();
        jlblPerimetro = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jlbFigura = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(700, 500));
        setMinimumSize(new java.awt.Dimension(700, 500));
        setPreferredSize(new java.awt.Dimension(700, 500));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtxtRadio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jtxtRadio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtRadio.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jtxtRadioCaretUpdate(evt);
            }
        });
        add(jtxtRadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 250, 120, -1));

        jlblArea.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlblArea.setForeground(new java.awt.Color(255, 0, 153));
        jlblArea.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblArea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4));
        add(jlblArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 100, 40));

        jlblPerimetro.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlblPerimetro.setForeground(new java.awt.Color(255, 0, 153));
        jlblPerimetro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblPerimetro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4));
        add(jlblPerimetro, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 100, 40));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Perìmetro");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Àrea");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Radio");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 210, -1, -1));

        jlbFigura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/circulo.png"))); // NOI18N
        add(jlbFigura, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtRadioCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jtxtRadioCaretUpdate
        if (jtxtRadio.getText().length() > 0) {
            double radio = Double.parseDouble(jtxtRadio.getText());
            jlblArea.setText(String.valueOf(Math.PI * Math.pow(radio, 2)));
            jlblPerimetro.setText(String.valueOf(2 * Math.PI * radio));
            double area = Math.round(Double.parseDouble(jlblArea.getText())*100.00)/100.00;
            jlblArea.setText(String.valueOf(area));
            double perimetro = Math.round(Double.parseDouble(jlblPerimetro.getText())*100.00)/100.00;
            jlblPerimetro.setText(String.valueOf(perimetro));
        }else{
            jtxtRadio.setText("");
            jlblArea.setText("");
            jlblPerimetro.setText("");
        }
    }//GEN-LAST:event_jtxtRadioCaretUpdate


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jlbFigura;
    private javax.swing.JLabel jlblArea;
    private javax.swing.JLabel jlblPerimetro;
    private javax.swing.JTextField jtxtRadio;
    // End of variables declaration//GEN-END:variables
}
