package com.diego.agecon.view;

import com.diego.agecon.controller.TipoContatoController;
import javax.swing.table.DefaultTableModel;

public class TipoContatoView extends FormPadrao {
    
    TipoContatoController controller = new TipoContatoController();
    
    public TipoContatoView() {
        setTitle("Cadastro de tipos de contato");
        consultaView();
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

    @Override
    public void consultaView() {
       model.setNumRows(0);
       controller.consultController(jtfConsulta.getText(), model);
    }
    
    @Override
    public void updateForm() {
      jtfId.setText(table.getValueAt(table.getSelectedRow(), 0).toString());
      jtfDescricao.setText(table.getValueAt(table.getSelectedRow(), 1).toString());
    }

    @Override
    public void deleteView() {
        controller.excluirController(Integer.parseInt(jtfId.getText()));
    }
}
