package com.tareaviii2.model;

import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.List;

public class SesionDAO {

    // Método para insertar una nueva sesión
    public void insertarSesion(Sesion sesion) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getCurrentSession()) {
            transaction = session.beginTransaction();
            session.save(sesion);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    // Método para obtener todas las sesiones
    @SuppressWarnings("unchecked")
    public List<Sesion> obtenerSesiones() {
        List<Sesion> sesiones = null;
        try (Session session = HibernateUtil.getCurrentSession()) {
            session.beginTransaction();
            sesiones = session.createQuery("from Sesion").list();
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sesiones;
    }
}
