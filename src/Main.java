import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n Menu da Agenda:");
            System.out.println("1 - Adicionar contato");
            System.out.println("2 - Listar contatos");
            System.out.println("3 - Buscar contato");
            System.out.println("4 - Remover contato");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // limpar buffer

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Telefone: ");
                    String telefone = scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();
                    agenda.adicionarContato(new Contato(nome, telefone, email));
                    break;
                case 2:
                    agenda.listarContatos();
                    break;
                case 3:
                    System.out.print("Nome para buscar: ");
                    String busca = scanner.nextLine();
                    agenda.buscarContato(busca);
                    break;
                case 4:
                    System.out.print("Nome para remover: ");
                    String remover = scanner.nextLine();
                    agenda.removerContato(remover);
                    break;
                case 0:
                    System.out.println(" Encerrando...");
                    break;
                default:
                    System.out.println(" Opção inválida.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}