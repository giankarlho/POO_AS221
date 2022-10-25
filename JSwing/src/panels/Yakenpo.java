package panels;

import java.util.TimerTask;
import java.util.Timer;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Yakenpo extends javax.swing.JPanel {

    public static int contador = 0;
    Icon icono;

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
                        lblOponente.setIcon(icono); break;
                    case 1:
                        contador = 2;
                        icono = new ImageIcon(getClass().getResource("/image/papel1.png"));
                        lblOponente.setIcon(icono); break;
                    case 2:
                        contador = 0;
                        icono = new ImageIcon(getClass().getResource("/image/tijera1.png"));
                        lblOponente.setIcon(icono); break;
                }
            }
        };
        timer = new Timer();
        timer.scheduleAtFixedRate(jugada, velocidad, velocidad);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblOponente = new javax.swing.JLabel();
        lblJugador = new javax.swing.JLabel();
        papel = new javax.swing.JButton();
        tijera = new javax.swing.JButton();
        piedra = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblPuntosJugador = new javax.swing.JLabel();
        lblPuntosPC = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(700, 500));
        setMinimumSize(new java.awt.Dimension(700, 500));
        setPreferredSize(new java.awt.Dimension(700, 500));

        lblOponente.setBackground(new java.awt.Color(204, 255, 204));
        lblOponente.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        lblOponente.setOpaque(true);

        lblJugador.setBackground(new java.awt.Color(204, 255, 204));
        lblJugador.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        lblJugador.setOpaque(true);

        papel.setForeground(new java.awt.Color(255, 255, 255));
        papel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/papel1.png"))); // NOI18N
        papel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        papel.setContentAreaFilled(false);
        papel.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/papel_rojo.png"))); // NOI18N
        papel.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/papel_rojo.png"))); // NOI18N

        tijera.setForeground(new java.awt.Color(255, 255, 255));
        tijera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/tijera1.png"))); // NOI18N
        tijera.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tijera.setContentAreaFilled(false);

        piedra.setForeground(new java.awt.Color(255, 255, 255));
        piedra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/piedra1.png"))); // NOI18N
        piedra.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        piedra.setContentAreaFilled(false);

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jButton4.setText("Jugar");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Jugador");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setText("Computadora");

        lblPuntosJugador.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblPuntosJugador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPuntosJugador.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 4, true));

        lblPuntosPC.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblPuntosPC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPuntosPC.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 4, true));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(59, 59, 59))
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPuntosJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblOponente, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(piedra)
                            .addComponent(jButton4))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(lblPuntosPC, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                                .addComponent(tijera, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(papel, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblOponente, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton4)
                    .addComponent(lblPuntosPC, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPuntosJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(piedra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tijera, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(papel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblJugador;
    private javax.swing.JLabel lblOponente;
    private javax.swing.JLabel lblPuntosJugador;
    private javax.swing.JLabel lblPuntosPC;
    private javax.swing.JButton papel;
    private javax.swing.JButton piedra;
    private javax.swing.JButton tijera;
    // End of variables declaration//GEN-END:variables
}
