/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.diego.agecon.view;

import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JLabel;

/**
 *
 * @author ct67ca
 */
public class BairroView extends FormPadrao {
    
    JLabel jlbBairro;
    JComboBox jcBairro;
    
    public BairroView() {
        setTitle("Cadastro de bairros");
    }
    
    public void inicializarComponents() {
        jlbBairro = new JLabel("Cidade");
        jlbBairro.setForeground(Color.WHITE);
        jlbBairro.setBounds(15, 60, 50, 25);
        jpnForm.add(jlbBairro);
        
        jcBairro = new JComboBox();
        jcBairro.setBounds(15, 80, 250, 25);
        jpnForm.add(jcBairro);
    }
    
    @Override
    public void salvarView(){
        
    }

    @Override
    public void createTable() {
        
    }
    
    @Override
    public void consultaView() {
       
    }

    @Override
    public void updateForm() {
      
    }
    
    
}
