package com.diego.agecon.dao;

import com.diego.agecon.model.TipoContatoModel;
import com.diego.agecon.interfaces.InterfaceDAO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TipoContatoDAO implements InterfaceDAO{
    
    String sql;
    PreparedStatement stmt;
    ResultSet result;
    
    @Override
    public void salvarDao(Object... valor) {
        TipoContatoModel model = (TipoContatoModel) valor[0];
        
        if (model.getId() == 0) {
            sql = "INSERT INTO tipo_contato (descricao) VALUES (?)";
        } else {
            sql = "UPDATE tipo_contato SET descricao=? where id_tipo_contato=?";
        }
        
        try {
            stmt = DBConnection.openConnection().prepareStatement(sql);
            
            stmt.setString(1, model.getDescricao());
            if (model.getId() > 0) stmt.setInt(2, model.getId());
            
            stmt.execute();
            stmt.close();
            
            JOptionPane.showMessageDialog(null, "Inserido com sucesso: ");
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }
        model.getDescricao();
    }

    @Override
    public void excluirDao(Integer id) {
       
    }

    @Override
    public void consultarDao(Object... valor) throws SQLException {
        DefaultTableModel table = (DefaultTableModel) valor[1];
        
        if ("".equals((String) valor[0])) {
            sql = "SELECT * FROM tipo_contato";
        } else {
            sql = "SELECT * FROM tipo_contato WHERE descricao LIKE '%" + valor[0] +"%'";
        }
        
        
        try {
            stmt = DBConnection.openConnection().prepareStatement(sql);
            result = stmt.executeQuery();
            
            while (result.next()) {
                table.addRow(
                  new Object[] {
                      result.getInt("id_tipo_contato"),
                      result.getString("descricao")
                  }
                );
            }
            
            stmt.close();
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }
    }

    @Override
    public void loadComboBox(JComboBox itens) throws SQLException {
       
    }
    
}
