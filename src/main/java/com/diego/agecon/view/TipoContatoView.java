package com.diego.agecon.view;

import com.diego.agecon.controller.TipoContatoController;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;

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
    
    @Override
    public void createTable() {
        table = utilTable.createTable(
                jpnConsulta, 
                new Object[] {60, 725}, 
                new Object[] {"center", "left"},
                new Object[] {"ID", "Descrição"}
        );
        
        model = (DefaultTableModel) table.getModel();
    }
}
