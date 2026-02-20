package gui;

import javax.swing.JFrame;
import javax.swing.JButton;

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


        // Crear el botón
        JButton botonGuardar = new JButton("Guardar Cuenta");

        // Añadirlo a la ventana
        this.add(botonGuardar);

        // Forzar que se vea
        this.setVisible(true);
    }
}
