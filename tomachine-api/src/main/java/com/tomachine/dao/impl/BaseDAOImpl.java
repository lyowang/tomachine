package com.tomachine.dao.impl;

import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by twang on 4/15/16.
 */
public abstract class BaseDAOImpl<E> {
    @PersistenceContext(unitName = "tomachinePersistenceUnit")
    protected EntityManager em;

    @Transactional
    public void remove(E entity) {
        em.remove(entity);
    }

    @Transactional
    public void add(E entity) {
        em.persist(entity);
    }

    @Transactional
    public void update(E entity) {
        em.merge(entity);
    }
}
