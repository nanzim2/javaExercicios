package br.com.poo.aula2409;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List listaPessoas;

    public Agenda(){
        this.listaPessoas = new ArrayList<Pessoa>();
    }

    public void armazenarPessoa(String nome, int idade, float altura){
        listaPessoas.add(new Pessoa(nome, idade, altura));
    }

    public void removerPessoa(String nome){
        Pessoa pessoa = buscarPessoa(nome);
        if (pessoa != null) {
            listaPessoas.remove(pessoa);
        }
    }

    public Pessoa buscarPessoa(String nome){
        for (Pessoa pessoa : listaPessoas){
            if (pessoa != null && pessoa.getNome().equals(nome)){
                return pessoa;
            }
        }
        return null;
    }
}
