import java.time.LocalDate;

public class Pessoa {
    private String nome;
    private LocalDate dataNasc;
    public Pessoa (String nome, LocalDate dataNasc) {
        this.nome = nome;
        this.dataNasc = dataNasc;
    };
}