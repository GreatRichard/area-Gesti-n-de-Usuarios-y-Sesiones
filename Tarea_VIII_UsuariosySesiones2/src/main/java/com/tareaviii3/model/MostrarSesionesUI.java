package com.tareaviii3.model;

import javax.swing.*;
import java.awt.*;
import java.util.List;
import com.tareaviii2.model.Sesion;
import com.tareaviii2.model.SesionDAO;

public class MostrarSesionesUI {
    private JFrame frame;

    public MostrarSesionesUI() {
        frame = new JFrame("Mostrar Sesiones");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());

        SesionDAO sesionDAO = new SesionDAO();
        List<Sesion> sesiones = sesionDAO.obtenerSesiones();

        String[] columnas = {"ID", "ID Usuario", "Fecha de Inicio"};
        String[][] datos = new String[sesiones.size()][3];

        for (int i = 0; i < sesiones.size(); i++) {
            datos[i][0] = String.valueOf(sesiones.get(i).getId());
            datos[i][1] = String.valueOf(sesiones.get(i).getIdUsuario());
            datos[i][2] = sesiones.get(i).getFechaInicio().toString();
        }

        JTable tablaSesiones = new JTable(datos, columnas);
        JScrollPane scrollPane = new JScrollPane(tablaSesiones);
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.setVisible(true);
    }
}