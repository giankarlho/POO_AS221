package panels;

import java.util.Timer;
import java.util.TimerTask;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Yakenpo extends javax.swing.JPanel {

    public static int contador = 0;
    Icon icono;
    int eleccionJugador = 0;

    public Yakenpo() {
        initComponents();
        int velocidad = 200;
        Timer timer;
        TimerTask jugada = new TimerTask() {
            @Override
            public void run() {
                switch (contador) {
                    case 0:
                        contador = 1;
                        icono = new ImageIcon(getClass().getResource("/image/piedra1.png"));
                        lblComputadora.setIcon(icono);
                        break;
                    case 1:
                        contador = 2;
                        icono = new ImageIcon(getClass().getResource("/image/papel1.png"));
                        lblComputadora.setIcon(icono);
                        break;
                    case 2:
                        contador = 0;
                        icono = new ImageIcon(getClass().getResource("/image/tijera1.png"));
                        lblComputadora.setIcon(icono);
                        break;
                }
            }
        };
        timer = new Timer();
        timer.scheduleAtFixedRate(jugada, velocidad, velocidad);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblJugador = new javax.swing.JLabel();
        lblComputadora = new javax.swing.JLabel();
        btnJugar = new javax.swing.JButton();
        btnPiedra = new javax.swing.JButton();
        btnPapel = new javax.swing.JButton();
        btnTijera = new javax.swing.JButton();
        lblPuntosJugador = new javax.swing.JLabel();
        lblPuntosComputadora = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(700, 500));
        setMinimumSize(new java.awt.Dimension(700, 500));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Jugador 1");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("Computadora");

        lblJugador.setBackground(new java.awt.Color(204, 255, 204));
        lblJugador.setOpaque(true);

        lblComputadora.setBackground(new java.awt.Color(255, 255, 204));
        lblComputadora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblComputadora.setOpaque(true);

        btnJugar.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btnJugar.setText("Jugar");
        btnJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJugarActionPerformed(evt);
            }
        });

        btnPiedra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/piedra1.png"))); // NOI18N
        btnPiedra.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/piedra_rojo.png"))); // NOI18N
        btnPiedra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPiedraActionPerformed(evt);
            }
        });

        btnPapel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/papel1.png"))); // NOI18N
        btnPapel.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/papel_rojo.png"))); // NOI18N
        btnPapel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPapelActionPerformed(evt);
            }
        });

        btnTijera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/tijera1.png"))); // NOI18N
        btnTijera.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/tijera_rojo.png"))); // NOI18N
        btnTijera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTijeraActionPerformed(evt);
            }
        });

        lblPuntosJugador.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblPuntosJugador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPuntosJugador.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 51, 51), 6, true));

        lblPuntosComputadora.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblPuntosComputadora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPuntosComputadora.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 51, 51), 6, true));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(btnPiedra))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(296, 296, 296)
                        .addComponent(btnJugar)
                        .addGap(36, 36, 36)
                        .addComponent(lblPuntosComputadora, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel4)
                        .addGap(256, 256, 256)
                        .addComponent(jLabel5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(lblJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(211, 211, 211)
                        .addComponent(lblComputadora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(lblPuntosJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addComponent(btnPapel)
                        .addGap(36, 36, 36)
                        .addComponent(btnTijera)))
                .addGap(49, 49, 49))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(btnJugar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                        .addComponent(btnPapel))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblComputadora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblJugador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPuntosJugador, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPuntosComputadora, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTijera, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnPiedra, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(55, 55, 55))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnPiedraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPiedraActionPerformed
        icono = new ImageIcon(getClass().getResource("/image/piedra1.png"));
        lblJugador.setIcon(icono);
    }//GEN-LAST:event_btnPiedraActionPerformed

    private void btnPapelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPapelActionPerformed
        icono = new ImageIcon(getClass().getResource("/image/papel1.png"));
        lblJugador.setIcon(icono);
    }//GEN-LAST:event_btnPapelActionPerformed

    private void btnTijeraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTijeraActionPerformed
        icono = new ImageIcon(getClass().getResource("/image/tijera1.png"));
        lblJugador.setIcon(icono);
    }//GEN-LAST:event_btnTijeraActionPerformed

    private void btnJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugarActionPerformed
        // 0 -> piedra, 1-> papel, 2-> tijera
        int jugada =(int)(Math.random()*3);
        
    }//GEN-LAST:event_btnJugarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnJugar;
    private javax.swing.JButton btnPapel;
    private javax.swing.JButton btnPiedra;
    private javax.swing.JButton btnTijera;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblComputadora;
    private javax.swing.JLabel lblJugador;
    private javax.swing.JLabel lblPuntosComputadora;
    private javax.swing.JLabel lblPuntosJugador;
    // End of variables declaration//GEN-END:variables
}
