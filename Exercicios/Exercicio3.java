import java.util.HashSet;
import java.util.Set;

public class Exercicio3 {
    public static void main(String[] args) {
        Set<String> alunosPresentes = new HashSet<>();

        alunosPresentes.add("Maria");
        alunosPresentes.add("João");
        alunosPresentes.add("Rafaela");
        alunosPresentes.add("Maria"); 
        alunosPresentes.add("João");

        System.out.println("Alunos presentes: " + alunosPresentes);
        System.out.println("Quantidade de alunos presentes: " + alunosPresentes.size());
    }
}
