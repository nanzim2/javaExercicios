package br.com.poo.modeli;

public class Gato extends Mamifero{

    public Gato(String nome, int idade, String tipoPelagem){
        super(nome, idade, tipoPelagem);
    }

    @Override
    public void emitirSom(){
        System.out.println(getNome() + ": Miau!");
    }

    public void arranhar(){
        System.out.println(getNome() + ": Arranhando");
    }
}
