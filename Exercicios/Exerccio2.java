
import java.util.ArrayList;
import java.util.List;

public class Exerccio2 {
    public static void main(String[] args) {
        List<Double> notas = new ArrayList<>();

        notas.add(8.5);
        notas.add(7.0);
        notas.add(6.5);
        notas.add(9.0);

        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }

        double media = soma / notas.size();
        System.out.println("Média da turma: " + media);

        if (media >= 7) {
            System.out.println("A turma ficou com média maior ou igual a 7.");
        } else {
            System.out.println("A turma ficou com média menor que 7.");
        }
    }
}
