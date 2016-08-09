/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package machinetoolstore.core.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
/**
 *
 * @author main
 */

public class BasicDaoAction <PK extends Serializable, T> {
    
    @Autowired
    private EntityManagerFactory entityManagerFactory;
    
    @PersistenceContext
    private EntityManager entityManager;
    
    private final Class<T> persistentClass;
    
    public BasicDaoAction() {
        this.persistentClass = 
                (Class<T>)((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[1];
    }
    
    public void persist(T entity) {
        entityManager.persist(entity);
    }
    
    public void remove(T entity) {
        entityManager.remove(entity);
    }
    
    public void merge(T entity) {
        entityManager.merge(entity);
    }
    
    public T findByKey(PK key) {
        return entityManagerFactory.createEntityManager().find(persistentClass, key);
    }
    
    public CriteriaBuilder getCriteriaBuilder() {
        return entityManager.getCriteriaBuilder();
    }
    
    public EntityManager getEntityManager() {
        return entityManager;
    }
}
