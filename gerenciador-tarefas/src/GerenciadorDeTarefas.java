import funcionalidades.RegistroDeTarefas;

public class GerenciadorDeTarefas {

    public static void main(String[] args) {
        RegistroDeTarefas registroDeTarefas = new RegistroDeTarefas();
        int opcao = 0;

        while (opcao != 5) {
            opcao = registroDeTarefas.exibirMenu();

            switch (opcao) {
                case 1:
                    registroDeTarefas.exibirTarefas();
                    break;
                case 2:
                    registroDeTarefas.adicionarTarefa();
                    break;
                case 3:
                    registroDeTarefas.concluirTarefa();
                    break;
                case 4:
                    registroDeTarefas.removerTarefa();
                    break;
                case 5:
                    break;
                default:
                    registroDeTarefas.exibirMensagemInputIncorreto();
                    break;
            }
        }
    }
}
