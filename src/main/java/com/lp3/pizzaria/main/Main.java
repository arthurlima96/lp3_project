/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lp3.pizzaria.main;

import com.lp3.pizzaria.view.HomeView;
import com.lp3.pizzaria.view.LoginView;
import com.lp3.pizzaria.view.Splash;
import javax.swing.JFrame;

/**
 *
 * @author Arthur C. Lima
 */
public class Main {
    public static void main(String[] args) {
        
        Splash loginView = new Splash();
        loginView.executar();
        try {
            for (int i = 0; i <= 100; i++) {
                Thread.sleep(31);               
                loginView.progressBar.setValue(i);                
            }
            loginView.dispose();
            LoginView mv = new LoginView();
            mv.executar();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
