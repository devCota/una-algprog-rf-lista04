import java.util.HashMap;
import java.util.Map;

public class Exercicio4 {
    public static void main(String[] args) {
        Map<Integer, String> alunos = new HashMap<>();
        alunos.put(101, "Maria");
        alunos.put(102, "João");
        alunos.put(103, "Rafaela");

        System.out.println("Aluno encontrado: " + alunos.get(102));

        alunos.remove(101);
        
        System.out.println("Alunos cadastrados:" + alunos);
        
    }   
}
