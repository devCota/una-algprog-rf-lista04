import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        List<Livro> livros = new ArrayList<Livro>();

        int opcao;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Cadastrar livro");
            System.out.println("2 - Listar livros");
            System.out.println("3 - Emprestar livro");
            System.out.println("4 - Devolver livro");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opcao: ");
            opcao = entrada.nextInt();
            entrada.nextLine();

            if (opcao == 1) {
                System.out.print("Codigo: ");
                int codigo = entrada.nextInt();
                entrada.nextLine();

                System.out.print("Titulo: ");
                String titulo = entrada.nextLine();

                System.out.print("Autor: ");
                String autor = entrada.nextLine();

                Livro livro = new Livro(codigo, titulo, autor, true);
                livros.add(livro);

                System.out.println("Livro cadastrado com sucesso!");

            } else if (opcao == 2) {
                if (livros.isEmpty()) {
                    System.out.println("Nenhum livro cadastrado.");
                } else {
                    for (Livro livro : livros) {
                        livro.mostrarDados();
                    }
                }

            } else if (opcao == 3) {
                System.out.print("Digite o codigo do livro para emprestar: ");
                int codigo = entrada.nextInt();

                Livro livroEncontrado = buscarLivro(livros, codigo);

                if (livroEncontrado == null) {
                    System.out.println("Livro nao encontrado.");
                } else if (livroEncontrado.getDisponivel()) {
                    livroEncontrado.setDisponivel(false);
                    System.out.println("Livro emprestado com sucesso!");
                } else {
                    System.out.println("Este livro ja esta emprestado.");
                }

            } else if (opcao == 4) {
                System.out.print("Digite o codigo do livro para devolver: ");
                int codigo = entrada.nextInt();

                Livro livroEncontrado = buscarLivro(livros, codigo);

                if (livroEncontrado == null) {
                    System.out.println("Livro nao encontrado.");
                } else if (!livroEncontrado.getDisponivel()) {
                    livroEncontrado.setDisponivel(true);
                    System.out.println("Livro devolvido com sucesso!");
                } else {
                    System.out.println("Este livro ja esta disponivel.");
                }

            } else if (opcao == 0) {
                System.out.println("Programa encerrado.");
            } else {
                System.out.println("Opcao invalida.");
            }

        } while (opcao != 0);

        entrada.close();
    }

    public static Livro buscarLivro(List<Livro> livros, int codigo) {
        for (Livro livro : livros) {
            if (livro.getCodigo() == codigo) {
                return livro;
            }
        }

        return null;
    }

}

class Livro {
    private int codigo;
    private String titulo;
    private String autor;
    private boolean disponivel;

    public Livro(int codigo, String titulo, String autor, boolean disponivel) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = disponivel;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public void mostrarDados() {
        System.out.println("--------------------");
        System.out.println("Codigo: " + codigo);
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);

        if (disponivel) {
            System.out.println("Status: Disponivel");
        } else {
            System.out.println("Status: Indisponivel");
        }
    }
}
