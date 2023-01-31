package UI;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Principal {
    private List<Funcionario> allFunci;

    public void setAllFunci(List<Funcionario> allFunci) {
        this.allFunci = allFunci;
    } // create All

    public List<Funcionario> getAllFunci() {
        return allFunci;
    } // get All

    public void addOneFunci(Funcionario funci) {
        this.allFunci.add(funci);
    } // create One

    public void deleteFunci(String nome) {
//        List<Funcionario> newList = this.getAllFunci();
//        newList.remove(nome);
//        this.setAllFunci(newList);
        this.allFunci.remove(nome);
//        Não funciona como espero...
    } // delete One
}

// Não consegui fazer as mudanças na minha lista de Funcionarios ser refletida na tabela, então fiquei com dificuldade de implementar o resto das funcionalidades desta classe..

// Minha ideia após remediar isso é implementar as outras funcionalidades de Principal em formato de botões e text-fields no próprio Frame
