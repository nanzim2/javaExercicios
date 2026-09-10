package br.com.poo.aula4;

public class Pessoa {
    // Atributos
    private String nome;
    private int idade;
    private double altura;

    // Construtores
    public Pessoa(){
        this.nome = "NULL";
        this.idade = 0;
        this.altura = 0.0;
    }

    public Pessoa(String nome, int idade, double altura){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    // Metodos
    public void imprimirDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("===============");
    }

    // Getters e Setters
    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public double getAltura(){
        return altura;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }
}