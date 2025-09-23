import java.util.ArrayList;

public class Aluno extends Pessoa implements Avaliavel {

    private ArrayList<Double> notas;

    public Aluno(String nome, int idade, ArrayList<Double> notas) {
        super(nome, idade);
        this.notas = notas;
    }

    public ArrayList<Double> getNotas() {
        return notas;
    }

    @Override
    public double calcularNotaFinal() {
        double soma = 0;
        for (double nota: notas) {
            soma += nota;
        }
        return soma / notas.size();
    };
}
