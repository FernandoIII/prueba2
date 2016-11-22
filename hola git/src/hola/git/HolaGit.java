/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hola.git;

import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class HolaGit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre;
        nombre=JOptionPane.showInputDialog("Hola, por favor ingresa tu nombre");
        JOptionPane.showMessageDialog(null,"hola "+nombre+" te damos la mas cordial bienvenida/o a git");
    }
    
}
