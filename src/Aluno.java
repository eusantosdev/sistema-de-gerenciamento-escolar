public class Aluno extends Pessoa {
    private double[] notas;

    public Aluno(String nome, int idade, double[] notas) {
        super(nome, idade);
        this.notas = notas;
    }

    public double[] getNotas() {
        return this.notas;
    }

    interface Avaliavel {
        void calcularNotaFinal();
    }
}
