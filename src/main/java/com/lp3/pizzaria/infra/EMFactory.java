/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lp3.pizzaria.infra;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Arthur C. Lima
 */
public class EMFactory {

    private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("pizzariaPU");

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void close() {
        emf.close();
    }
}
