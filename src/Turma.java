import java.util.ArrayList;

public class Turma implements Avaliavel {
    private String nomeDaTurma;
    private Professor professor;
    private ArrayList<Aluno> alunos = new ArrayList<>();

    public Turma(String nomeDaTurma, Professor professor) {
        this.nomeDaTurma = nomeDaTurma;
        this.professor = professor;
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public double calcularMedia() {
        double somaTurma = 0;
        int quantidadeTurma = 0;

        for (Aluno aluno : alunos) {
            for (double nota: aluno.getNotas()) {
                somaTurma += nota;
                quantidadeTurma++;
            }
        }

        return quantidadeTurma == 0 ? 0 : somaTurma / quantidadeTurma;
    }

    public void listaAprovados() {
        double mediaTurma = calcularMedia();

        for (Aluno aluno : alunos) {
            double somaAluno = 0;
            for (double nota : aluno.getNotas()) {
                somaAluno += nota;
            }
            double mediaAluno = aluno.calcularNotaFinal();

            if (mediaAluno >= mediaTurma) {
                System.out.println(aluno.getName());
            }
        }
    }

    @Override
    public double calcularNotaFinal() {
        return calcularMedia();
    }
}
