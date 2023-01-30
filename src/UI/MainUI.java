package UI;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class MainUI {
    private JPanel rootPanel;
    private JTable funcionarios;
    private JTextArea funciTable;

    public MainUI() { createTable(); }

    public JPanel getRootPanel() { return rootPanel; };

    public void createTable() {
        Object[][] data = {
                {"Camille", "02/02/1989", "3095.00", "Operador"},
                {}
                // Aqui vao as entradas de funcionarios
        };
        funcionarios.setModel(new DefaultTableModel(
                data,
                new String[]{"Nome", "Data Nascimento", "Salário", "Função"}
        ));
    }
}
