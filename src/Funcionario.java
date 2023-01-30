import java.math.BigDecimal;
import java.time.LocalDate;

public class Funcionario extends Pessoa {
    private BigDecimal salario;
    private String funcao;
    public Funcionario (String nome, LocalDate dataNasc, BigDecimal salario, String funcao) {
        super(nome, dataNasc);
        this.salario = salario;
        this.funcao = funcao;
    };
    public BigDecimal getSalario() {
        return salario;
    }
}
