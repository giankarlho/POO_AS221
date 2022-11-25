package service;

import javax.swing.JTextField;
import javax.swing.text.*;

public class LimitarCaracter extends PlainDocument {

    private JTextField editor;
    private int num;

    public LimitarCaracter(JTextField editor, int num) {
        this.editor = editor;
        this.num = num;
    }

    public void insertString(int arg0, String arg1, AttributeSet arg2) throws BadLocationException {
        if ((editor.getText().length() + arg1.length()) > this.num) {
            return;
        }
        super.insertString(arg0, arg1, arg2);

    }
    //Para que solo se permita numeros:

//    char car = evt.getKeyChar();
//
//    if(txtdni.getText().length()>=8) evt.consume(); //Para que el JTextField solo se le puedan ingresar 8 caracteres maximo.
//      if((car<'0' || car >'9')) evt.consume (); //Para que solo se puedan ingresar numeros.
//
//     //Para las letras:
//    char car = evt.getKeyChar();
//    if((car< 'a' || car >'z') && (car< 'A' || car >'Z') && (car !=(char)KeyEvent.VK_SPACE)){
//      evt.consume();
//    }
}
