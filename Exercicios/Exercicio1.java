
import java.util.ArrayList;
import java.util.List;

public class Exercicio1 {
    public static void main(String[] args) {
        List<String> listaDeCompras = new ArrayList<>();

        listaDeCompras.add("Leite");
        listaDeCompras.add("Pão");
        listaDeCompras.add("Ovos");
        listaDeCompras.add("Frutas");
        listaDeCompras.add("Legumes");

        System.out.println(listaDeCompras);
        System.out.println("Quantidade total de produtos: " + listaDeCompras.size());
    }
}