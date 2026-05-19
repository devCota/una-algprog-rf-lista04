import java.util.LinkedList;
import java.util.Queue; 

public class Exercicio5 {
    public static void main(String[] args) {        
        Queue<String> fila = new LinkedList<>();        
        fila.add("Maria");        
        fila.add("João");        
        fila.add("Rafaela");        
        fila.add("Lucas");        
        fila.add("Paula");        
        System.out.println("Fila: " + fila);        
        System.out.println("Atendido: " + fila.poll());
        System.out.println("Atendido: " + fila.poll());                
        System.out.println("Fila atual: " + fila);    
    }
}

