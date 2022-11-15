package coco;

import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

public class Coco {

    String coco;
    int dx;
    int dy;
    int x;  // objeto en posición x 
    int y;  // objeto en posición y
    Image imagen;
    ImageIcon icono;

    public Coco() {
        x = 40;
        y = 60;
        coco = "/image/cocodrilo.gif";
        icono = new ImageIcon(this.getClass().getResource(coco));
        imagen = icono.getImage();
    }

    // Detectar que se presiona la tecla
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_LEFT) {
            dx = -1;
        }
        if (key == KeyEvent.VK_RIGHT) {
            dx = 1;
        }
        if (key == KeyEvent.VK_UP) {
            dy = -1;
        }
        if (key == KeyEvent.VK_DOWN) {
            dy = 1;
        }
    }

    // Cuando soltamos la tecla
    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_LEFT) {
            dx = 0;
        }
        if (key == KeyEvent.VK_RIGHT) {
            dx = 0;
        }
        if (key == KeyEvent.VK_UP) {
            dy = 0;
        }
        if (key == KeyEvent.VK_DOWN) {
            dy = 0;
        }
    }
    
    // Mover
    public void mover(){
        x += dx;
        y += dy;
    }

    // Funciones para retornar valores
    public int tenerX(){
        return x;
    }
    
    public int tenerY(){
        return y;
    }
    public Image tenerImagen(){
        return imagen;
    }
}
