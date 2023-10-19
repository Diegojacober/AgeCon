package com.diego.agecon.dao;

import com.diego.agecon.TipoContatoModel;
import com.diego.agecon.interfaces.InterfaceDAO;
import java.sql.SQLException;
import javax.swing.JComboBox;

public class TipoContatoDAO implements InterfaceDAO{
    
    @Override
    public void salvarDao(Object... valor) {
        TipoContatoModel model = (TipoContatoModel) valor[0];
        model.getDescricao();
    }

    @Override
    public void excluirDao(Integer id) {
       
    }

    @Override
    public void consultarDao(Object... valor) throws SQLException {
        
    }

    @Override
    public void loadComboBox(JComboBox itens) throws SQLException {
       
    }
    
}
