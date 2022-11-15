package panels;

import java.util.Timer;
import java.util.TimerTask;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import services.GamesS;

public class Yakenpo extends javax.swing.JPanel {
    
    int cantVictorias = 0, cantDerrotas = 0, cantJugadas = 0;
    int figura = 0;             // por defecto en piedra    
    boolean estado = true;      // para reiniciar la jugada
    Timer timer;                
    TimerTask jugada;
    Icon icono;

    public Yakenpo() {
        initComponents();
        comenzarAnimacion();   
        
        pVictoria.setVisible(false);
        pDerrota.setVisible(false);
        
        GamesS.reproducirSonido("src/sound/pacmanMusic.wav");
    }

    public void comenzarAnimacion() {
        jugada = new TimerTask() {
            @Override
            public void run() {
                switch (figura) {
                    case 0:
                        figura = 1;
                        icono = new ImageIcon(getClass().getResource("/image/piedra1.png"));
                        lblComputadora.setIcon(icono);
                        break;
                    case 1:
                        figura = 2;
                        icono = new ImageIcon(getClass().getResource("/image/papel1.png"));
                        lblComputadora.setIcon(icono);
                        break;
                    case 2:
                        figura = 0;
                        icono = new ImageIcon(getClass().getResource("/image/tijera1.png"));
                        lblComputadora.setIcon(icono);
                        break;
                }
            }
        };
        timer = new Timer();
        timer.scheduleAtFixedRate(jugada, 200, 200);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pYakenpo = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblJugador = new javax.swing.JLabel();
        lblComputadora = new javax.swing.JLabel();
        lblResultado = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnPapel = new javax.swing.JButton();
        btnTijera = new javax.swing.JButton();
        btnPiedra = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblPuntosComputadora = new javax.swing.JLabel();
        btnJugar = new javax.swing.JButton();
        lblPuntosJugador = new javax.swing.JLabel();
        pDerrota = new javax.swing.JPanel();
        btnJugarDerrota = new javax.swing.JButton();
        btnCerrar1 = new javax.swing.JButton();
        lblPuntosJugador1 = new javax.swing.JLabel();
        lblPuntosComputadora1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblDerrota = new javax.swing.JLabel();
        pVictoria = new javax.swing.JPanel();
        btnJugarVictoria = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        lblPuntosJugador2 = new javax.swing.JLabel();
        lblPuntosComputadora2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblVictoria = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(700, 500));
        setMinimumSize(new java.awt.Dimension(700, 500));
        setPreferredSize(new java.awt.Dimension(700, 500));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(680, 200));
        jPanel1.setMinimumSize(new java.awt.Dimension(680, 200));
        jPanel1.setPreferredSize(new java.awt.Dimension(680, 200));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Jugador 1");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("Computadora");

        lblJugador.setBackground(new java.awt.Color(204, 255, 204));
        lblJugador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblJugador.setMaximumSize(new java.awt.Dimension(200, 150));
        lblJugador.setMinimumSize(new java.awt.Dimension(200, 150));
        lblJugador.setOpaque(true);
        lblJugador.setPreferredSize(new java.awt.Dimension(200, 150));

        lblComputadora.setBackground(new java.awt.Color(255, 255, 204));
        lblComputadora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblComputadora.setMaximumSize(new java.awt.Dimension(200, 150));
        lblComputadora.setMinimumSize(new java.awt.Dimension(200, 150));
        lblComputadora.setOpaque(true);
        lblComputadora.setPreferredSize(new java.awt.Dimension(200, 150));

        lblResultado.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblJugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(244, 244, 244)
                        .addComponent(lblComputadora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(45, 45, 45))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblJugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblComputadora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(13, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64))))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 204));

        btnPapel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/papel1.png"))); // NOI18N
        btnPapel.setMaximumSize(new java.awt.Dimension(200, 150));
        btnPapel.setMinimumSize(new java.awt.Dimension(200, 150));
        btnPapel.setPreferredSize(new java.awt.Dimension(200, 150));
        btnPapel.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/papel_rojo.png"))); // NOI18N
        btnPapel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPapelMouseEntered(evt);
            }
        });
        btnPapel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPapelActionPerformed(evt);
            }
        });

        btnTijera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/tijera1.png"))); // NOI18N
        btnTijera.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnTijera.setMaximumSize(new java.awt.Dimension(200, 150));
        btnTijera.setMinimumSize(new java.awt.Dimension(200, 150));
        btnTijera.setPreferredSize(new java.awt.Dimension(200, 150));
        btnTijera.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/tijera_rojo.png"))); // NOI18N
        btnTijera.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTijeraMouseEntered(evt);
            }
        });
        btnTijera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTijeraActionPerformed(evt);
            }
        });

        btnPiedra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/piedra1.png"))); // NOI18N
        btnPiedra.setMaximumSize(new java.awt.Dimension(200, 150));
        btnPiedra.setMinimumSize(new java.awt.Dimension(200, 150));
        btnPiedra.setPreferredSize(new java.awt.Dimension(200, 150));
        btnPiedra.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/piedra_rojo.png"))); // NOI18N
        btnPiedra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPiedraMouseEntered(evt);
            }
        });
        btnPiedra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPiedraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btnPiedra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(btnPapel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnTijera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnPiedra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTijera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPapel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));

        lblPuntosComputadora.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblPuntosComputadora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPuntosComputadora.setAlignmentY(1.0F);
        lblPuntosComputadora.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 51, 51), 6, true));

        btnJugar.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btnJugar.setText("Jugar");
        btnJugar.setAlignmentY(1.0F);
        btnJugar.setEnabled(false);
        btnJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJugarActionPerformed(evt);
            }
        });

        lblPuntosJugador.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblPuntosJugador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPuntosJugador.setAlignmentY(1.0F);
        lblPuntosJugador.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 51, 51), 6, true));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(lblPuntosJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addComponent(btnJugar)
                .addGap(80, 80, 80)
                .addComponent(lblPuntosComputadora, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblPuntosJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnJugar)
                    .addComponent(lblPuntosComputadora, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout pYakenpoLayout = new javax.swing.GroupLayout(pYakenpo);
        pYakenpo.setLayout(pYakenpoLayout);
        pYakenpoLayout.setHorizontalGroup(
            pYakenpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pYakenpoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pYakenpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(pYakenpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pYakenpoLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 13, Short.MAX_VALUE)))
        );
        pYakenpoLayout.setVerticalGroup(
            pYakenpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pYakenpoLayout.createSequentialGroup()
                .addContainerGap(221, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(pYakenpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pYakenpoLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(270, 283, Short.MAX_VALUE)))
        );

        add(pYakenpo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pDerrota.setBackground(new java.awt.Color(0, 0, 0));
        pDerrota.setMaximumSize(new java.awt.Dimension(700, 500));
        pDerrota.setMinimumSize(new java.awt.Dimension(700, 500));
        pDerrota.setPreferredSize(new java.awt.Dimension(700, 500));
        pDerrota.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnJugarDerrota.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/play1_128.png"))); // NOI18N
        btnJugarDerrota.setContentAreaFilled(false);
        btnJugarDerrota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJugarDerrotaActionPerformed(evt);
            }
        });
        pDerrota.add(btnJugarDerrota, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 380, 130, 70));

        btnCerrar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/cerrar_64.png"))); // NOI18N
        btnCerrar1.setContentAreaFilled(false);
        btnCerrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrar1ActionPerformed(evt);
            }
        });
        pDerrota.add(btnCerrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 70, 80));

        lblPuntosJugador1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblPuntosJugador1.setForeground(new java.awt.Color(255, 255, 255));
        lblPuntosJugador1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPuntosJugador1.setAlignmentY(1.0F);
        lblPuntosJugador1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 51, 51), 6, true));
        lblPuntosJugador1.setMaximumSize(new java.awt.Dimension(90, 50));
        lblPuntosJugador1.setMinimumSize(new java.awt.Dimension(90, 50));
        lblPuntosJugador1.setName(""); // NOI18N
        lblPuntosJugador1.setPreferredSize(new java.awt.Dimension(90, 50));
        pDerrota.add(lblPuntosJugador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, -1));

        lblPuntosComputadora1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblPuntosComputadora1.setForeground(new java.awt.Color(255, 255, 255));
        lblPuntosComputadora1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPuntosComputadora1.setAlignmentY(1.0F);
        lblPuntosComputadora1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 51, 51), 6, true));
        lblPuntosComputadora1.setMaximumSize(new java.awt.Dimension(90, 50));
        lblPuntosComputadora1.setMinimumSize(new java.awt.Dimension(90, 50));
        lblPuntosComputadora1.setPreferredSize(new java.awt.Dimension(90, 50));
        pDerrota.add(lblPuntosComputadora1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 240, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Computadora");
        pDerrota.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 180, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Jugador");
        pDerrota.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        lblDerrota.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/fondo_derrota1.jpg"))); // NOI18N
        pDerrota.add(lblDerrota, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 690, 440));

        add(pDerrota, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pVictoria.setBackground(new java.awt.Color(255, 255, 255));
        pVictoria.setMaximumSize(new java.awt.Dimension(700, 500));
        pVictoria.setMinimumSize(new java.awt.Dimension(700, 500));
        pVictoria.setPreferredSize(new java.awt.Dimension(700, 500));
        pVictoria.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnJugarVictoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/play1_128.png"))); // NOI18N
        btnJugarVictoria.setContentAreaFilled(false);
        btnJugarVictoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJugarVictoriaActionPerformed(evt);
            }
        });
        pVictoria.add(btnJugarVictoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 130, 70));

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/cerrar_64.png"))); // NOI18N
        btnCerrar.setContentAreaFilled(false);
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        pVictoria.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 0, 70, 80));

        lblPuntosJugador2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblPuntosJugador2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPuntosJugador2.setAlignmentY(1.0F);
        lblPuntosJugador2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 51, 51), 6, true));
        lblPuntosJugador2.setMaximumSize(new java.awt.Dimension(90, 50));
        lblPuntosJugador2.setMinimumSize(new java.awt.Dimension(90, 50));
        lblPuntosJugador2.setPreferredSize(new java.awt.Dimension(90, 50));
        pVictoria.add(lblPuntosJugador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, -1, -1));

        lblPuntosComputadora2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblPuntosComputadora2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPuntosComputadora2.setAlignmentY(1.0F);
        lblPuntosComputadora2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 51, 51), 6, true));
        lblPuntosComputadora2.setMaximumSize(new java.awt.Dimension(90, 50));
        lblPuntosComputadora2.setMinimumSize(new java.awt.Dimension(90, 50));
        lblPuntosComputadora2.setPreferredSize(new java.awt.Dimension(90, 50));
        pVictoria.add(lblPuntosComputadora2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 410, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel3.setText("Computadora");
        pVictoria.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 350, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel6.setText("Jugador");
        pVictoria.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, -1, -1));

        lblVictoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/fondo_victoria1.jpg"))); // NOI18N
        pVictoria.add(lblVictoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 680, 240));

        add(pVictoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnPiedraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPiedraActionPerformed
        // 0 -> piedra, 1-> papel, 2-> tijera
        timer.cancel();
        icono = new ImageIcon(getClass().getResource("/image/piedra1.png"));
        lblJugador.setIcon(icono);
        int jugada = (int) (Math.random() * 3);
        switch (jugada) {
            case 0:
                icono = new ImageIcon(getClass().getResource("/image/piedra1.png"));
                lblResultado.setText("Empate !!!");
                cantJugadas -= 1;
                break;
            case 1:
                icono = new ImageIcon(getClass().getResource("/image/papel1.png"));
                lblResultado.setText("Derrota !!!");
                cantDerrotas += 1;
                break;
            case 2:
                icono = new ImageIcon(getClass().getResource("/image/tijera1.png"));
                lblResultado.setText("Victoria !!!");
                cantVictorias += 1;
                break;
        }
        lblComputadora.setIcon(icono);
        lblPuntosComputadora.setText(String.valueOf(cantDerrotas));
        lblPuntosJugador.setText(String.valueOf(cantVictorias));
        estado = false;
        cantJugadas += 1;
        btnJugar.setEnabled(true);
        activarBotones(false);
        terminarJuego(cantJugadas);
    }//GEN-LAST:event_btnPiedraActionPerformed

    private void btnPapelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPapelActionPerformed
        // 0 -> piedra, 1-> papel, 2-> tijera
        timer.cancel();
        icono = new ImageIcon(getClass().getResource("/image/papel1.png"));
        lblJugador.setIcon(icono);
        int jugada = (int) (Math.random() * 3);
        switch (jugada) {
            case 0:
                icono = new ImageIcon(getClass().getResource("/image/piedra1.png"));
                lblResultado.setText("Victoria !!!");
                cantVictorias += 1;

                break;
            case 1:
                icono = new ImageIcon(getClass().getResource("/image/papel1.png"));
                lblResultado.setText("Empate !!!");
                cantJugadas -= 1;
                break;
            case 2:
                icono = new ImageIcon(getClass().getResource("/image/tijera1.png"));
                lblResultado.setText("Derrota !!!");
                cantDerrotas += 1;

                break;
        }
        lblComputadora.setIcon(icono);
        lblPuntosComputadora.setText(String.valueOf(cantDerrotas));
        lblPuntosJugador.setText(String.valueOf(cantVictorias));
        estado = false;
        cantJugadas += 1;
        btnJugar.setEnabled(true);
        activarBotones(false);
        terminarJuego(cantJugadas);
    }//GEN-LAST:event_btnPapelActionPerformed

    private void btnTijeraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTijeraActionPerformed
        // 0 -> piedra, 1-> papel, 2-> tijera
        timer.cancel();
        icono = new ImageIcon(getClass().getResource("/image/tijera1.png"));
        lblJugador.setIcon(icono);
        int jugada = (int) (Math.random() * 3);
        switch (jugada) {
            case 0:
                icono = new ImageIcon(getClass().getResource("/image/piedra1.png"));
                lblResultado.setText("Derrota !!!");
                cantDerrotas += 1;
                break;
            case 1:
                icono = new ImageIcon(getClass().getResource("/image/papel1.png"));
                lblResultado.setText("Victoria !!!");
                cantVictorias += 1;
                break;
            case 2:
                icono = new ImageIcon(getClass().getResource("/image/tijera1.png"));
                lblResultado.setText("Empate !!!");
                cantJugadas -= 1;
                break;
        }
        lblComputadora.setIcon(icono);
        lblPuntosComputadora.setText(String.valueOf(cantDerrotas));
        lblPuntosJugador.setText(String.valueOf(cantVictorias));
        estado = false;
        cantJugadas += 1;
        btnJugar.setEnabled(true);
        activarBotones(false);
        terminarJuego(cantJugadas);
    }//GEN-LAST:event_btnTijeraActionPerformed

    private void btnJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugarActionPerformed
        btnJugar.setEnabled(false);
        comenzarAnimacion();
        estado = true;
        activarBotones(true);
    }//GEN-LAST:event_btnJugarActionPerformed

    private void btnPiedraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPiedraMouseEntered
        if (estado == true) {
            icono = new ImageIcon(getClass().getResource("/image/piedra1.png"));
            lblJugador.setIcon(icono);
        }
    }//GEN-LAST:event_btnPiedraMouseEntered

    private void btnTijeraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTijeraMouseEntered
        if (estado == true) {
            icono = new ImageIcon(getClass().getResource("/image/tijera1.png"));
            lblJugador.setIcon(icono);
        }
    }//GEN-LAST:event_btnTijeraMouseEntered

    private void btnPapelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPapelMouseEntered
        if (estado == true) {
            icono = new ImageIcon(getClass().getResource("/image/papel1.png"));
            lblJugador.setIcon(icono);
        }
    }//GEN-LAST:event_btnPapelMouseEntered

    private void btnJugarVictoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugarVictoriaActionPerformed
        nuevoJuego();
    }//GEN-LAST:event_btnJugarVictoriaActionPerformed

    private void btnJugarDerrotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugarDerrotaActionPerformed
        nuevoJuego();
    }//GEN-LAST:event_btnJugarDerrotaActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnCerrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrar1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnCerrar1ActionPerformed

    public void activarBotones(Boolean estado) {
        btnPiedra.setEnabled(estado);
        btnTijera.setEnabled(estado);
        btnPapel.setEnabled(estado);
    }

    public void terminarJuego(int cantJugadas) {
        if (cantJugadas == 3) {            
            pYakenpo.setVisible(false);            
            GamesS.clip.stop();
            if (Integer.parseInt(lblPuntosJugador.getText()) > Integer.parseInt(lblPuntosComputadora.getText())) {
                pVictoria.setVisible(true);
                pDerrota.setVisible(false);
                lblPuntosComputadora2.setText(String.valueOf(cantDerrotas));
                lblPuntosJugador2.setText(String.valueOf(cantVictorias));
                GamesS.reproducirSonido("src/sound/game-win-2016.wav");
            } else if (Integer.parseInt(lblPuntosJugador.getText()) < Integer.parseInt(lblPuntosComputadora.getText())) {
                pDerrota.setVisible(true);
                pVictoria.setVisible(false);
                lblPuntosComputadora1.setText(String.valueOf(cantDerrotas));
                lblPuntosJugador1.setText(String.valueOf(cantVictorias));
                GamesS.reproducirSonido("src/sound/game-over-213.wav");
            }
        }
    }

    public void limpiar() {
        lblPuntosComputadora.setText("");
        lblPuntosJugador.setText("");
        lblResultado.setText("");
    }

    public void nuevoJuego() {
        pVictoria.setVisible(false);
        pDerrota.setVisible(false);
        pYakenpo.setVisible(true);
        limpiar();
        GamesS.clip.stop();
        GamesS.reproducirSonido("src/sound/pacmanMusic.wav");
        cantJugadas = cantVictorias = cantDerrotas = 0;
    }
    
    // Código para redimensionar imágenes
//    public void SetImageLabel(JLabel labelName, String root) {
//        ImageIcon image = new ImageIcon(root);
//        Icon icon = new ImageIcon(
//                image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(), Image.SCALE_DEFAULT));
//        labelName.setIcon(icon);
//        this.repaint();
//    }
//
//    public void SetImageButton(JButton buttonName, String root) {
//        ImageIcon image = new ImageIcon(root);
//        Icon icon = new ImageIcon(
//                image.getImage().getScaledInstance(buttonName.getWidth(), buttonName.getHeight(), Image.SCALE_DEFAULT));
//        buttonName.setIcon(icon);
//        this.repaint();
//    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnCerrar1;
    private javax.swing.JButton btnJugar;
    private javax.swing.JButton btnJugarDerrota;
    private javax.swing.JButton btnJugarVictoria;
    private javax.swing.JButton btnPapel;
    private javax.swing.JButton btnPiedra;
    private javax.swing.JButton btnTijera;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblComputadora;
    private javax.swing.JLabel lblDerrota;
    private javax.swing.JLabel lblJugador;
    private javax.swing.JLabel lblPuntosComputadora;
    private javax.swing.JLabel lblPuntosComputadora1;
    private javax.swing.JLabel lblPuntosComputadora2;
    private javax.swing.JLabel lblPuntosJugador;
    private javax.swing.JLabel lblPuntosJugador1;
    private javax.swing.JLabel lblPuntosJugador2;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JLabel lblVictoria;
    private javax.swing.JPanel pDerrota;
    private javax.swing.JPanel pVictoria;
    private javax.swing.JPanel pYakenpo;
    // End of variables declaration//GEN-END:variables

}
