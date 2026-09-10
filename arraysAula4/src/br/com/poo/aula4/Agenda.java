package br.com.poo.aula4;

public class Agenda {
    private Pessoa[] pessoas;

    public Agenda() {
        this.pessoas = new Pessoa[10];
    }

    /*
    public void armazenarPessoa(String nome, int idade, double altura){
        for (int i = 0; i < pessoas.length; i++){
            if (pessoas[i] == null){
                pessoas[i] = new Pessoa(nome, idade, altura);
                System.out.println("Pessoa " + nome + "armazenada!");
                return;
            }
        }
        System.out.println("Agenda cheia!");
    }
    */

    public void armazenarPessoa(Pessoa pessoa){
        for (int i = 0; i < pessoas.length; i++){
            if (pessoas[i] == null){
                pessoas[i] = pessoa;
                System.out.println("Pessoa " + pessoa.getNome() + " armazenada!");
                return;
            }
        }
        System.out.println("Agenda cheia!");
    }

    public void removerPessoa(String nome){
        for (int i = 0; i < pessoas.length; i++){
            if (pessoas[i] != null && pessoas[i].getNome().equalsIgnoreCase(nome)){
                pessoas[i] = null;
                System.out.println("Pessoa " + nome + " removida da agenda!");
                return;
            }
        }
        System.out.println("Pessoa " + nome + "Nao encontrada!");
    }

    /*
    public Pessoa buscarPessoa(String nome){
        for (int i = 0; i < pessoas.length; i++){
            if (pessoas[i] != null && pessoas[i].getNome().equalsIgnoreCase(nome)){
                System.out.println("Pessoa "+ nome + " encontrada!");
                return pessoas[i];
            }
        }
        System.out.println("Pessoa " + nome + "nao encontrada!");
        return null;
    }
    */

    public Pessoa buscarPessoa(String nome){
        for (Pessoa pessoa : pessoas){
            if (pessoa != null && pessoa.getNome().equalsIgnoreCase(nome)){
                return pessoa;
            }
        }
        return null;
    }

    public void imprimirAgenda(){
        System.out.println("==== AGENDA ====");
        boolean possuirPessoas = false;

        for (Pessoa pessoa : pessoas){
            if (pessoa != null){
                pessoa.imprimirDados();
                possuirPessoas = true;
            }
        }

        if (!possuirPessoas){
            System.out.println("A agenda esta vazia!");
        }
    }

    public Pessoa[] getPessoas() {
        return pessoas;
    }

    public void setPessoas(Pessoa[] pessoas) {
        this.pessoas = pessoas;
    }
}
