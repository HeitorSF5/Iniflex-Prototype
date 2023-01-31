package UI;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class Funcionario extends Pessoa {
    private BigDecimal salario;
    private String funcao;
    public Funcionario (String nome, LocalDate dataNasc, BigDecimal salario, String funcao) {
        super(nome, dataNasc);
        this.salario = salario;
        this.funcao = funcao;
    }
    public Object[] getAttributes() {
        return List.of(this.getNome(), this.getDataNasc(), this.salario, this.funcao).toArray();
    }
}
