package com.diego.agecon.view;

import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CidadeView extends FormPadrao {
    
    JLabel jlUf;
    JLabel jlCep;
    JComboBox jcbUf;
    JTextField jtfCep;
    
    public CidadeView() {
        setTitle("Cadastro de cidades");
    }

    @Override
    public void inicializarComponents() {
        jlUf = new JLabel("UF");
        jlUf.setForeground(Color.WHITE);
        jlUf.setBounds(13, 60, 50, 25);
        jpnForm.add(jlUf);
        
        jcbUf = new JComboBox();
        jcbUf.setBounds(13, 80, 150, 25);
        jpnForm.add(jcbUf);
        
        jlCep = new JLabel("CEP");
        jlCep.setForeground(Color.WHITE);
        jlCep.setBounds(170, 60, 50, 25);
        jpnForm.add(jlCep);
        
        jtfCep = new JTextField();
        jtfCep.setBounds(170, 80, 250, 25);
        jpnForm.add(jtfCep);
    }
    
    @Override
    public void salvarView(){
        
    }
}
