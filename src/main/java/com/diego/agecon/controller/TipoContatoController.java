package com.diego.agecon.controller;

import com.diego.agecon.model.TipoContatoModel;
import com.diego.agecon.dao.TipoContatoDAO;
import com.diego.agecon.interfaces.InterfaceController;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TipoContatoController implements InterfaceController{

    TipoContatoModel model = new TipoContatoModel();
    TipoContatoDAO dao = new TipoContatoDAO();
    
    @Override
    public void salvarController(Object... valor) {
        if ("".equals(valor[0])) {
            model.setId( (Integer) 0);
        } else {
            model.setId( (Integer) valor[0]);
        }
        
        model.setDescricao((String) valor[1]);
        dao.salvarDao(model);
    }

    @Override
    public void excluirController(Integer id) {
        
    }

    @Override
    public void loadComboBox() {
        
    }

    @Override
    public void consultController(Object... valor) {
        try {
            dao.consultarDao(valor);
        } catch (SQLException e) {
            Logger.getLogger(TipoContatoController.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    
}
