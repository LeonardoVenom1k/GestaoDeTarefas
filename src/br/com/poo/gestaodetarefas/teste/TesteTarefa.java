package br.com.poo.gestaodetarefas.teste;

import br.com.poo.gestaodetarefas.tarefa.Tarefa;

public class TesteTarefa {
    public static void main(String[] args) {

        Tarefa tarefa = new Tarefa(1, "Entrega 2 do PID", false);

        System.out.println(tarefa.obterDados());

    }
}
