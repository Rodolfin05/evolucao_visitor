package padroescomportamentais.visitor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaJsonVisitorTest {

    @Test
    void deveExibirJsonAluno() {
        Aluno aluno = new Aluno(1, "Ana", new Curso("Sistemas de Informação"));

        PessoaJsonVisitor visitor = new PessoaJsonVisitor();
        assertEquals("{\n\"matricula\":1,\n\"nome\":\"Ana\",\n\"curso\":\"Sistemas de Informação\"\n}", visitor.exibir(aluno));
    }

    @Test
    void deveExibirJsonProfessor() {
        Professor professor = new Professor(1, "Marco Antônio", "Doutorado");

        PessoaJsonVisitor visitor = new PessoaJsonVisitor();
        assertEquals("{\n\"matricula\":1,\n\"nome\":\"Marco Antônio\",\n\"titulacao\":\"Doutorado\"\n}", visitor.exibir(professor));
    }

    @Test
    void deveExibirJsonFuncionario() {
        Funcionario funcionario = new Funcionario(1020, "José", 2500.0f);

        PessoaJsonVisitor visitor = new PessoaJsonVisitor();
        assertEquals("{\n\"codigo\":1020,\n\"nome\":\"José\",\n\"salario\":2500.0\n}", visitor.exibir(funcionario));
    }
}