/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lp3.pizzaria.dao;

import com.lp3.pizzaria.model.Usuario;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author Arthur C. Lima
 */
public class UsuarioDao implements Dao {

    private EntityManager em;

    public UsuarioDao(EntityManager em) {
        this.em = em;
    }

    @Override
    public void salvar(Object object) {
        Usuario usuario = (Usuario) object;
        try {
            em.getTransaction().begin();
            em.persist(usuario);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void atualizar(Object object) {
        Usuario usuario = (Usuario) object;
        try {
            em.getTransaction().begin();
            em.merge(usuario);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deletar(Object object) {
        Usuario usuario = (Usuario) object;
        try {
            em.getTransaction().begin();
            em.remove(usuario);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Usuario> pegarTodos() {
        List<Usuario> usuarios = new ArrayList<>();
        try {
            usuarios = em.createQuery("FROM Usuario", Usuario.class).getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (em != null) {
                em.close();
            }
        }
        return usuarios;
    }

    @Override
    public Object buscar(Object object) {
        Usuario usuario = (Usuario) object;
        try {
            usuario = em.createQuery("FROM Usuario us WHERE us.nome = :user.nome OR us.login = :user.login OR us.id :user.id", Usuario.class)
                    .setParameter("user", usuario)
                    .setMaxResults(1)
                    .getSingleResult();
        } catch (Exception e) {
            e.printStackTrace();
        } 
        return usuario;
    }

}
