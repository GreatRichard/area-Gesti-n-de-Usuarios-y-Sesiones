package com.tareaviii2.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "sesiones")
public class Sesion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "id_usuario")
    private Long idUsuario;  // Asegúrate de que esta línea esté presente

    @Column(name = "fecha_inicio")
    private Date fechaInicio;

    // Constructor
    public Sesion() {
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdUsuario() {  // Asegúrate de que este método esté presente
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {  // Asegúrate de que este método esté presente
        this.idUsuario = idUsuario;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
}