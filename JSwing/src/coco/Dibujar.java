package coco;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.Timer;
import javax.swing.JPanel;

public class Dibujar extends JPanel implements ActionListener {
    
    Coco carro = new Coco();
    Timer timer = new Timer(5, this);    // cada 5 milisegundos
    
    public Dibujar() {
        setBackground(Color.BLACK);
        setFocusable(true);
        addKeyListener(new Teclado());
        timer.start();
    }
    
    public void paint(Graphics grafica) {
        super.paint(grafica);
        Graphics2D g2 = (Graphics2D) grafica;
        g2.drawImage(carro.tenerImagen(), carro.tenerX(), carro.tenerY(), null);
    }    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        carro.mover();
        repaint();
    }
    
    private class Teclado extends KeyAdapter {

        public void keyPressed(KeyEvent e) {
            carro.keyPressed(e);
        }

        public void keyReleased(KeyEvent e) {
            carro.keyReleased(e);
        }
    }
    
}
