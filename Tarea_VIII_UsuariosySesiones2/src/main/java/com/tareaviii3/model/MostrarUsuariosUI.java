package com.tareaviii3.model;

import javax.swing.*;
import java.awt.*;
import java.util.List;
import com.tareaviii2.model.Usuario;
import com.tareaviii2.model.UsuarioDAO;

public class MostrarUsuariosUI {
    private JFrame frame;

    public MostrarUsuariosUI() {
        frame = new JFrame("Mostrar Usuarios");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());

        UsuarioDAO usuarioDAO = new UsuarioDAO();
        List<Usuario> usuarios = usuarioDAO.obtenerUsuarios();

        String[] columnas = {"ID", "Nombre", "Correo"};
        String[][] datos = new String[usuarios.size()][3];

        for (int i = 0; i < usuarios.size(); i++) {
            datos[i][0] = String.valueOf(usuarios.get(i).getId());
            datos[i][1] = usuarios.get(i).getNombre();
            datos[i][2] = usuarios.get(i).getCorreo();
        }

        JTable tablaUsuarios = new JTable(datos, columnas);
        JScrollPane scrollPane = new JScrollPane(tablaUsuarios);
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.setVisible(true);
    }
}