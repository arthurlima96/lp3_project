/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lp3.pizzaria.dao;

import java.util.List;

/**
 *
 * @author Arthur C. Lima
 */
public interface Dao {
        public void salvar(Object object);
	public void atualizar(Object object);
	public void deletar(Object object);
	public List<?> pegarTodos();
        public Object buscar(Object object);
}
