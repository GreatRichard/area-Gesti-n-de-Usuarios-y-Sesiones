package com.tareaviii3.model;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainUI {
    private JFrame frame;

    public MainUI() {
        frame = new JFrame("Gestión de Usuarios y Sesiones");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new FlowLayout());

        JButton btnInsertar = new JButton("Insertar Usuario y Sesión");
        JButton btnMostrarUsuarios = new JButton("Mostrar Usuarios");
        JButton btnMostrarSesiones = new JButton("Mostrar Sesiones");
        JButton btnSalir = new JButton("Salir");

        btnInsertar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarPantallaInsertar();
            }
        });

        btnMostrarUsuarios.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarPantallaMostrarUsuarios();
            }
        });

        btnMostrarSesiones.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarPantallaMostrarSesiones();
            }
        });

        btnSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        frame.add(btnInsertar);
        frame.add(btnMostrarUsuarios);
        frame.add(btnMostrarSesiones);
        frame.add(btnSalir);

        frame.setVisible(true);
    }

    private void mostrarPantallaInsertar() {
        new InsertarUsuarioSesionUI();
    }

    private void mostrarPantallaMostrarUsuarios() {
        new MostrarUsuariosUI();
    }

    private void mostrarPantallaMostrarSesiones() {
        new MostrarSesionesUI();
    }

    public static void main(String[] args) {
        new MainUI();
    }
}