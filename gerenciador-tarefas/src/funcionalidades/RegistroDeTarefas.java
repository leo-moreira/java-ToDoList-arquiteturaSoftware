package funcionalidades;

import classes.Tarefa;
import memoria.MemoriaGerenciadorDeTarefas;

import java.util.Iterator;

public class RegistroDeTarefas extends Funcionalidades {
    MemoriaGerenciadorDeTarefas memoriaGerenciadorDeTarefas;

    public RegistroDeTarefas() {
        this.memoriaGerenciadorDeTarefas = new MemoriaGerenciadorDeTarefas();
    }

    public void exibirTarefas() {
        Iterator<Tarefa> tarefas = memoriaGerenciadorDeTarefas.tarefaIterator();
        int index = 1;
        while (tarefas.hasNext()) {
            Tarefa tarefa = tarefas.next();
            exibirMensagem(index + " - " + tarefa.getDescricao() + (tarefa.isFinalizada() ? " - Concluída" : ""));
            index++;
        }
        exibirMensagem("\n");
    }

    public void adicionarTarefa() {
        Tarefa novaTarefa = new Tarefa(receberInput(ADICIONAR_TAREFA));
        memoriaGerenciadorDeTarefas.salvar(novaTarefa);
    }

    public void concluirTarefa() {
        memoriaGerenciadorDeTarefas.concluir(receberInputNumero(CONCLUIR_TAREFA) - 1);
    }

    public void removerTarefa() {
        memoriaGerenciadorDeTarefas.remover(receberInputNumero(REMOVER_TAREFA) - 1);
    }
}
