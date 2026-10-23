package br.com.poo.modeli;

public class AppMainAnimal {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Rex", 3, "curta", "Vira-lata");

        Gato gato = new Gato("Mimi", 2, "Longa");

        System.out.println("########## Cachorro #########");
        cachorro.apresentar();
        cachorro.mostrarPelagem();
        cachorro.mostrarRaca();
        cachorro.emitirSom();

        System.out.println();

        System.out.println("########## Cachorro #########");
        gato.apresentar();
        gato.mostrarPelagem();
        gato.emitirSom();
        gato.arranhar();
    }
}
