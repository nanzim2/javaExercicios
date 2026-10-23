package br.com.poo.modeli;

public class Animal {
    private String nome;
    private int idade;

    public Animal(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public void apresentar(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }

    public void emitirSom(){
        System.out.println("Som genérico de animal");
    }
}