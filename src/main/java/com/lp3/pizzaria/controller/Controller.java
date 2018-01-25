/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lp3.pizzaria.controller;

import com.lp3.pizzaria.infra.EMFactory;
import java.util.List;

/**
 *
 * @author Arthur C. Lima
 */
public interface Controller {

    EMFactory emf = new EMFactory();

    public void salvar(Object object);

    public void atualizar(Object object);

    public void deletar(Object object);

    public List<?> pegarTodos();

    public Object buscar(Object object);
}
