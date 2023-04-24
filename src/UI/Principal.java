        package UI;
        import UI.Funcionario;
        import java.math.BigDecimal;
        import java.time.LocalDate;
        import java.util.ArrayList;
        import java.util.List;

        public class Principal {

            private List<Funcionario> funcionarios;

            public Principal() {
                funcionarios = new ArrayList<>();
                create("Camille", LocalDate.of(1993, 12, 31), new BigDecimal("2500.45"), "Operador");
                create("Char", LocalDate.of(1974, 4, 9), new BigDecimal("8000.00"), "Gerente");
                create("Reccoa", LocalDate.of(1984, 8, 10), new BigDecimal("4209.99"), "Diretor");
                create("Amuro", LocalDate.of(1989, 11, 30), new BigDecimal("5040.03"), "Recepcionista");
            }

            public void create(String nome, LocalDate dataNasc, BigDecimal salario, String funcao) {
                Funcionario func = new Funcionario(nome, dataNasc, salario, funcao);
                funcionarios.add(func);
            }

            public List<Funcionario> getAll() {
                return funcionarios;
            }

//            Funcionario funci1 = new Funcionario("Camille", LocalDate.of(1993, 12, 31), new BigDecimal("2500.45"), "Operador");
//            Funcionario funci2 = new Funcionario("Char", LocalDate.of(1974, 4, 9), new BigDecimal("8000.00"), "Gerente");
//            Funcionario funci3 = new Funcionario("Reccoa", LocalDate.of(1984, 8, 10), new BigDecimal("4209.99"), "Diretor");
//            Funcionario funci4 = new Funcionario("Amuro", LocalDate.of(1989, 11, 30), new BigDecimal("5040.03"), "Recepcionista");

        }