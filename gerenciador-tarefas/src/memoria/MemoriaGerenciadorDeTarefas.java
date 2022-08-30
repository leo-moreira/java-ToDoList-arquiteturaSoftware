package memoria;

import classes.Tarefa;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MemoriaGerenciadorDeTarefas {

    private final List<Tarefa> listaDeTarefas = new ArrayList<>();

    public void salvar(Tarefa tarefa) {
        listaDeTarefas.add(tarefa);
    }

    public void remover(int index) {
        if (indexValido(index)) {
            listaDeTarefas.remove(index);
        }
    }

    public void concluir(int index) {
        if (indexValido(index)) {
            listaDeTarefas.get(index).setFinalizada(true);
        }
    }

    public Iterator<Tarefa> tarefaIterator() {
        return listaDeTarefas.iterator();
    }

    private boolean indexValido(int index) {
        return index >= 0 && index < listaDeTarefas.size();
    }
}
