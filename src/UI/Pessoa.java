package UI;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Pessoa {
    private String nome;
    private LocalDate dataNasc;
    public Pessoa (String nome, LocalDate dataNasc) {
        this.nome = nome;
        this.dataNasc = dataNasc;
    }
    public String getDataNasc() {
        return this.dateFormatter(dataNasc);
    }
    public String getNome() {
        return nome;
    }

    private String dateFormatter(LocalDate date) {
        return date.format(DateTimeFormatter.ofPattern("dd/MM/uuuu"));
    } // reformata LocalDate para o formato dd/mm/aaaa
}
