package UI;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.List;

public class MainUI {
    private JPanel rootPanel;
    private JTable funcionarios;
    private JTextArea funciTable;
    private JButton organizarButton;
    private JButton filtrarButton;
    private JTextField textField1;

    public MainUI() {
        createTable();
    }

    public JPanel getRootPanel() { return rootPanel; };

    public void createTable() {
        Principal principal = new Principal();
        List<Funcionario> lista_funcionarios = principal.getAll();
        Object[][] data = new Object [lista_funcionarios.size()][]; // converte Lista<Funcionario> para um "array 2D" assim como necessario para DefaultTableModel
        for (int i = 0; i < lista_funcionarios.size(); i++) {
            data[i] = lista_funcionarios.get(i).getAttributes();
        }
        funcionarios.setModel(new DefaultTableModel(
                data, // cells
                new String[]{"Nome", "Data Nascimento", "Salário", "Função"} // headers
        ));
    }
}
