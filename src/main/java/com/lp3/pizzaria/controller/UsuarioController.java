/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lp3.pizzaria.controller;

import com.lp3.pizzaria.dao.UsuarioDao;
import com.lp3.pizzaria.model.Usuario;
import java.util.List;

/**
 *
 * @author Arthur C. Lima
 */
public class UsuarioController implements Controller{

    @Override
    public void salvar(Object object) {
        Usuario usuario = (Usuario) object;
        
        UsuarioDao usuarioDao = new UsuarioDao(emf.getEntityManager());
        usuarioDao.salvar(usuario);
    }

    @Override
    public void atualizar(Object object) {
        Usuario usuario = (Usuario) object;
        
        UsuarioDao usuarioDao = new UsuarioDao(emf.getEntityManager());
        usuarioDao.atualizar(usuario);
    }

    @Override
    public void deletar(Object object) {
        Usuario usuario = (Usuario) object;
        
        UsuarioDao usuarioDao = new UsuarioDao(emf.getEntityManager());
        usuarioDao.deletar(usuario);
    }

    @Override
    public List<Usuario> pegarTodos() {
        
        UsuarioDao usuarioDao = new UsuarioDao(emf.getEntityManager());
        return usuarioDao.pegarTodos();
    }

    @Override
    public Object buscar(Object object) {
        Usuario usuario = (Usuario) object;
        
        UsuarioDao usuarioDao = new UsuarioDao(emf.getEntityManager());
                
        return usuarioDao.buscar(usuario);
    }
    
}
