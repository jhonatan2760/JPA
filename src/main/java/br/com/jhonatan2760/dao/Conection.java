package br.com.jhonatan2760.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * @author Jhonatan
 */
public abstract class Conection {

    public EntityManager retrieveConection() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("futebolPU");
        EntityManager em = emf.createEntityManager();
//        em.getTransaction().begin();
//        em.merge(time);
//        em.getTransaction().commit();
          return em;
    }
    
}
