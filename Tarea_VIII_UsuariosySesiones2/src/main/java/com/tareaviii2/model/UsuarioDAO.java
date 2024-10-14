package com.tareaviii2.model;

import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.List;

public class UsuarioDAO {

    // Método para insertar un nuevo usuario
    public void insertarUsuario(Usuario usuario) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getCurrentSession()) {
            transaction = session.beginTransaction();
            session.save(usuario);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    // Método para obtener todos los usuarios
    @SuppressWarnings("unchecked")
    public List<Usuario> obtenerUsuarios() {
        List<Usuario> usuarios = null;
        try (Session session = HibernateUtil.getCurrentSession()) {
            session.beginTransaction();
            usuarios = session.createQuery("from Usuario").list();
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return usuarios;
    }
}