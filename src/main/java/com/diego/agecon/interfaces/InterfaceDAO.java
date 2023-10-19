package com.diego.agecon.interfaces;

import java.sql.SQLException;
import javax.swing.JComboBox;

public interface InterfaceDAO {
    public void salvarDao(Object... valor);
    public void excluirDao(Integer id);
    public void consultarDao(Object... valor) throws SQLException;
    public void loadComboBox(JComboBox itens) throws SQLException;
}
