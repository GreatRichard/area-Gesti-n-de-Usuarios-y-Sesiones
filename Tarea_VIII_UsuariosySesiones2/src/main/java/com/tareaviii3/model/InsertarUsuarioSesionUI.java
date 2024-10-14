package com.tareaviii3.model;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.tareaviii2.model.Usuario;
import com.tareaviii2.model.Sesion;
import com.tareaviii2.model.UsuarioDAO;
import com.tareaviii2.model.SesionDAO;

public class InsertarUsuarioSesionUI {
    private JFrame frame;
    private JTextField txtNombre;
    private JTextField txtCorreo;
    private JButton btnGuardar;

    public InsertarUsuarioSesionUI() {
        frame = new JFrame("Insertar Usuario y Sesión");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new GridLayout(4, 2));

        frame.add(new JLabel("Nombre:"));
        txtNombre = new JTextField();
        frame.add(txtNombre);

        frame.add(new JLabel("Correo:"));
        txtCorreo = new JTextField();
        frame.add(txtCorreo);

        btnGuardar = new JButton("Guardar");
        frame.add(btnGuardar);

        btnGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                guardarUsuarioYSesion();
            }
        });

        frame.setVisible(true);
    }

    private void guardarUsuarioYSesion() {
        String nombre = txtNombre.getText();
        String correo = txtCorreo.getText();
        Usuario usuario = new Usuario();
        usuario.setNombre(nombre);
        usuario.setCorreo(correo);

        UsuarioDAO usuarioDAO = new UsuarioDAO();
        usuarioDAO.insertarUsuario(usuario);

        Sesion sesion = new Sesion();
        sesion.setIdUsuario(usuario.getId());
        sesion.setFechaInicio(new java.util.Date());

        SesionDAO sesionDAO = new SesionDAO();
        sesionDAO.insertarSesion(sesion);

        JOptionPane.showMessageDialog(frame, "Usuario y sesión guardados.");
        frame.dispose();
    }
}