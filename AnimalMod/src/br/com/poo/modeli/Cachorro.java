package br.com.poo.modeli;

public class Cachorro extends Mamifero{

    private String raca;

    public Cachorro(String nome, int idade, String tipoPelagem, String raca){
        super(nome, idade, tipoPelagem);
        this.raca = raca;
    }

    public void mostrarRaca(){
        System.out.println("Raca: " + raca);
        System.out.println("Pelagem: " + tipoPelagem);
    }

    @Override
    public void emitirSom(){
        System.out.println(getNome() + ": Au au!");
    }
}
