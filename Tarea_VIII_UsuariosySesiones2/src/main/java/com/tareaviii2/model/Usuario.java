package com.tareaviii2.model;

import javax.persistence.*;

@Entity
@Table(name = "usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;  // Asegúrate de que esta línea esté presente

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "correo")
    private String correo;

    // Constructor
    public Usuario() {
    }

    // Getters y Setters
    public Long getId() {  // Asegúrate de que este método esté presente
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}