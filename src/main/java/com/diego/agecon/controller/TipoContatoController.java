package com.diego.agecon.controller;

import com.diego.agecon.TipoContatoModel;
import com.diego.agecon.interfaces.InterfaceController;

public class TipoContatoController implements InterfaceController{

    TipoContatoModel model = new TipoContatoModel();
    
    @Override
    public void salvarController(Object... valor) {
        model.setId((Integer) valor[0]);
        model.setDescricao((String) valor[1]);
        
        
    }

    @Override
    public void excluirController(Integer id) {
        
    }

    @Override
    public void loadComboBox() {
        
    }
    
}
