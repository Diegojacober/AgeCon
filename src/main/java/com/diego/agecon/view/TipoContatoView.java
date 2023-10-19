package com.diego.agecon.view;

import com.diego.agecon.controller.TipoContatoController;

public class TipoContatoView extends FormPadrao {
    
    TipoContatoController controller = new TipoContatoController();
    
    public TipoContatoView() {
        setTitle("Cadastro de tipos de contato");
    }
    
    @Override
    public void inicializarComponents() {
    }
    
    @Override
    public void salvarView() {
        controller.salvarController(jtfId.getText(), jtfDescricao.getText());
    }
}
