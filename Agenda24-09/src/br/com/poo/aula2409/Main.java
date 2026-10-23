package br.com.poo.aula2409;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Renan", 19, 1.83);
        Pessoa pessoa2 = new Pessoa("Rafael", 21, 1.72);

        pessoa1.imprimirDados();
        pessoa2.imprimirDados();
    }
}