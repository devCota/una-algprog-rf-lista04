public class Exercicio7 {

    public static void main(String[] args) {
        java.util.Scanner entrada = new java.util.Scanner(System.in);
        java.util.ArrayList<Pedido> pedidos = new java.util.ArrayList<Pedido>();

        int opcao;

        do {
            System.out.println("\n===== MENU LANCHONETE =====");
            System.out.println("1 - Cadastrar pedido");
            System.out.println("2 - Listar pedidos");
            System.out.println("3 - Atualizar status de um pedido");
            System.out.println("4 - Buscar pedido pelo numero");
            System.out.println("5 - Mostrar valor total dos pedidos");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opcao: ");
            opcao = entrada.nextInt();
            entrada.nextLine();

            if (opcao == 1) {
                System.out.print("Numero do pedido: ");
                int numero = entrada.nextInt();
                entrada.nextLine();

                System.out.print("Nome do cliente: ");
                String nomeCliente = entrada.nextLine();

                System.out.print("Item pedido: ");
                String itemPedido = entrada.nextLine();

                System.out.print("Valor: ");
                double valor = entrada.nextDouble();
                entrada.nextLine();

                Pedido pedido = new Pedido(numero, nomeCliente, itemPedido, valor, "PENDENTE");
                pedidos.add(pedido);

                System.out.println("Pedido cadastrado com sucesso!");

            } else if (opcao == 2) {
                if (pedidos.isEmpty()) {
                    System.out.println("Nenhum pedido cadastrado.");
                } else {
                    for (Pedido pedido : pedidos) {
                        pedido.mostrarDados();
                    }
                }

            } else if (opcao == 3) {
                System.out.print("Digite o numero do pedido: ");
                int numero = entrada.nextInt();
                entrada.nextLine();

                Pedido pedidoEncontrado = buscarPedido(pedidos, numero);

                if (pedidoEncontrado == null) {
                    System.out.println("Pedido nao encontrado.");
                } else {
                    System.out.println("Escolha o novo status:");
                    System.out.println("1 - PENDENTE");
                    System.out.println("2 - PREPARANDO");
                    System.out.println("3 - FINALIZADO");
                    System.out.print("Opcao: ");
                    int opcaoStatus = entrada.nextInt();
                    entrada.nextLine();

                    if (opcaoStatus == 1) {
                        pedidoEncontrado.setStatus("PENDENTE");
                        System.out.println("Status atualizado com sucesso!");
                    } else if (opcaoStatus == 2) {
                        pedidoEncontrado.setStatus("PREPARANDO");
                        System.out.println("Status atualizado com sucesso!");
                    } else if (opcaoStatus == 3) {
                        pedidoEncontrado.setStatus("FINALIZADO");
                        System.out.println("Status atualizado com sucesso!");
                    } else {
                        System.out.println("Status invalido.");
                    }
                }

            } else if (opcao == 4) {
                System.out.print("Digite o numero do pedido: ");
                int numero = entrada.nextInt();
                entrada.nextLine();

                Pedido pedidoEncontrado = buscarPedido(pedidos, numero);

                if (pedidoEncontrado == null) {
                    System.out.println("Pedido nao encontrado.");
                } else {
                    pedidoEncontrado.mostrarDados();
                }

            } else if (opcao == 5) {
                double total = 0;

                for (Pedido pedido : pedidos) {
                    total = total + pedido.getValor();
                }

                System.out.println("Valor total dos pedidos: R$ " + total);

            } else if (opcao == 0) {
                System.out.println("Programa encerrado.");
            } else {
                System.out.println("Opcao invalida.");
            }

        } while (opcao != 0);

        entrada.close();
    }

    public static Pedido buscarPedido(java.util.ArrayList<Pedido> pedidos, int numero) {
        for (Pedido pedido : pedidos) {
            if (pedido.getNumero() == numero) {
                return pedido;
            }
        }

        return null;
    }
}

class Pedido {
    private int numero;
    private String nomeCliente;
    private String itemPedido;
    private double valor;
    private String status;

    public Pedido(int numero, String nomeCliente, String itemPedido, double valor, String status) {
        this.numero = numero;
        this.nomeCliente = nomeCliente;
        this.itemPedido = itemPedido;
        this.valor = valor;
        this.status = status;
    }

    public int getNumero() {
        return numero;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public String getItemPedido() {
        return itemPedido;
    }

    public double getValor() {
        return valor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void mostrarDados() {
        System.out.println("--------------------");
        System.out.println("Numero do pedido: " + numero);
        System.out.println("Cliente: " + nomeCliente);
        System.out.println("Item: " + itemPedido);
        System.out.println("Valor: R$ " + valor);
        System.out.println("Status: " + status);
    }
}
