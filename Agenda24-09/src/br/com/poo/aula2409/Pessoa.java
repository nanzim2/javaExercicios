package br.com.poo.aula2409;

import javax.swing.*;

public class Pessoa {
    private String nome;
    private int idade;
    private float altura;

    public Pessoa(String nome, int idade, float altura){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public void imprimirDados(){
        JOptionPane.showMessageDialog(null, "=== Dados ===\n Nome: "+ this.nome +"\n Idade: "+ this.idade +"\n Altura: "+ this.altura);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
