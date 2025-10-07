import java.util.ArrayList;

public class Agenda {
    private ArrayList<Contato> contatos = new ArrayList<>();

    public void adicionarContato(Contato contato) {
        contatos.add(contato);
    }

    public void buscarContato(String nome) {
        boolean encontrado = false;
        for (Contato c : contatos) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                System.out.println("Contato encontrado: " + c);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Contato não encontrado.");
        }
    }

    public void removerContato(String nome) {
        boolean removido = contatos.removeIf(c -> c.getNome().equalsIgnoreCase(nome));
        if (removido) {
            System.out.println("Contato removido.");
        } else {
            System.out.println("Contato não encontrado para remoção.");
        }
    }

    public void listarContatos() {
        if (contatos.isEmpty()) {
            System.out.println("Nenhum contato na agenda.");
        } else {
            System.out.println("📒 Lista de contatos:");
            for (Contato c : contatos) {
                System.out.println(c);
            }
        }
    }
}