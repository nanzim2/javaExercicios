package br.com.poo.modeli;

public class Mamifero extends Animal1 {

    protected String tipoPelagem;

    public Mamifero(){
        super(nome, idade);

        this.tipoPelagem = tipoPelagem;
    }

    public void mostrarPelagem(){
        System.out.println("Pelagem de " + getNome() + ": " + tipoPelagem);
    }
}
