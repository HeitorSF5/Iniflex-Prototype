package UI;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
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
        initiPrinci();
        myFuncis();
    }

    public JPanel getRootPanel() { return rootPanel; };

    public void createTable() {
        funcionarios.setModel(new DefaultTableModel(
                myFuncis(), // cells
                new String[]{"Nome", "Data Nascimento", "Salário", "Função"} // headers
        ));
    }

    private Object[][] myFuncis() {
        List<Funcionario> princi = initiPrinci().getAllFunci();
        Object[][] allFuncis = princi.stream().map(Funcionario::getAttributes).toArray(Object[][]::new); // Equivalente à um .map() do JavaScript
        return allFuncis;
    }

    public Principal initiPrinci() {
        Principal princi = new Principal();
        Funcionario funci1 = new Funcionario("Camille", LocalDate.of(1993, 12, 31), new BigDecimal("2500.45"), "Operador");
        Funcionario funci2 = new Funcionario("Char", LocalDate.of(1974, 4, 9), new BigDecimal("8000.00"), "Gerente");
        Funcionario funci3 = new Funcionario("Reccoa", LocalDate.of(1984, 8, 10), new BigDecimal("4209.99"), "Diretor");
        Funcionario funci4 = new Funcionario("Amuro", LocalDate.of(1989, 11, 30), new BigDecimal("5040.03"), "Recepcionista");
        List<Funcionario> listFunci = Arrays.asList(funci1, funci2, funci3, funci4);
        princi.setAllFunci(listFunci);
        return princi;
    }
}
