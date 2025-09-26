import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Sistema de Gerenciamento Escolar");
        Professor professor = new Professor("Alberto", 39, "Matemática");
        Turma turma = new Turma("Matemática", professor);

        turma.adicionarAluno(new Aluno("Alessandro", 20, new ArrayList<>(List.of(8.5, 7.8, 9.0))));
        turma.adicionarAluno(new Aluno("Sara", 20, new ArrayList<>(List.of(9.0, 7.8, 10.0))));

        System.out.println("Media da turma: " + turma.calcularNotaFinal());
        System.out.println("Alunos aprovados");
        turma.listaAprovados();
    }
}