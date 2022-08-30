package funcionalidades;

public interface IFuncionalidades {
    static final String TEXTO_MENU = "Escolha sua opção: \n" +
            "1-Exibir tarefas \n" +
            "2-Adicionar tarefa \n" +
            "3-Concluir tarefa \n" +
            "4-Excluir tarefa \n" +
            "5-Sair";

    static final String ADICIONAR_TAREFA = "Digite a descrição da tarefa:";
    static final String REMOVER_TAREFA = "Digite o número da tarefa a ser removida:";
    static final String CONCLUIR_TAREFA = "Digite o número da tarefa a ser concluida:";
    static final String ENTRADA_INCORRETA = "O número digitado está incorreto";
    static final String NAN_ENTRADA_INCORRETA = "Entrada incorreta. É necessário digitar um número";
}
