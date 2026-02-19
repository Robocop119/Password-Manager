package gui;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame{
    public VentanaPrincipal(){
        // Título de la ventana
        this.setTitle("Gestor de Contraseñas");

        // Tamaño de la ventana
        this.setSize(700, 500);

        //Para que el programa se cierre al cerrar la ventana
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Centrar la ventana en la pantalla
        this.setLocationRelativeTo(null);
    }
}
