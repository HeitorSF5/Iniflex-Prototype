import UI.MainUI;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createGUI();
            }
        });
    }

    public static void createGUI() {
        MainUI ui = new MainUI(); // meu form em UI/MainUI/MainUI.form
        JPanel root = ui.getRootPanel();
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE)); // Termina a execução quando fecha a janela
        frame.setContentPane(root);
        frame.pack(); // responsavel pelo tamanho dos elementos dentro de um frame. .pack() automatiza isso
        frame.setLocationRelativeTo(null); // centraliza os elementos do frame
        frame.setVisible(true);
    }
}